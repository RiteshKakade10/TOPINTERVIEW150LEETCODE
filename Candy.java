class Candy {
    public int candy(int[] ratings) {
        int candy1=0;
        for(int i=0;i<ratings.length-1;i++)
        {
            if(ratings[i]>ratings[i+1])
            {
                candy1+=ratings[i]+1;
            }
            else{
                candy1+=ratings[i+1];
            }
            if(ratings[i]==0)
            {
                candy1+=1;
            }
            
        }
        return candy1;
    }
}
