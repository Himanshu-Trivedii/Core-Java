package src.src.exceptionhandling;

import java.io.InvalidClassException;

public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            int x=5/0;
        }
        catch(ArithmeticException ex){
            System.out.println("Division Not Allowed");
        }
        finally{
            System.out.println("Finally Block");
        }
        func1();

        try{
            int x=5/0;
        }finally{
            System.out.println("Finally Block 2");
        }
        // If i dont write catch and only use try finally then error will come to handle this add catch before finally
        // THere is no try finally and then catch in java
    }
    public static void func1() {
        try{
            func2();
        }catch (Exception ex){
            System.out.println("Error Occoured");
        }

    }
    public static void func2() throws Exception{
        func3();
    }
    public static void func3() throws Exception{
//        throw new StackOverflowError();// Compiler will not force to handle runtime exception and we will see stack trace.
        throw new InvalidClassException("Compiler Time Exception");// but if we write only this line then compiler force us to handle it by throws else program will terminate after main function.
    }

}
