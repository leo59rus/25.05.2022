package lesson2_1;

public class Outer {
    private int a;
    private static int i;


    private void m() {
        class A { //локальный класс

        }
        final A a = new A();
    }

    private static void sm() {

    }

    public class Inner { //внутренний класс
        void innerM() {
            a = 1;
            i = 42;
            m();
            sm();
        }
    }

    public static class StaticInner {  //вложенный класс
        public static int g;

        void innerM() {
            int si;
            i = 42;

            sm();
        }
    }


}


