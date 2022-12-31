class Solution {
    public String mergeAlternately(String word1, String word2) {
        String str="";
        if(word1.length()<=word2.length())
        {
            int x=0;
            for(x=0;x<word1.length();x++)
            {
                str+=word1.charAt(x);
                str+=word2.charAt(x);
            }
            for(int y=x;y<word2.length();y++)
            {
                str+=word2.charAt(y);
            }
        }
        else
        {
            int x=0;
            for(x=0;x<word2.length();x++)
            {
                str+=word1.charAt(x);
                str+=word2.charAt(x);
            }
            for(int y=x;y<word1.length();y++)
            {
                str+=word1.charAt(y);
            }
        }
        return str;
    }
}
