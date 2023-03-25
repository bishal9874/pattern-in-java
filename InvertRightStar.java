// 2. Write a Program to print an inverted right triangle star pattern.

// *****
// ****
// ***
// **
// *
public class InvertRightStar {
    public static void main(String[] args) {
        InnerInvertRightStar obj = new InnerInvertRightStar(7);
    }
}
/**
 * InnerInvertRightStar
 */
class InnerInvertRightStar {
    InnerInvertRightStar(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((j<=(n+1)-i)?"*" : " ");
            }
            
            System.out.println();
        }
    }
}
