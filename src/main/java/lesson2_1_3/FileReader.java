package lesson2_1_3;

public class FileReader implements Reader {
    private String fileName;
    public FileReader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String read() {
        return "gkfoooooooo";
    }
}
