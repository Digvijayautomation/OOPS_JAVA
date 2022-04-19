package OOPS_JAVA;



class square{
    int side;



    public int area()  //method for calling area
    {
        return  side*side;
    }

    public  int perimeter()
    {
        return 4*side;
    }

}


public class Calculating_shapes {

    public static void main(String[] args) {

        square sq=new square();

        sq.side=3;
        System.out.println("Area is\t"+sq.area());

        System.out.println("Perimeter is\t"+sq.perimeter());


    }
}
