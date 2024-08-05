class  SummaryRanges{
    public List<String> summaryRanges(int[] nums) {
            List<String> l1=new ArrayList<>();

            int n=nums.length;

            for(int i=0;i<n;i++)
            {
                int start=nums[i];
                while(i+1 < n && nums[i+1] - nums[i] ==1)
                {
                    i++;
                }
                    if(start != nums[i])
                    {
                        l1.add("" + start + "->" + nums[i]);
                    }else{
                        l1.add("" +start);
                    }
            }
            return l1;
        }
    }
