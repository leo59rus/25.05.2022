package lesson2_1_3;

public class App {
    public static void main(String[] args) {
        Reader reader = new FileReader("JJKKLLM"); // читаем
        Writer writer = new ConsoleWriter();                //выводим рт в консоль
        CharCounter charCounter = new CharCounter(reader, writer);
        charCounter.processText();

    }
}
