import java.util.*;
class ReverseWordsInString{
    public String reverseWords(String s) {
        StringBuilder str1=new StringBuilder();
        String arr1[]=s.split(" +");

        for(int i=arr1.length-1;i>=0;i--)
        {
            str1.append(arr1[i]);
            str1.append(" ");
        }
        return str1.toString().trim();
    }
}
