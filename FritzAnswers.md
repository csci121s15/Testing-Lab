## Testing Lab Jacob Fritz

**Question 1:** List three mistakes we can make when using an array.
	1. Using 1 as the first index, not 0.
	2. Going out of bounds when looping through an array.
	3. Forgetting to create the array - only declaring it (int[ ] nums;).
	
**Question 2:** List at least one configuration of a Scoreboard for each of the scenarios below.
	a) A new instance of the class.
	
		```Scoreboard sb = new Scoreboard();```
	
	b) An instance with a single mutation.
	
		```sb.addScore(5);```
	
	c) An instance with multiple mutations.
	
		```sb.addScore(String name, int score)```

**Question 3:** Answer the "Testing Questions" descripted in the previous section.
	a) What would a brand new instance of the class look like?
	
		```Range r = new Range(0.0,2.0);```
		
	b) What is the simplest mutation possible for the class?
		```getMin()``` or ```getMax()```
		
	c) What else can we do to an instance of the class?
		Check to see if the range contains a value.
		Get the width of the range.
		Get the minimum number found in the range.
		Get the maximum number found in the range.
		Determine if a range intersects with another range.
		
	d) What are the boundary conditions for the class?
		The values entered must be doubles, and the values must be known when the class is created, as they cannot be changed later.