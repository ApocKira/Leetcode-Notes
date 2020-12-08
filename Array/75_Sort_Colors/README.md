# Sort Colors
three specific charaters in one array to sort them in-place
## Algorithm (One-Pass)
Use two pointers control the one-pass to swap the value in the array.

## Code Implementation
* i for index of the array
* POINTER p1 for number 1:

	swap nums[i] with nums[p1]
	
* POINTER p0 for number 0:

	swap nums[i] with nums[p0]
	
	if p0 < p1: swap nums[i] with nums[p1]
