class Solution {
    public String reformatDate(String date) {
String year[]=new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String[] splited = date.split(" ");
        String str="";
        str+=splited[2];
        str+='-';
        for(int x=0;x<year.length;x++)
        {
            if(year[x].equals(splited[1]))
            {
               if(x<9)
               {
                  str+='0';
               }
                str+=(x+1);
            }
        }
        str+='-';
        char ch[]=date.toCharArray();
       if(!(ch[1]>='0' && ch[1]<='9'))
       {
          str+='0';
       }
       
        for(int x=0;x<ch.length;x++)
        {
            if(!(ch[x]>='0' && ch[x]<='9'))
            {
                break;
            }
            else{
                str+=ch[x];
            }
        }
        return str;
    }
}
