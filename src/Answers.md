# Answers to Testing Lab

###Carly Thorpe
#### 2/10/15


**Question 1:** Three mistakes you can make when using an array are misinterpreting what the position is in an array (Ex: If the array is histogram[4], you could make the mistake of thinking it is in index 4), you can use doubles and ints at the wrong time, or forget to keep them consistent, and passing a parameter of the wrong type to a method.

**Question 2:** For a new instance of a class, one configuration of a `Scoreboard`  would include both `getScore()` and `getAverage()` methods. This `Scoreboard` would be empty. `getScore()` would return nothing because there are no positions that have a score yet and `getAverage()` would be 0.0 because there are no scores added to the scoreboard as soon as a new instance is created. In an instance with a single mutation, `Scoreboard` would have `getScore()` with a parameter passed and would return the score that is in that specific position. It would only have one postition because it was only mutated once. `getAverage()` would return whatever that score in that postition is because it is the sum/num of mutations and there is only one mutation to the method. In an instance with multiple mutations, `Scoreboard` would have multiple scores and when `getScore()` is called with a parameter, it would return the score in that postition. `getAverage()` would change depending on how many mutations are made to the instance.

**Question 3:** Testing Questions for `Range`

1. A brand new instance of the `Range` class would be empty. There are no values added to the class so there would be no methods.
2. There would be no way to simply mutate the instance. All of the methods in the class `Range` are query methods, so you can only ask questions of them. The range is established in the constructor and it can't change unless you create a new instance. You can only test the intersection method. This is because you can change the range that you are comparing the established range to and get different range answers depending on the "other" range you compare it to.
3. The only other thing you can do to the instance of the class is call the other methods and have them return a value. The rest of the methods are query methods so you can only ask questions of them. There's no more mutator methods to change the instance. 
4. The boundary conditions of the class are that the range is inclusive at the lower starting value and exclusive at the upper value. Where in the `Average` class, the boundaries depended on if count was equal to zero or not. If count was 0, it returned 0. But if count was >0, it would divide sum by count. 


