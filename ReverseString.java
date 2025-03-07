class reverseNumber{
  public static void ReverseNum(char s[]){
      int start=0,end=s.length()-1;
      while(start<end){
        int temp=s[start];
        s[start]=s[end];
        s[end]=temp;
      }
  }

}
