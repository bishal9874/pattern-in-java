public class invertFullpyramid {
    public static void main(String[] args) {
        int n=8;boolean k = true;
        for(int i =1;i<=n;i++){
            
            for(int j=1;j<=(n*2)-1;j++){
                if (j>=i && j<=(n*2)-i && k) {
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
