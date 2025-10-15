public class Main 
{
    public static void main(String[] args) {

        Person p1 = new Person();

        p1.name = "Nisa";
        p1.age = 22;
        p1.email = "hello@gmail.com";
        p1.work();
        p1.eat();
        p1.sleep();


        Person p2 = new Person();
        p2.name = "john";
        p2.age = 25;
        p2.email = "john@gmail.com";

        p2.work();
        p2.eat();
        p2.sleep();

        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p1.age);
        System.out.println(p2.age);
        System.out.println(p1.email);
        System.out.println(p2.email);
    }
}