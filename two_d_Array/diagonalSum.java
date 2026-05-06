package two_d_Array;

public class diagonalSum {
    public static void main(String []args) {
        int[][] mat = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int sum = 0;
        int n = mat.length - 1;

//        for(int i = 0;i< mat.length-1;i++){
//            for(int j = 0;j< mat[0].length-1;j++){
//                if(i==j){
//                    sum+=mat[i][j];
//                }
//                else if(i+j== mat.length-1 && i!=j) {
//
//                    sum+=mat[i][j];
//                }
//            }
//        }
        //now trying the O(n)

        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
            if (i != n - i) {
                sum += mat[i][n - 1];
            }
        }
        System.out.println(sum);
    }

}
