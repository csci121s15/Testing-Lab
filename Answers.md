```
Josh Russett
CSCI II Lab
10 Feb 2015
```
#Testing Lab Answers
####Question 1:
1. Declaring an array of incorrect type or length.
2. Using the wrong number to reference a particular position on the array (i.e. I want to reference the fourth position so I accidentally use array[4] instead array[3]).
3. Trying to put incompatible types into an array (i.e. trying to store a double in an integer array).

####Question 2:
* In a new instance of the class, there should only be a newly created array. The numScores variable should be 0.
* In an instance with a single mutation, there should be an array with one score and the score's corresponding name. The numScores variable should be 1.
* In an instance with multiple mutations, there should be, at a max, 10 different scores and the score's corresponding names in a sorted order (ascending or decending). Also, the scores and names within the array should only be in the array if they were already compared to the rest of scores in the the array and confirmed to be  higher than at least one of the scores in the array (with that lower value being replaced or moved). The numScores variable should be reflective to how many times the Scoreboard was mutated, so the value should be between 2 and 10.


####Question 3:
1. A brand new object would would have a start and a stop value, that's it.
2. This class does not contain any mutator methods.
3. We can query whether or not a a value lies within the range, query the length/width of a range, query the min/max values that define the range, and find out if a given range overlaps with the current range.
4. The boundary condition of this class is when something other than a double is passed to the range.




