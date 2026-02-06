package Array;

public class maxRain {
    public static void rain(int []arr){
        int maxRain = 0;
        int maxleft = arr[0];
        // Fix 1: Initialize maxright to the last element's value, not the array length
        int maxright = arr[arr.length - 1];
        int [] rbound=new int[arr.length];
        int [] lbound=new int[arr.length];

        // Calculate Left Max Boundary
        for(int i = 0;i<arr.length;i++){
            if(maxleft<arr[i]){
                maxleft = arr[i];
            }
            lbound[i] = maxleft;
        }

        // Calculate Right Max Boundary
        for(int j = arr.length-1;j>=0;j--){
            // Fix 2: Use maxright and compare with arr[j]
            if(maxright<arr[j]){
                maxright = arr[j];
            }
            // Fix 3: Store in rbound array
            rbound[j] = maxright;
        }

        int rain =0;
        for(int k = 0;k<arr.length;k++){
            rain = (Math.min(lbound[k],rbound[k]) - arr[k]);
            maxRain+=rain;
        }

        // Debug prints (optional, kept as is)
        for(int m =0;m<lbound.length;m++){
            System.out.print(lbound[m]+" ");
        }
        System.out.println();
        for(int m =0;m<rbound.length;m++){ // Fix 4: Print rbound here
            System.out.print(rbound[m]+" ");
        }
        System.out.println("\n"+ maxRain);

    }

    public static void main(String[]args){
        int [] poles = {4,2,0,6,3,2,5};
        rain(poles);
    }
}