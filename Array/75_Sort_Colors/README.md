Sort Colors:
One-pass algorithm to sort three specific integers in the array.
Use two pointers:
p1 for number 1
	swap nums[i] with nums[p1]
p0 for number 0
	swap nums[i] with nums[p0]
	if p0 < p1
		swap nums[i] with nums[p1]