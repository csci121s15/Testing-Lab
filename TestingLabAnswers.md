## Chris Sheehan
## 2/10/15
## Testing Lab


-



**Question 1:** List three mistakes we can make when using an array.

One mistake when making an array one can forget to encapsulate it, which can cause to many values to be added, or anything else a user could do to mess it up. A second mistake can be declaring the array as the wrong type value which would prevent it from working at all. A third mistake could be to accidently put a double in an array of integers.



**Question 2:** List at least one configuration of a `Scoreboard` for each of the above scenarios.

With a new instance of a class the scoreboard would be empty, with a value of 0 high scores.

With a single mutation such as adding a score the method `Scoreboard` would have 1 value as opposed to the previous amount of zero values. The method `isHighScore` would return true for the entered score being a highscore seeings as there is only one. The list would be changed through `addScore` where the score and name would be added to the appropiate position on the list because it is a high score, being the only score. The method `getName` would return the name of the one high score. Finally the method `getNumScores` would return the value 1 for the number of high scores.

With multiple mutations the method `Scoreboard` would hold the top 10 high scores, which means after 10 recorded scores not every score added will make it onto the array. The method, `isHighScore` will return true if the value entered is one of the top 10 high scores, otherwise it will return false. `addScore` would add a score and name to the appropiate positon on the list if it is higher then the lowest top score. `getName` would return the name of the specified positon on the scoreboard as usual. `getScore` would return the score based on the position you enter as usual. Finally `getNumScores` would return the number of high scores that are in the scoreboard.



**Question 3:** Answer the "Testing Questions" descripted in the previous section.  

A new instance would have the inputed start and stop values. `contains` that would return true if the value you give it is equal to or greater than the first value, and less than the second. `getWidth` would give you the start and stop values. `getMin` would return the smaller of the two values defining the range, would would be the start value, `getMax` would return the larger of the two values which would be the stop value. `Range intersection` would return a new range if the number you input overlaps with your first range and a second range.

There are no mutator methods in this class. 

You can find out the largest number, smallest number and the boundaries of the range.

When you pass the range something other than a double.




