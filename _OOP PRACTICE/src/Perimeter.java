import com.ryan.classwork.RightAngleTriangle;

public class Perimeter {
    public static void main(String[] args){
        System.out.println("Perimeter of triangle is:");
        RightAngleTriangle obj1= new RightAngleTriangle(15,45,3);
        obj1.getPerimeter();
        obj1.showDetails();

    }

}

