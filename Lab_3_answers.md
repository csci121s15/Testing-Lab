CS Lab 2/12/2015 **Wilson Silverio**

**Question 1** 

List three mistakes we can make when using an array.

**a)** Reference the wrong position of the array.

**b)** Can't use multiple types in an array.

**c)** While looping the array, making sure that we have conditions that are logical to solve the problem.

**Question 2:** 

List at least one configuration of a `Scoreboard` for each of the above scenarios.

**a)** With a new instance of the class, it would use a reference to `Scoreboard`. No value(s) are in either array. 

**Instance of a class:**

scores = [0,0,0,0,0,0,0,0,0,0]

names = null

**b)** An instance with a single mutation would change `Scoreboard` and `String` array. 

**Instance with a single mutation:**

scores = [1,0,0,0,0,0,0,0,0]

names = ["Professor Sommer"]

**c)** An instance with multiple mutations would change to `Scoreboard` and `String` array multiple times, in sorted order (hightest to lowest).

**Instance with multiple mutations:**

scores = [1,0,0,0,0,1,0,0,0,0]

names = ["Professor Sommer","Professor Coleman"]

**Question 3:** Answer the "Testing Questions" descripted in the previous section.

**New instance of the class:**

max: 10.0

min: 0.0

**Best mutation:**

No mutator methods

**What else can we do with the class:**

Ask it to return its values

**Boundary conditions for the class:**

min, max
