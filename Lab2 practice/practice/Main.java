package practice;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Doey", "John", 35, 12345678, "A");

        System.out.println(p1);
        System.out.println(p2);

        Room r1 = new Room();
        Room r2 = new Room(352, "lab", 3);

        System.out.println(r1);
        System.out.println(r2);

        Subject s1 = new Subject();
        Subject s2 = new Subject(r2, 45, p2);

        System.out.println(s1);
        System.out.println(s2);
    }
}
