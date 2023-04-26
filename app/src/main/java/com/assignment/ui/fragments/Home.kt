package com.assignment.ui.fragments

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.assignment.R
import com.assignment.Utills.Util
import com.assignment.databinding.NytimesMainBinding
import com.assignment.model.ResultData
import com.assignment.model.ResultsItem
import com.assignment.ui.adapters.NYTimesAdapter
import com.assignment.ui.interfaces.Callback
import com.assignment.ui.viewmodel.NYTimesViewModel
import com.google.gson.Gson
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class Home : Fragment(), Callback {

    /**
     * VARIABLE DECLARATIONS
     */
    private val viewModel: NYTimesViewModel by viewModels()
    private lateinit var binding: NytimesMainBinding
    private lateinit var layoutManager: LinearLayoutManager
    private var nyTimesAdapter: NYTimesAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = NytimesMainBinding.inflate(layoutInflater)
        binding.loading = true
        init()
        setListeners()
        return binding.root
    }

    /**
     * LISTENERS
     */
    private fun setListeners() {
        binding.refresh.setOnRefreshListener {
            binding.loading = false
            binding.refresh.isRefreshing = false
        }
        activity?.let {
            viewModel.response.observe(it) {
                run {
                    when (it) {
                        is ResultData.Success -> {
                            binding.loading = false
                            nyTimesAdapter?.submitList(it.data?.results)
                            if (it.data?.results?.size == 0) {
                                binding.noRecord = true
                            }
                        }
                        is ResultData.Loading -> {
                            binding.loading = true
                        }
                        is ResultData.Error -> {
                            binding.loading = false
                            Toast.makeText(context, it.message, Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }
        }
    }

    /**
     * INITIALISE THE ADAPTER
     * SET THE ADAPTER TO THE RECYCLER VIEW
     */
    private fun init() {
        layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        nyTimesAdapter = NYTimesAdapter(this)
        binding.recyclerView.apply {
            layoutManager = layoutManager
            adapter = nyTimesAdapter
        }
        if (if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                Util.isOnline(requireContext())
            } else {
                true
            }
        ) {
            viewModel.getLatestArticles()
        }
    }

    override fun onDetails(view: View, item: ResultsItem?) {
        val extras = FragmentNavigatorExtras(view to "large_image")
        val bundle = Bundle()
        bundle.putString("result", Gson().toJson(item))
        findNavController().navigate(R.id.details, bundle, null, extras)
    }
}