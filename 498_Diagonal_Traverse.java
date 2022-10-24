class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int ans[]=new int[n*m];
        int k=0;
        for(int d=0;d<n+m-1;d++)
        {
            int r,c=0;
            if(d<m)
            {
                r=0;
                c=d;
            }
            else{
                r=d-m+1;
                c=m-1;
            }
            ArrayList<Integer> list=new ArrayList<>();
            while(r<n && c>=0)
            {
                list.add(mat[r][c]);
                r++;
                c--;
            }
            if(d%2==0)
            {
                Collections.reverse(list);
            }
            for(int i=0;i<list.size();i++)
            {
                ans[k]=list.get(i);
                k++;
            }
        }
        return ans;
        
    }
}
