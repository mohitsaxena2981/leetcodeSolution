class Solution {
    public boolean detectCapitalUse(String word) {
        int first=0;
        int full=0;
        if(word.charAt(0)>='A'&& word.charAt(0)<='Z')
        {
            first=1;
        }
        for(int x=1;x<word.length();x++)
        {
            if(word.charAt(x)>='A'&& word.charAt(x)<='Z')
            {
                full++;
            }
        }
        if(full==0&&first==1)
        {
            return true;
        }
        else if(full==word.length()-1 && first==1)
        {
            return true;
        }
        else if(first==0 && full==0)
        {
            return true;
        }
        return false;
    }
}
