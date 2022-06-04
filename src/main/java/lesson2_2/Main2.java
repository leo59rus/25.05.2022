package lesson2_2;

public class Main2 {
    public static void main(String[] args) {

        m();
    }

    private static void m() {
        m1(0);
    }

    private static void m1(int i) {
        try {
            int a = 10 / i;
            System.out.println("поделили успешно");
            System.out.println("a = " + a);
        } catch (ArithmeticException e) {
            System.out.println("поймали исключение");
            System.out.println("delenie na 0");//delenie na 0
            System.out.println(e.getMessage());// by zero
            e.printStackTrace();//java.lang.ArithmeticException: / by zero
                                // at lesson2_2.Main2.m1(Main2.java:15)
                                // at lesson2_2.Main2.m(Main2.java:10)
                                // at lesson2_2.Main2.main(Main2.java:6)
            e.getStackTrace();
        }

    }
}
