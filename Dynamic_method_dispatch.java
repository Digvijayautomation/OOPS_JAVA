package OOPS_JAVA;


class Phone{
     public void On()
     {
         System.out.println("Turing on Phone");
     }
}

class Smartphone extends Phone{

    public void On()
    {
        System.out.println("Turing on SmartPhone");
    }
}

public class Dynamic_method_dispatch {

    public static void main(String[] args) {
        Phone ph=new Smartphone();  //Reference is of Phone but object created foe Smartphone
        ph.On();      //Dynamic dispatch because it will print statement for smartphone

    }
}
