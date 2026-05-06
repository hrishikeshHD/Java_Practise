package two_d_Array;

public class spiralMatrix {
    public static void main(String []args){
        int [][] arr ={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};

        int  n = arr.length-1;
        int srow = 0;
        int erow = n;
        int scol = 0;
        int ecol = arr[0].length-1;

        while(srow<=erow && scol<=ecol){

            //print the top part of the matrix
            for(int j = scol;j<=ecol;j++){
                System.out.print(arr[srow][j]+" ");
            }
            //print the right part of the matrix
            for(int i = srow+1;i<=erow;i++){
                System.out.print(arr[i][ecol]+" ");
            }
            //print the bottom part
            for(int j = ecol-1;j>=scol;j--){
                if(scol == ecol){
                    break;
                }
                System.out.print(arr[erow][j]+" ");
            }
            //print the left part
            for(int i = erow-1;i>=srow+1;i--){
                if(erow == ecol){
                    break;
                }
                System.out.print(arr[i][scol]+" ");
            }
            srow++;
            erow--;
            scol++;
            ecol--;
        }

    }
}
