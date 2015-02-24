#Testing Lab
##Andrew Reed

**Question 1:** One mistake that can be made when making an array is trying to fit two or more data types into an array (which has a specific data type) like trying to put a score and a name (string) in the same array. Another forgetting order the scores in the array from greatest to least. A third problem that might arise is, if using parallel rays instead of an object to record the scores and names, then one might forget to order both arrays at the same time, leading to the scores and the names to be out of order, thus the data being incorrect.

**Question 2:** If a new scoreboard were to be created, then it would simply be a scoreboard with no values in it. If a single mutation were to occur to the scoreboard, then the scoreboard would be a scoreboard with one value and one name in it. If multiple mutations were to occur then the scoreboard would have multiple scores (with a maximum of 10 scores) each attached with a corresponding name, and ordered by top score to lowest score.

**Question 3:** A brand new instance of the class would be a range of [0, 0), which would be empty. There is no mutation being done in this class, however the interesting thing that this class can do is create a new range based on where two ranges start and end (where they intersect). All other methods are call methods. The boundary conditions of this lab are any two numbers so long as they aren't equal to each other, if they are they will return an empty range.

**Optional Question:** After running a 1,000,000,000 trial Monte Carlo simulation, I found that the probability of ranges intersecting when all points of the ranges are randomly generated between 0 and 1 is 0.666670703. The average length of these intersections was equal to 0.20001405957047122.