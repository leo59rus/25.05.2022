package lesson2_1.pattern.builder;

import java.time.LocalDate;

public class Employee {
    //final не изменяемые
    private final String firstname;            //имя
    private final String lastname;             //фамилия
    private final String middlename;          //отчество
    private final String email;
    private final String room;
    private final String phone;
    private final int age;                    //возрвст
    private final double salary;              //зп
    private final String department;
    private final Employee manager;            //его начальник
    private final Gender gender;
    private final LocalDate birthday;           //LocalDate спец клас представляющий дату

   private Employee(Builder builder) { //приватный конструктор не сможем вызвать из дркгого класса
       this.firstname = builder.firstname;
       this.lastname = builder.lastname;
       this.middlename = builder.middlename;
       this.email = builder.email;
       this.room = builder.room;
       this.phone = builder.phone;
       this.age = builder.age;
       this.salary = builder.salary;
       this.department = builder.department;
       this.manager = builder.manager;
       this.gender = builder.gender;
       this.birthday = builder.birthday;
   }
   public static class Builder {
       private String firstname;
       private String lastname;
       private String middlename;
       private String email;
       private String room;
       private String phone;
       private int age;
       private double salary;
       private String department;
       private Employee manager;
       private Gender gender;
       private LocalDate birthday;

       public Builder firstname(String firstname) {
           this.firstname = firstname;
           return this;
       }

       public Builder lastname(String lastname) {
           this.lastname = lastname;
           return this;
       }

       public Builder middlename(String middlename) {
           this.middlename = middlename;
           return this;
       }
       public Builder email(String email) {
           this.email = email;
           return this;
       }
       public Builder room(String room) {
           this.room = room;
           return this;
       }
       public Builder phone(String phone) {
           this.phone = phone;
           return this;
       }
       public Builder age(int age) {
           this.age = age;
           return this;
       }
       public Builder salary(double salary) {
           this.salary = salary;
           return this;
       }
       public Builder department(String department) {
           this.department = department;
           return this;
       }
       public Builder manager(Employee manager) {
           this.manager = manager;
           return this;
       }
       public Builder gender(Gender gender) {
           this.gender = gender;
           return this;
       }
       public Builder birthday(LocalDate birthday) {
           this.birthday = birthday;
           return this;
       }

       public Employee build() {
           return new Employee(this);
       }


   }
}

