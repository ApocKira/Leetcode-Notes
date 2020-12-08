class sort_colors {
    public void sortColors(int[] nums) {
        // set a pointer for number 0
        int p0 = 0;
        // set a pointer for number 1
        int p1 = 0;
        
        // get the size of the nums
        int size = nums.length;
        
        //set a pointer for whole array
        int i = 0;
        
        //set temp value
        int temp;
        while (i < size){
            if (nums[i] == 0){
                temp = nums[i];
                nums[i] = nums[p0];
                nums[p0] = temp;
                if (p0 < p1){
                    temp = nums[i];
                    nums[i] = nums[p1];
                    nums[p1] = temp;
                }
                p0++;
                p1++;
            } else if (nums[i] == 1){
                temp = nums[i];
                nums[i] = nums[p1];
                nums[p1] = temp;
                p1++;
            }
            i++;
        }
        
    }
}