package lesson2_1_3;
//считаем число букв в тексте
public class CharCounter {
    private final Reader reader;
    private final Writer writer;

    public CharCounter(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }


    public void processText() {
        String text = reader.read();
        int[] c = new int[128];
        for (char c1 : text.toCharArray()) {
            c[c1]++;
        }
        for (char i = 0; i < c.length; i++) {
            if (c[i] != 0) {
                writer.write(i + " встретилось " + c[i] + " раз");
            }
        }
    }
}
