package lesson2_1.pattern.builder;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Employee employee = new Employee.Builder()
                .lastname("Ivanov")
                .firstname("Ivan")
                .middlename("Ivanovich")
                .department("HR")
                .birthday(LocalDate.of(2000,12,10))
                .gender(Gender.MALE)
                .build();

    }
}
