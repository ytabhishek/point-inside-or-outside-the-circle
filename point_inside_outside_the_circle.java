package conditional;

public class point_inside_outside_the_circle {
    public static void main(String[] args) {
        double x = 1;
        double y = 2;
        double r = 3;
        double x1 = 4;
        double y1 = 5;
        double oa = (x-x1)*(x-x1)+(y-y1)*(y-y1);
        System.out.println(oa*oa);

        if((oa*oa)>r){
            System.out.println("The point is outside the circle");

        }else if((oa*oa)<r){
            System.out.println("The point is inside the circle");
        }
        else if((oa*oa)==r){
            System.out.println("The point is in the circle");
        }

    }
}
