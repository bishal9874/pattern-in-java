public class Calculator {
    static int num = 100;
    public void calc(int num){
        num = num*10;
    }
    public void printNum(int num){
        System.out.println(this.num);    }
    
    public static void main(String[] args) {
        int num = 2;
        Calculator obj = new Calculator();
        obj.calc(num);
        obj.printNum(num);

    }
}
