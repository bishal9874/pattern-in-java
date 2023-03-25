/*
Write a Program to print the right triangle star pattern.
*
**
***
****
***** 
*/

public class Star {
    public static void main(String[] args) {
        InnerStar ibj = new InnerStar(5);
    }
}
/**
 * InnerStar
 */
class InnerStar {

    InnerStar(int n){
        
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n;j++){
               System.out.print(j<=i ? "*": " ");
            }
            System.out.println();

        }
    }
}
