package lesson2_1_2;

abstract class AbstractAnimal {
    private int age;
    private String name;

    public abstract void voice();


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
