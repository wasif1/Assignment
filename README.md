

# NY-Times Assignment

# LOW LEVEL DESIGN

- Prepare Architectural Diagrams
  - Show all the features of the application e.g.
    - Article Listing Page
    - Article Details Page
    - Main Article Source Page 

- API details
    - List of Articles 
    - Article Details 
    - Update Article
    - Delete Article

- Logging and Exception Handling
  - Add logs on API Response to track the issues if any
  - Use try catch on each function to handle the exception and avoid crashes

- Database Design
  - Define all the required tables and add relations between the tables. For the current requirement document only one table we needed which is showing below:

| Article Table |
| ------------- |
| ArticleID - PK(Unique Identifier) |
| Title |
| Description |
| Image |
| Publish Time |
| Author |

- Technical specifications (Pseudo Code)
    - Open the App
    - Call the Articles API to load Articles
    - On Success API Response populate data into UI for user 
    - On Failure API Response Show Error msg 
    - On Article click goto Details page and Call Detail api to fetch Specific Article Details


## Demo Application 

https://user-images.githubusercontent.com/22557416/234655659-97dced89-a6d0-4816-9e1e-e1bd5e4f9711.mp4


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

- Open Project Package which is 'Assignment'
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










