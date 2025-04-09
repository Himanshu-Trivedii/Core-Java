package Constructors;

public class Person {
    String x; // By Default it is null
    /*
        Default Constructor :: It is Created by java itself when we don't explicitly define it.

     */
    /*
        NoArgs Contructor :: This constructor is defined by user with no args.
                            Once it is defined then default one is not written by java.
                            Person(){
                            }
     */
     /*
        Parameterized Contructor :: This constructor is defined by user with no args.
        Once it is defined then default one is not written by java.
          Person(int age){
          }
      */
    /*
            Constructor Overloading. Note there is no constructor overriding as constructors cant be inherited/instantiated
            Person(int age){
            }
            Person(String name,int age){
            }
     */

    /*
        Private Constructor::: These can be accessed only within that same class for creating objects.
                                Can't be accessed by inherited classes or classes in same package.
     */


    // Constructor Chaining :: This and Super examples in other classes.
    public static void main(String[] args) {
        // When you run it First parent class ki constructor call hua and then child class
        // ye flow  employee se manager tak gaya using super keyword
        // Although you don't add it java internally adds it super() is used to call constructor of parent class.
        Employee  m1 = new Employee();
        Vehicle v = new Vehicle();


    }

}