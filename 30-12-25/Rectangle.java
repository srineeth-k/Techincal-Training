public class Rectangle {
    private double length;
    private double width;

    public Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*(length+width);
    }

    public static void main(String[] args) {
        Rectangle r1=new Rectangle(5.5,2.5);
        Rectangle r2=new Rectangle(10.5,3.5);
        System.out.println("Rectangle 1 Permimeter : "+r1.getPerimeter()+" Area: "+r1.getArea());
        System.out.println("Rectangle 2 Permimeter : "+r2.getPerimeter()+" Area: "+r2.getArea());
    }
}
