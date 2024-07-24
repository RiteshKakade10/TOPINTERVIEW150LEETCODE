class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        List<Integer> list1=new ArrayList<>(n);
        
        int left=0;
        int down=n-1;
        int top=0;
        int right=matrix[0].length-1;
        int dir=0;

        while(left<=right && top<=down)
        {
            if(dir==0)
            {
                for(int i=left;i<=right;i++)
                {
                    list1.add(matrix[top][i]);
                    top++;
                }
            }else if(dir==1)
            {
                for(int i=top;i<=down;i++)
                {
                    list1.add(matrix[i][right]);
                    right--;
                }
            }
            else if(dir==2)
            {
               for(int i=right;i>=left;i--)
               {
                    list1.add(matrix[down][i]);
                    down--;
               } 
            }
            else if(dir==3)
            {
                for(int i=down;i>=top;i--)
                {
                    list1.add(matrix[i][left]);
                    left++;
                }
            }
            dir=(dir+1)%4;
        }
        return list1;
    }
}
