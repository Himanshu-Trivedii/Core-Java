package src.generics.inheritance;

public class Testing extends NormalInheritance<Integer>{
    // While extending a generic class we need to define the type of data it will hold.
    public static void main(String[] args) {
        NormalInheritance<String> myobject = new NormalInheritance();
        myobject.setX("ad");


    }


}
