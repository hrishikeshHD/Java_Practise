package two_d_Array;

public class numFreqInMat {
    public static void main(String[]args){
        int [][] mat = {{1,2,3,45},{4,32,1,2,4}};

        int key = 2;
        int freq = 0;

        for(int i = 0;i<=mat.length-1;i++){
            for(int j = 0;j<=mat[0].length-1;j++){
                if(mat[i][j] == key){
                    freq+=1;
                }
            }
        }
    System.out.println(" key is "+key+"and its count is "+freq);
    }

}
