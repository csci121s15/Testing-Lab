# John Ferguson
# Testing Lab   2/12/15

>**Question 1:** List three mistakes we can make when using an array.

**Answer 1:**  Three ways we can makes mistakes when using an array is people use length in arrays, arrays already know their length.  The a second common mistake is that the array always starts at 0 not 1.  A third thing people mistake is storing a type that isn't compatible with the array type, it has to be the same type in the array. 

>**Question 2:** List at least one configuration of a Scoreboard for each of the above scenarios.

**Answer 2:** For a new instance of the class, a configuration could be Class.newInstance(). The arrays are empty in the new class. An instance with a single mutation would increment the array by 1 at the begging of the score array and string array. An instance with multiple mutations depends what the scores are but there will be multiple scores in sorted order in the score array and the string array.

>**Question 3:** Answer the "testing questions" descripted in the previous section.

**Answer 3:** What would a brand new instance of the class look like? A brand new instance of the class for the range would look like a new range in the array set at 0 to the range we want. 

What is the simplest mutation possible for the class? The simplest mutation for the class would be to increment the range by 1.

What else can we do to an instance of the class?  Something else we can do to the instance of the class could be to get the Min and the Max.

What are teh boundary conditions for the class? The boundary conditions for the class are also the min and max because they determine the starting the stopping points.