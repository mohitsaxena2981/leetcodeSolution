class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ll=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isSelf(i)){
                ll.add(i);
            }
        }
        return ll;
    }
    public boolean isSelf(int n){
        int num=n;
        while(num!=0){
            int rem=num%10;
            num/=10;
            if(rem==0 || n%rem!=0) return false;
        }
        return true;
    }
}
