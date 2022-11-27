class Solution {
    public int fib(int n) {
        if(n==1)
        {
            return 1;
        }
        if(n==2)
        {
            return 1;
        }
        if(n==3)
        {
            return 2;
        }
        return (fibonacci(n-1)+fibonacci(n-2));
        
    }

    public static int fibonacci(int n)
    {
        int a=0;
        int b=1;
        int c=0;
        for(int x=2;x<=n;x++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        return  c;
    }
}
