public class Circle {

    private double radius;

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double area() {
        double area = Math.PI * radius * radius;        
        return area;
    }

    public static void main(String[] args) {
        Point pt1 = new Point();
        pt1.setRadius(19);
        System.out.println(pt1.area());
    }
    
}

class Point extends Circle {

}