package lesson2_1.pattern.builder.decorator;

public class ConsolePrinter implements Printer {
   public void print(String text) {
        System.out.print(text);
    }
}
