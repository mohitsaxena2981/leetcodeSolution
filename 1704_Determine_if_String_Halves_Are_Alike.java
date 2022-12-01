class Solution {
    public boolean halvesAreAlike(String s) {
        
        String str=s.substring(0,(s.length()/2)).toLowerCase();
        String str1=s.substring((s.length()/2)).toLowerCase();
        if(str.length()!=str1.length())
        {
            return false;
        }
        int co1=0;
        int co2=0;
        for(int x=0;x<s.length()/2;x++)
        {
            if(str.charAt(x)=='a'||str.charAt(x)=='e'||str.charAt(x)=='i'||str.charAt(x)=='o'||str.charAt(x)=='u')
            {
                co1++;
            }
            if(str1.charAt(x)=='a'||str1.charAt(x)=='e'||str1.charAt(x)=='i'||str1.charAt(x)=='o'||str1.charAt(x)=='u')
            {
                co2++;
            }
        }
        if(co1==co2)
        {
            return true;
        }
        return false;
        
    }
}
