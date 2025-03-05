class main{
  public static int SingleNumber(int nums[]){
    int ele=0;
    for(int i=0;i<nums.length;i++){
      ele^=nums[i];
    }
  }
  return ele;
}
