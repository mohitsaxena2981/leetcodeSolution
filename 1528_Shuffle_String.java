class Solution {
    public String restoreString(String s, int[] indices) {
        char ch[]=new char[s.length()];
        for(int x=0;x<s.length();x++)
        {
            ch[indices[x]]=s.charAt(x);
        }
        s="";
        for(int x=0;x<ch.length;x++)
        {
            System.out.println(ch[x]+"hi");
            s+=ch[x];
        }
        return s;
        
    }
}
