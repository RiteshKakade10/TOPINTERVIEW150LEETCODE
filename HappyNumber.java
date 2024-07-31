class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> set1=new HashSet<>();
        while(!set1.contains(n))
        {
            set1.add(n);
            int sum=0;
            while(n!=0)
            {
                int temp=n%10;
                sum+=temp*temp;
                n=n/10;
            }
            n=sum;
        }
        return n==1;
    }
}
