package OOPS_JAVA;

class demo {
private int id;
private String name;

public demo() // constructor
{
    id=23;
}

    public int getid()
    {
        return id;
    }

// we can also pass arguments to constructor
    public demo(int my_id) // constructor
    {
        id=my_id;

    }

}

public class Constrctor {

    public static void main(String[] args) {
        demo dom=new demo();
      // demo dom=new demo(34); //if we passed arguments in constructor we have to pass it here too

        System.out.println(dom.getid());


    }
}
