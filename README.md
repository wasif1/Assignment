

# NY-Times Assignment

## How to Build and Run the code? Follow the steps given below :

- COPY URL : https://github.com/wasif1/Assignment.git
- Open Android Studio.
- Open project with VCS.
- Paste the copied URL.
- Click the Clone option and wait until the project load completely.
- Once the project loaded, connect the testing device with computer using USB cable or ADB Wifi (plugin)
- Once the device is connected you will see the device name on the top button panels below the project name.
- Then click on the RUN APP button on the right side of the connected device name.
- After few minutes the Application will install in your device then you can check it properly.

## How to Run the Test Cases

- Open Project Package which is 'NYTimesApp'
- Goto APP Package
- GOTO SRC Package, now you will see three packages which is androidTest(UI Test Cases Package), main(Main Application code Package), test(Unit test Cases Package)
- Goto the TEST Package now you will see the multiple test case methods, and each method have their own play button on the left hand panel, once you click on play button you will see the options like 'Run ExampleTest' and 'Run ExampleTest with coverage report'


## TECH Stack

- MVVM
- Clean Architecture
- Kotlin Coroutines
- Dagger Hilt
- Retrofit
- ViewBinding
- DataBinding
- Material UI
- Navigation Components


## Languages
- Kotlin

## Flavors
- Staging
- Production


## Code Structure

| Package Details |  |
| ------------- | ------------- |
| Di(Dependency Injection) | Network classes for Api Requests |
| Model | Data classes for Api Response parsing |
| Network | Api End Points |
| UI | UI of the Application |
| Repository | Communicate between network & usecase |
| Usecase | Communicate between viewModel & Repository |
| Utils | Singleton/Helper classes |










