class Solution {
    public int percentageLetter(String s, char letter) {
        int c=0;
        for(int x=0;x<s.length();x++)
        {
            if(s.charAt(x)==letter)
            {
                c++;
            }
        }
        double res=(double)((double)c/s.length());
        return ((int)(res*100));
        
    }
}
