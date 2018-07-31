public class LineCalc {
    double lineLength(Line2D line){
        double length = Math.abs(Math.sqrt(Math.pow((line.getX2() - line.getX1()), 2) + Math.pow((line.getY2()- line.getY1()), 2)));
        return length;
    }
}
