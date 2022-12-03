class Solution {
    public String frequencySort(String s) {
      
        int ch[]=new int[123];
        for(int x=0;x<s.length();x++)
        {
            ch[(int)(s.charAt(x))]++;
        }
        int idx=0;
        String str="";
        int a=0;
        for(int x=0;x<123;x++)
        {
            a=0;
            for(int y=0;y<123;y++)
            {
                if(ch[y]>a)
                {
                    idx=y;
                    a=ch[y];
                }
            }
            for(int z=0;z<ch[idx];z++)
            {
                str+=(char)(idx);
            }
           ch[idx]=0;
            idx=0;
            
           
        }
        return str;
    }
}
