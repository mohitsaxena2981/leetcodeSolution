class Solution {
    public String convertToBase7(int num) {
        String str="";
        if(num<0)
        {
            str+='-';
        }
        int n=Dec_to_Any(Math.abs(num));
        str+=n;
        return str;
        
    }
    public static int Dec_to_Any(int num)
	{
	    int db=7;
		int ans = 0;
		int mul = 1;
		while (num > 0) {
			int rem = num % db;
			ans = ans + rem * mul;
			mul = mul * 10;
			num = num / db;

		}
		return ans;
	}
}
