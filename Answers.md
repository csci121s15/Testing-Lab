**Question 1** There common mistakes that you can make with arrays are:

	-trying to access an index that doesn't exit
	-forgetting that arrays start at index 0
	-trying to store different types in an array
	
	
**Question 2** In each of the scenarios the instance variables associated with the object will contain different data.

in a new instance of the class: the arrays holding the scores and the names of the players will be empty, so if you try to query data you will get 0 for the scores and null for the String objects.

with a single mutation: the added score will be added to the score array and the name will be added in the name array.

with multiple mutations: the integers or Strings in the array will depend on the parameters being passed. If there are more than 10 mutations not all the data could be shown in the array because some could be bumped down to make room for others.

**Question 3** 

in a new instance of the class: the two instance variables "start" and "stop" would be initialized in the constructor.

There are no mutations in the range class so i can't really answer this question.

The range class can query data about the range set up in the constructor. This includes returning whether or not the value contains a range, the width, the min, the max, and an intersection between this range and another range.

the boundary conditions are the range's min and max


	