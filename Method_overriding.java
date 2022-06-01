package OOPS_JAVA;


class A{

    public int method_1()
    {
        return 4;
    }

    public void method_2()
    {
        System.out.println("This is Method 2 of Class A");
    }
}

class B extends A{

    @Override
    public void  method_2()
    {
        System.out.println("This is Method 2 of class B");
    }

}




public class Method_overriding {
    public static void main(String[] args) {

        A a=new A();  //object of class A
        a.method_2();

        B b=new B();  //object of class B
        b.method_2();








    }
}
