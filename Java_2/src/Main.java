public class Main {
    public static void main(String[] args) {
        System.out.println("Testing Author");
        Author a1 = new Author("John", "SomeMail@xxxx", 'm');
        System.out.println(a1.getEmail());
        System.out.println(a1.getName());
        System.out.println(a1.getGender());
        a1.setEmail("NewMail@xxxx");
        System.out.println(a1.getEmail());
        System.out.println(a1.toString());

        System.out.println("Testing ball");
        Ball b1 = new Ball(10,15);
        System.out.println(b1.getX());
        System.out.println(b1.getY());
        b1.setXY(0,0);
        System.out.println(b1.toString());
        b1.move(10, -5);
        System.out.println(b1.toString());
        b1.move(-5,15);
        System.out.println(b1.toString());
    }
}
