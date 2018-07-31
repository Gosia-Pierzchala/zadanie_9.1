public class Test {
    public static void main(String[] args) {

        Line2D line = new Line2D(-2, 4, 3, 6);
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(5,4);
        Ball ball = new Ball(6);
        Cube cube = new Cube(5);

        LineCalc lineCalc = new LineCalc();
        double length = lineCalc.lineLength(line);
        System.out.println("Długość odcinka to: " + length);

        ShapeCalculator shapeCalculator = new ShapeCalculator();

        double area = shapeCalculator.circleArea(circle);
        System.out.println("Pole koła to: " + area);

        double area1 = shapeCalculator.rectangleArea(rectangle);
        System.out.println("Pole prostokąta to: " + area1);

        double volume = shapeCalculator.ballVolume(ball);
        System.out.println("Pojemność kuli to: " + volume);

        double volume1 = shapeCalculator.cubeVolume(cube);
        System.out.println("Pojemność sześcianu to: " + volume1);

    }
}
