# Trapping Rain Water - (LeetCode Solution)
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

# Approach:-
- 2-Way traversal Approach
- Step 1: Initially search for the element greater than 0 on both sides. Let's refer these two elements as leftPillar & rightPillar. If found, count the storage area between it upto the 
  minimum of the either heights.
- Step 2:
  Case 1: In case both the pillars are of same height, find new pillars on both sides with height greater than the previous Pillar respectively.
  Case 2: In case heights of both the pillars differ, find the new Pillar on the side of the previous pillar whose height was less than than that of the other side pillar.
- Step 3: After finding the new Pillar(s), count the storage area between them upto the Pillar with minumum height. While counting the storage, subtract the previously calculated storage 
  which is in the common.
