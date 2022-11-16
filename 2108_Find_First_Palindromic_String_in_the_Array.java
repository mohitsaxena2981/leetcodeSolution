class Solution {
    public String firstPalindrome(String[] words) {
        String str="";
        for(int x=0;x<words.length;x++)
        {
            String s=words[x];
            int si=0;
            int ei=s.length()-1;
            boolean flag=true;
            while(si<=ei)
            {
                if(s.charAt(si)==s.charAt(ei))
                {
                    si++;
                    ei--;
                }
                else
                {
                    flag=false;
                    break;
                }
            }
            if(flag==true)
            {
                str=words[x];
                break;
            }
        }
        return str;
        
    }
}
