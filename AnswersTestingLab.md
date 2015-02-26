**Question 1:** Arrays start at zero, if you forget this your counting will be off.
Forgetting to initialize objects in arrays. An array in java is really an object reference,
creating an array with new will result in an empty reference. It is also important to keep 
in mind that all elements in an array are set to null. In order to have a complete array,
each element must be linked to a real object reference. In java, an array can not be of
mixed types. When looping over arrays you have to be careful to remember to set the 
condition when i is less than length. 

**Question 2:** 
For a new instance of the class, it will look empty meaning there is no values in the two
arrays. It will have the arrays but we haven't put anything in them yet. 

For an instance of a single mutation, it will have added one item to the start of the 
score and string array, everything else will be blank.

For an instance with multiple mutations, will depend on scores, will be in sorted order. 

**Question 3:** 
What would a brand new instance of class look like? 
It would be empty because we haven't assigned values yet.

What is the simplest mutation possible for the class? 
There is actually nothing that can be mutated.

What else can we do to an instance of the class?


What are the boundary conditions for the class? 
Boundary conditions are what is right on the edge of being correct. This is most likely 
to be where mistakes happens. Currently it is at 0 for testing. 