/**
 * Xparttern
 */
/**
 * InnerXparttern
 */
class InnerXparttern {
    
    InnerXparttern(int n){
        int m = n*2-1,k=1,flag=1;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m;j++){
                if(i==j || j == n*2-i){
                   System.out.print(k); 
                }else{
                    System.out.print(" ");
                }
            }
            if(flag== 1 && k<n){
                k++;
            }else{
                flag = 0;
                k--;
            }
            
            System.out.print("\n");
        }
        
    }
    
}
public class Xparttern {

    public static void main(String[] args) {
        InnerXparttern ovj = new InnerXparttern(5);
    }
}