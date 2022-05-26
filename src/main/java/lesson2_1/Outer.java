package lesson2_1;

public class Outer {
    private int a;
    private static int i;


    private void m(){

    }
    private static void sm() {

    }
    public class Inner{
        void innerM() {
            a = 1;
            i = 42;
            m();
            sm();
        }
    }

    public static class StaticInner {
        void innerM() {

            i = 42;

            sm();
        }
    }


}


