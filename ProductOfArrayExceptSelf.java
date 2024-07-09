class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int a=1;
            for(int j=0;j<n;j++)
            {
                if(i==j)continue;
                a*=nums[j];
            }
            ans[i]=a;
        }
        return ans;
    }
}
