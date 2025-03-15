package src;

public class Employee {
    static int stInt= 100; // static member which will be once created and used by all without creating objects of Employee Class
    int memberVariable =500; // Member Variable whose default value is assigned but class variables should defined value before using else error will come.

    public void myFunc(){
         int x;
//         System.out.println(x); not possible for class vars to direcly print before defining them
     }
}
