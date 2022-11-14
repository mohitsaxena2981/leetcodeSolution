class Solution {
    public boolean isAnagram(String s, String t) {
        int arr[]=new int[26];
        int brr[]=new int[26];
        for(int x=0;x<s.length();x++)
        {
            arr[(int)(s.charAt(x)-97)]++;
        }
        for(int x=0;x<t.length();x++)
        {
            brr[(int)(t.charAt(x)-97)]++;
        }
        for(int x=0;x<26;x++)
        {
            if(arr[x]!=brr[x])
            {
                return false;
            }
        }
        return true;
    }
}
