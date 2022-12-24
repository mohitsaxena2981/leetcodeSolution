class Solution {
    public double average(int[] salary) {
        int max=0;
        int min=0;
        int sum=0;
        for(int i=0;i<salary.length;i++){
            if(salary[i]>max){
                max=salary[i];
            }
        }
        min=max;
                for(int i=0;i<salary.length;i++){
            if(salary[i]<min){
                min=salary[i];
            }
        }
            for(int i=0;i<salary.length;i++){
            sum+=salary[i];
        }
        int res=sum-min-max;
        double res1=(double)((double)res/(salary.length-2));
        System.out.println(res1);
        return res1;
    }
}
