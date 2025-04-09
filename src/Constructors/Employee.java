package Constructors;

public class Employee extends Manager{

    Employee(){
//        super(); // Mai ye na bhi likhu to java internally super() call karega
//        super() hum sirf tab skip kar sakte hai jab parent ka constructor noArgs ho warna we have to pass the variable.
//        By default, Java har constructor ke andar super(); lagata hai.
//
//        Agar parent class me default (no-arg) constructor nahi hai, toh child class me explicit super(args) likhna padega.
        super(10);
        System.out.println("Hello I am a Employee");
    }
}
