public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2, 5);
        Rectangle r2 = new Rectangle(4, 6);

        System.out.println(r1);
        System.out.println("area = " + r1.getArea());
        System.out.println("perimeter = " + r1.getPerimeter());

        System.out.println();

        System.out.println(r2);
        System.out.println("area = " + r1.getArea());
        System.out.println("perimeter = " + r1.getPerimeter());
    }
}
