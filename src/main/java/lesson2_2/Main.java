package lesson2_2;

public class Main {
    public static void main(String[] args) {

        m1(0);
    }
        private static void m1(int i){
        try {
            int a = 10 / i;
            System.out.println("поделили успешно");
            System.out.println("a = " + a);
        } catch (ArithmeticException e) {
            System.out.println("поймали исключение");
            System.out.println("delenie na 0");//delenie na 0
            System.out.println(e.getMessage());// by zero

        }
        System.out.println("f");//f
    }
}
