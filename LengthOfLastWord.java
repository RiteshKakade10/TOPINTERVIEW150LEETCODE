class LengthOfLastWord{
    public int lengthOfLastWord(String s) {
        String[] ch=s.split("\\s+");
        
        return ch[ch.length-1].length();
    }
}
