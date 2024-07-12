class IntegerToRoman {
    public String intToRoman(int num) {
        int integer1[]={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String roman[]={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        StringBuilder str1=new StringBuilder();

        for(int i=integer1.length-1;i>=0 && num>0;i--)
        {
            while(num>=integer1[i])
            {
                num-=integer1[i];
                str1.append(roman[i]);
            }
        }
        return str1.toString();
    }
}
