public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length,double width,double height){
        this.length=length;
        this.width=width;
        this.height=height;
    }
    public double getVolume(){
        return length*width*height;
    }
    public static void main(String args[]){
        Box b1=new Box(2.5,3.5,4.5);
        Box b2=new Box(5.5,6.5,7.5);
        if(b1.getVolume()>b2.getVolume()){
            System.out.println("Box 1 has greater volume.");
        }
        else if(b1.getVolume()<b2.getVolume()){
            System.out.println("Box 2 has greater volume.");
        }
        else{
            System.out.println("Both boxes have equal volume.");
        }
       
    }
}
