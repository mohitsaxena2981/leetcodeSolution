class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int ch[]=new int[26];
        for(int x=0;x<magazine.length();x++)
        {
            ch[(int)(magazine.charAt(x)-97)]++;

        }
        for(int x=0;x<ransomNote.length();x++)
        {
            if(ch[(int)(ransomNote.charAt(x)-97)]==0)
            {
                return false;
            }
            ch[(int)(ransomNote.charAt(x)-97)]--;
            
            
        }
        return true;
    }
}
