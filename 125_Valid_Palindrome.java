class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='0' && s.charAt(i)<='9')){
                sb.append(Character.toLowerCase(s.charAt(i)));
                
            }
        }
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)!=sb.charAt(sb.length()-1-i)){
                return false;
            }
        }
        return true;
        
    }
}
