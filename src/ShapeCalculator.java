public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {
    @Override
    public double circleArea(Circle circle) {
        double pi = Math.PI;
        double area = pi * Math.pow(circle.getRadius(), 2);
        return area;
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        double area = rectangle.getSideA() * rectangle.getSideB();
        return area;
    }

    @Override
    public double ballVolume(Ball ball) {
        double pi = Math.PI;
        double volume = (4.0/3.0 * pi * Math.pow(ball.getRadius(), 3));
        return volume;
    }

    @Override
    public double cubeVolume(Cube cube) {
        double volume = Math.pow(cube.getSide(), 3);
        return volume;
    }
}
