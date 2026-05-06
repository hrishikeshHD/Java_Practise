package two_d_Array;

public class sortedMatSearch {
    public static void main (String []args){
        int [][] mat = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
        int key = 20;
        int row = 0;
        int n = mat[0].length-1;
        int col = n;
        System.out.println(n);

        while( row< mat.length && col>=0){
            if(key>mat[mat.length-1][n]) {
                System.out.println("Key is not available in matrix key is greater than -> "+ mat[mat.length-1][n]);
                break;
            }
            else if(mat[row][col]==key){
                System.out.println(row+" "+col);
                break;
            } else if (key>mat[row][col]) {
                row++;
            } else if (key<mat[row][col]) {
                col--;
            }



        }
    }
}
