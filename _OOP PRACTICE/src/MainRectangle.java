import com.ryan.classwork.Rectangle;
public class MainRectangle {
    public static void main(String[]args){
        Rectangle Rectangle1=new Rectangle(15,7);
        Rectangle1.showDetails();

        System.out.println("\n");

        Rectangle Rectangle2=new Rectangle();
        Rectangle2.setLength(12);
        Rectangle2.setWidth(5);
        Rectangle2.showDetails();
    }

}
