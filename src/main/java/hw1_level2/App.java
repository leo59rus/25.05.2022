package hw1_level2;

//1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти
//классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в
//консоль).
//2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
//должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
//печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
//3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
//этот набор препятствий.
//4. * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения
//на бег и прыжки. Если участник не смог пройти одно из препятствий, то дальше по списку он
//препятствий не идет.
public class App {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Пушок");
        Human human1 = new Human("Сильвестер");
        Robot robot1 = new Robot("SI-corp 5.2");
        System.out.println(cat1.toString());
        System.out.println(human1.toString());
        System.out.println(robot1.toString());
        cat1.run(0.2);
        cat1.runTrack(0.2);
        cat1.jump(25);
        cat1.jumpWall(25);

        human1.run(10);
        human1.runTrack(10);
        human1.jump(120);
        human1.jumpWall(120);

        robot1.run(29);
        robot1.runTrack(29);
        robot1.jump(5000);
        robot1.jumpWall(5000);

       // String[] athlets = {
       //         String.valueOf(cat1),
       //         String.valueOf(human1),
       //         String.valueOf(robot1)
       // };
       // for (String athlet : athlets) {
       //     if (athlet.getLengthRun(
       // }
    }
}
