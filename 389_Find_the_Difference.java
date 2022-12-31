class Solution {
    public char findTheDifference(String s, String t) {
        int s1[]=new int[26];
        int t1[]=new int[26];
        char ch='a';
        for(int x=0;x<s.length();x++)
        {
            s1[(int)(s.charAt(x)-97)]++;
        }
        for(int x=0;x<t.length();x++)
        {
            t1[(int)(t.charAt(x)-97)]++;
        }
        for(int x=0;x<26;x++)
        {
            if(s1[x]!=t1[x])
            {
                ch=(char)(x+97);
            }
        }
        return ch;
        
    }
}
