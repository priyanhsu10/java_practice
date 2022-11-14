package basics;

public class LocalMatrix {
    public static void main(String[] args) {
        int[][]in=new int[][] {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
    int[][] r=largestLocal(in);
        for(int i=0;i<r.length;i++){
            for(int j=0;j<r.length;j++){
                System.out.print(r[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] largestLocal(int[][] grid) {

        int len=grid[0].length-2;
        int[][] result= new int[len][len];
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                result[i][j]= getCellValue(i,j,grid);
            }
        }

        return result;
    }
    static int getCellValue(int i,int j  ,int [][] grid){
        int largest=0;

        for(int itemp=i;itemp<i+3;itemp++){
            {
                for(int tempj=j;tempj<j+3;tempj++){
                    if(grid[itemp][tempj]>largest){
                        largest=grid[itemp][tempj];
                    }
                }
            }
        }
        return largest;

    }
}
