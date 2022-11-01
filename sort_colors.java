class Solution {
    public void sortColors(int[] mohit) {
	    int leftmohit=0;
	    int rightmohit=mohit.length-1;
	    int midmohit=0;
	    while(midmohit<=rightmohit)
	    {
	        if(mohit[midmohit]==2)
	        {
	            int temp=mohit[midmohit];
	            mohit[midmohit]=mohit[rightmohit];
	            mohit[rightmohit]=temp;
	            rightmohit--;
	        }
	        
	        else if(mohit[midmohit]==0)
	        {
	            int temp=mohit[midmohit];
	            mohit[midmohit]=mohit[leftmohit];
	            mohit[leftmohit]=temp;
	            leftmohit++;
	            midmohit++;
	        }
	        else{
	            midmohit++;
	        }
	    }
    }
}
