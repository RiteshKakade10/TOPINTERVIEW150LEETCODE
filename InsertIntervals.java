class InsertIntervals {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> l1=new ArrayList();

        for(int[] in:intervals)
        {
            if(in[1] < newInterval[0])
            {
                l1.add(in);
            }else if(newInterval[1] < in[0])
            {
                l1.add(newInterval);
                newInterval=in;
            }else{
                newInterval[0]=Math.min(newInterval[0],in[0]);
                newInterval[1]=Math.max(newInterval[1],in[1]);
            }
        }
        l1.add(newInterval);


        return l1.toArray(new int[l1.size()][]);
    }
}
