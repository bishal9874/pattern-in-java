public class VStar {
    public static void main(String[] args) {
        int n = 10; 
        int left =n;
        int right =n;// number of rows in the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n*2; j++) {
                if (j==left || j==right) { // check if the current position requires a star
                    System.out.print("*");
                
                } else {
                    System.out.print(" ");
                
                }
            }
            left--;
            right++;
            System.out.println(); // move to the next row
        }
    }
}
