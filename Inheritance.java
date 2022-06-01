package OOPS_JAVA;

class base{
    int x;

    void printme()
    {
        System.out.println("Im printing this from base class which is extnded  to derived clas ");
    }

}

class derived extends base{

    @Override
    void printme() {
        super.printme();
    }

    int x=4;
}

class thrid extends  derived{

void  printx()
{
    System.out.println(x);
}

}


public class Inheritance {

    public static void main(String[] args) {

        derived d=new derived();
        d.printme();

       thrid t=new thrid();
       t.printx();

    }
}
