class Solution {
    public String interpret(String command) {
        String str="";
        for(int x=0;x<command.length();x++)
        {
            if(command.charAt(x)=='(' && command.charAt(x+1)==')')
            {
                str+="o";
                x+=1;
            }
            else if(command.charAt(x)=='(' && command.charAt(x+1)=='a' && command.charAt(x+2)=='l' && command.charAt(x+3)==')')
            {
                str+="al";
                x+=3;
            }
            else
            {
                str+=command.charAt(x);
            }
            
        }
        return str;
        
    }
}
