# Testing Lab Answers
### John Vonelli

** Question 1 **: Three mistakes that we can make when using an array are as follows.  When determining the type of the class, if you would want to have values inserted as a *double* and you would accidentally initialize the array as an *integer*, that would truncate your information so it would fit into the *integer*.  Another mistake that one could make when using an array is that you could mistakenly add information to the wrong variable in the array.  For example, if you were to have values that was supposed to be added to `array[0]`, but accidentally added to `array[1]`, you could distort your variables and information within your array.  Lastly, it is possible that you could use `{}` instead of `[]` when initializing the array, causing a syntax error.

**Question 2**: When making a new `Scoreboard()`, there are no variables and would have no new information besides zero values.  When there is a new instance of `Scoreboard()` with one mutation, that would signify that there would be one value within that instance of the class. So the user would be able to utilize the `isHighScore()`, the `getName()`, the `getScore()`, and the `getNumScores()` methods to recieve information.  When there is a new instance of `Scoreboard()` with multiple mutations, that would mean that the instance of the class would hold multiple values and information.  The user then would be able to utilze the methods mentioned above to access and to understand that information.

**Question 3**: Here are the answers to the testing questions for the `Range` class.

- **1**. A brand new instance of the class would have zero values for the variables, and the class would be ready to be utilized.
- **2**. Besides initializing the constructor `Range()` (which you could initialize to `Range(0,2)`), there are no other mutators that I could manipulate in this class.  Thus, there are no other simplier mutations possible for this class.
- **3**. We can check the other methods to find out other information for the instance of the class.
- **4**. The boundary conditions for the `Range()` constructor are as follows.  The lower boundary (start) of `Range()` is inclusive, while the upper boundary (stop) of `Range()` is exclusive.  So for example, if you initialize `Range(0,2)`, then the range will be valid for 0 through 1.









