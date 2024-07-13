class CommonLongestPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0)
        {
            return "";
        }
        String prefix=strs[0];
        int len=prefix.length();

        for(int i=1;i<strs.length;i++)
        {
            String str1=strs[i];
            while(len>str1.length() || !prefix.equals(str1.substring(0,len)))
            {
                len--;
                if(len==0)
                {return "";}
                prefix=prefix.substring(0,len);
            }
        }
        return prefix;
    }
}
