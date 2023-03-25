// 5. Write a Program to print the Full Pyramid Star pattern.

//     *  
//    * * 
//   * * *
//  * * * *
// * * * * *
public class FullPyramind_star {
    public static void main(String[] args) {
        int n = 5; boolean k= true;
        for(int i =1;i<=n;i++){
              
            for(int j=1;j<=(n*2)-1;j++){
                if (j>=(n+1)-i && j<=(n-1)+i && k) {
                    System.out.print("*");
                    k=false;
                } else {
                    System.out.print(" ");
                    k=true;
                }
                
            }
            
            System.out.println();
        }

        
    }
}
