public class Test {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        String s2 = "Love";
        s1.append(s2);
        s1.substring(4);
        int foundAr = s1.indexOf(s2);
        System.out.println(foundAr);
    }
}
