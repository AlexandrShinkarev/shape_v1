public class MainClass {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("������� ����� �����: " + circle.getSquare());
        Shape rectangle = new Rectangle(5,4);
        System.out.println("������� �������������� �����: " + rectangle.getSquare());
        Shape triangle = new Triangle(7,8);
        System.out.println("������� ����������� �����: " + triangle.getSquare());
    }
}
