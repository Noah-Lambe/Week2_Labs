public class Demo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        Rectangle r3 = new Rectangle();
        Rectangle r4 = new Rectangle(2, 5);
        Rectangle r5 = new Rectangle(4, 6);
        Rectangle r6 = new Rectangle(7, 9);

        r1.display();
        r2.display();
        r3.display();
        r4.display();
        r5.display();
        r6.display();

        System.out.println(r1.getLength()+ ", " + r1.getWidth());
        System.out.println("area = " + r1.getArea());
        System.out.println("perimeter = " + r1.getPerimeter());
        r1.setLength(4);
        r1.setWidth(6);
        System.out.println(r1.getLength()+ ", " + r1.getWidth());
        System.out.println("area = " + r1.getArea());
        System.out.println("perimeter = " + r1.getPerimeter());

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);
    }
}
