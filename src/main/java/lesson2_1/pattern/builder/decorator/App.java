package lesson2_1.pattern.builder.decorator;

public class App {
    public static void main(String[] args) {
        //просто вывод текста в консоль
        System.out.println();
        Printer consolePrinter = new ConsolePrinter();
        consolePrinter.print("Hello world");
        System.out.println();
        System.out.println();
       //текств рамке
        Printer borderPrinter = new BorderPrinter(consolePrinter);
        borderPrinter.print("Hello world");
        System.out.println();
        //текст в рамке с больш  буквами
        Printer uppercasePrinter = new UppercasePrinter(borderPrinter);
        uppercasePrinter.print("Hello world");
        System.out.println();
        //разрядили текст пробелом
        SparsePrinter sparsePrinter1 = new SparsePrinter(uppercasePrinter);
        sparsePrinter1.print("Hello world");
        System.out.println();
        //разрядили разрядёенный этим же методом
        SparsePrinter sparsePrinter2 = new SparsePrinter(sparsePrinter1);
        sparsePrinter2.print("Hello world");
        System.out.println();
        //прошедшее время работы кода
        final PerformanceMeter performanceMeter = new PerformanceMeter(sparsePrinter2);
        performanceMeter.print("Hello world");




    }
}
