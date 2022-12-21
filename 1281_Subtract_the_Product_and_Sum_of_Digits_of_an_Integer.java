class Solution {
    public int subtractProductAndSum(int n) {
        long prd=1;
        long sum=0;
        while(n>0){
            int res=n%10;
            prd*=res;
            sum+=res;
            n/=10;
        }
        return ((int)(prd-sum));
    }
}
