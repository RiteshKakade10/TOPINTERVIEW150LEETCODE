class RemoveDuplicatesFromArray{
    public int removeDuplicates(int[] nums) {
        int in=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                nums[in]=nums[i];
                in++;
            }
        }
        return in;
    }
}
