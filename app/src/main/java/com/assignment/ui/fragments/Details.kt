package com.assignment.ui.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.transition.TransitionInflater
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.gson.Gson
import com.assignment.databinding.ArticleDetailsBinding
import com.assignment.model.ResultsItem
import com.assignment.ui.interfaces.BackClick
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class Details : Fragment(), BackClick {

    /**
     * VARIABLE DECLARATIONS
     */
    private lateinit var binding: ArticleDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ArticleDetailsBinding.inflate(layoutInflater)
        val animation = TransitionInflater.from(requireContext()).inflateTransition(android.R.transition.move)
        sharedElementEnterTransition = animation
        sharedElementReturnTransition = animation
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    /**
     * SET DATA FROM ARGUMENTS
     */
    private fun init() {
        binding.click = this
        binding.item = Gson().fromJson(arguments?.getString("result", null), ResultsItem::class.java)
    }

    override fun onBack() {
        findNavController().navigateUp()
    }

    override fun onArticle(url: String?) {
        url?.let {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(it))
            startActivity(browserIntent)
        }
    }
}