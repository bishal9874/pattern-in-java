// Write a Program to Print Half Diamond Star Pattern.

// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *

public class Half_Diamond {
    public static void main(String[] args) {
        int n=9;int k=0,i,j;
        for(i =1;i<=n;i++){
                if(i<=(n+1)/2)k++; else k--;
            for(j=1;j<=(n+1)/2;j++){
                System.out.print((j<=k) ? "*" : " ");
                
            }
            
            System.out.println();
        }
    }
}
