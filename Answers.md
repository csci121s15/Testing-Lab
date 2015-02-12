# CSC1 121 Hailey Kester 2/12/15
##Testing lab

**Question1:** List three mistakes we can make when using an array.

**Answer1:** Three mistakes that can be made using using an array would be that you can forget to use an index in order to store the values into an array, forgetting that an array always starts at 0 instead of 1, and lastly you /home/kester/cs121/Testing-Lab/Answers.mdcan try to store a type that is not compatible with the array type; which will not working because the types need to be consistant. 

**Question 2:** List at least one configuration of a `Scoreboard` for each of the above scenarios.

**Answer 2:** One configuration of a `Scoreboard` for each of the above scenarios would be for a new instance of the class, there would be an empty array because there is no values inputed yet.  With an instance with a single mutation, the configuration would be one item added to beginning of score array and adding array.  For an instance with multiple mutations, there would be a mutliple of scores in the array and they would be in array order. 

**Question 3:** Answer the "Testing Questions" descripted in the previous section.

**Answer 3:** What would a brand new instance of the class look like?  A brand new instance of the class would look like a new `range` set to 0, which would set a new `range` array. 
What is the simplest mutation possible for the class?  The `range` class does not have any mutators so there is no simplest mutation possible for the class.
What else can we do to an instance of the class? For the range class we can compute the min and max of the range and check to see if they are the starting and stopping point, we can also check the width of the range to see the difference between the min and the max.
What are the boundary conditions for the class?  The boundary conditions for the class would be the `getMin` and `getMax` because they determine our starting and stoping point of the range.