package lesson2_1.pattern.builder.decorator;

public class BorderPrinter implements Printer {
    private Printer printer;

    public BorderPrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String text) {
        System.out.println("*".repeat(text.length() + 4));//рамка сверху
        System.out.print("* ");//рамка слева
        printer.print(text);//текст
        System.out.println(" *");//рамка справа
        System.out.println("*".repeat(text.length() + 4));//рамка снизу
    }
}
