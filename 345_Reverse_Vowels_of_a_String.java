class Solution {
    public String reverseVowels(String s) {
        char ch[]=s.toCharArray();
        int low=0;
        int high=s.length()-1;
        while(low<=high)
        
        {
            if(ch[low]=='a'||ch[low]=='e'||ch[low]=='i'||ch[low]=='o'||ch[low]=='u'||ch[low]=='A'||ch[low]=='E'||ch[low]=='I'||ch[low]=='O'||ch[low]=='U')
            {
                while(true)
                {
                    if(ch[high]=='a'||ch[high]=='e'||ch[high]=='i'||ch[high]=='o'||ch[high]=='u'||ch[high]=='A'||ch[high]=='E'||ch[high]=='I'||ch[high]=='O'||ch[high]=='U')
                        break;
                    high--;
                }
                char temp=ch[low];
                ch[low]=ch[high];
                ch[high]=temp;

            }
            else if(ch[high]=='a'||ch[high]=='e'||ch[high]=='i'||ch[high]=='o'||ch[high]=='u'||ch[high]=='A'||ch[high]=='E'||ch[high]=='I'||ch[high]=='O'||ch[high]=='U')
            {
                while(true)
                {
                    if(ch[low]=='a'||ch[low]=='e'||ch[low]=='i'||ch[low]=='o'||ch[low]=='u'||ch[low]=='A'||ch[low]=='E'||ch[low]=='I'||ch[low]=='O'||ch[low]=='U'

)
                        break;
                    low++;
                }
                char temp=ch[low];
                ch[low]=ch[high];
                ch[high]=temp;

            }
            low++;
            high--;
        }
        String str="";
        for(int x=0;x<s.length();x++)
        {
            str+=ch[x];
        }
        return str;
        
    }
}
