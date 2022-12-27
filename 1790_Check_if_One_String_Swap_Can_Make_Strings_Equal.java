class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length())
        {
            return false;
        }
        int f1[]=new int[26];
        int f2[]=new int[26];
        int c=0;
        for(int x=0;x<s1.length();x++)
        {
            if(s1.charAt(x)!=s2.charAt(x))
            {
                c++;
            }
            f1[(int)(s1.charAt(x)-97)]+=1;
            f2[(int)(s2.charAt(x)-97)]+=1;
        }
        for(int x=0;x<26;x++)
        {
            if(f1[x]!=f2[x])
            {
                return false;
            }
        }
        if(c==2 || c==0)
        {
            return true;
        }
        return false;
        
    }
}
