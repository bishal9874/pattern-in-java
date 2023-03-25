// 3. Write a Program to print mirrored right triangle star pattern.

//     *
//    **
//   ***
//  ****
// *****
public class mirroredRight {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
        for (int j=1; j<=n ; j++) {
            System.out.print((j>=(n+1)-i)?"*" : " ");
        }
            System.out.println();
        }
    }
}
