###Testing Lab
***Question 1:*** When using an array, the coder could only reference one specific index within a `for` loop, therefore only altering that one index throughtout the loop. Also, the coder could force the array to be comprised of `ints` but then later on, uses the array in a method that requires it to comprised of `doubles`. Lastly, the coder could forget that the first element of the array is index 0, the second is index 1 and so on, which causes the whole array to be off when the coder decides to implement it in a method that is contingent on the indices of the array. 

***Question 2:***
A new instance of the `Scoreboard` class would have no scores or names. An instance with a single mutation would have one name and one score while an instance with multiple mutators would have the same amount of names and scores as the number of mutators.

***Question 3:***
A brand new instance of the `Range` class would just have the start and stop parameters. The simplest mutation possible is the `getWidth()` method since it is essentially the only mutator taking place in the class. You can also use this class to determine the distance between two loacations by implementing its methods into another class. The boundary conditions for the class are the min and max which are initialized as parameters. 