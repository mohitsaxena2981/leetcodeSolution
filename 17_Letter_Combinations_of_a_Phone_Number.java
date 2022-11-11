class Solution {
    static String key[]=new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> list=new ArrayList<>();
        if(digits.length()==0)
        {
            return list;
        }
        printcombination(digits,"",list);
        return list;
    }

    public static void printcombination(String str,String ans,List<String> list)
    {
        if(str.length()==0)
        {
            list.add(ans);
            return;
        }
        char ch=str.charAt(0);
        String printpress=key[ch-48];
        for(int x=0;x<printpress.length();x++)
        {
            printcombination(str.substring(1),ans+printpress.charAt(x),list);
        }
    }
}
