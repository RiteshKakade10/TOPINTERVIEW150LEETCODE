class ZigzagConversion {
    public String convert(String s, int numRows) {
        String[] str1=new String[numRows];
        for(int i=0;i<numRows;i++)
        {
            str1[i]= "";
        }
        int i=0;
        while(i<s.length())
        {
            for(int index=0;index<numRows && i<s.length();index++)
            {
                str1[index]+=s.charAt(i++);
            }
            for(int index=numRows-2;index>0 && i<s.length();index--)
            {
                str1[index]+=s.charAt(i++);
            }
        }
        String str2="";
        for(String ss:str1)
        {
            str2+=ss;
        }
        return str2;
    }
}
