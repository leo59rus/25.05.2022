package MainThrow;

public class InvalidAgeException extends  RuntimeException{


    private static final String ERROR_MESSAGE = "передан неверный возраст: %d";

    public InvalidAgeException(int age) {
        super(String.format(ERROR_MESSAGE, age));
    }


}
