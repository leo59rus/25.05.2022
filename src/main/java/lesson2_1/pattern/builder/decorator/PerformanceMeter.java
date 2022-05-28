package lesson2_1.pattern.builder.decorator;

public class PerformanceMeter implements Printer {
    private  Printer printer;

    public PerformanceMeter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String text) {
        final long l = System.currentTimeMillis();//берет колво милисекунд с начала запуска системы
        printer.print(text);
        System.out.println(System.currentTimeMillis() - l);//время сейчас - время начала
        //- l - l + l + l у меня так работает??
    }
}
