class IsSubSequence {
    public boolean isSubsequence(String s, String t) {
        int count=0;
        int n=s.length();
        int i=0;
        int j=0;
        if(s.length()==0)
        {return true;}

        while(i<s.length() && j<t.length())
        {
            if(s.charAt(i)==t.charAt(j))
            {
                i++;
                j++;
            }else{
                j++;
            }
        }
        if(i == n)
        {
            return true;
        }
        return false;
    }
}
