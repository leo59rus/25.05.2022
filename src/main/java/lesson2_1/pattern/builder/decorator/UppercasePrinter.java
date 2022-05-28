package lesson2_1.pattern.builder.decorator;

public class UppercasePrinter implements  Printer{
private Printer printer;

    public UppercasePrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String text) {
        printer.print(text.toUpperCase());//все буквы увеличенные
    }
}
