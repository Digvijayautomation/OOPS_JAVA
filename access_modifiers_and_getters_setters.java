package OOPS_JAVA;

    class modifiers {
    private int id;
    private String name;   // we can access  this outside class due to private, so we have to create setters and getters as follows


    public void setid(int i)   // reasons to use setter and getters is we can access private entities outside the class
                             // and using setters and getters we can apply validation on input.. as id should be int only, name should be string only
    {
       id=i;
    }

    public int getid()
    {
        return id;
    }

    public void  setname(String n)
    {
        name=n;
    }

    public String getname()
    {
        return  name;
    }

}


public class access_modifiers_and_getters_setters {

    public static void main(String[] args) {

        modifiers modi=new modifiers();

        modi.setid(3);
      System.out.println(modi.getid());

        modi.setname("DigvijayTikka");
        System.out.println(modi.getname());





    }
}
