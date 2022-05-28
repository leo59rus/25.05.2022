package lesson2_1.pattern.builder.decorator;

public class SparsePrinter implements Printer{
    private Printer printer;

    public SparsePrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String text) {
        StringBuilder builder = new StringBuilder(" ");
        for (char c : text.toCharArray()) {
            builder.append(c).append(" ");
        }
        printer.print(builder.toString());

    }
}
