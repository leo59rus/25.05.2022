package lesson2_1;

public class App {
    public static void main(String[] args) {
        //вызов конструктора наружного и внутреннего классов Outer(), Inner()
        Outer.Inner inner = new Outer().new Inner();//наружный класс.внутренний класс
        Outer.StaticInner staticInner = new Outer.StaticInner();//вызов внутреннего статического класса

    }
}
