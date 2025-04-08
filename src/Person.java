package src.generics;

public class Person <T>{
    T myvar;
    Object o1;
    public Object getO1() {
        return o1;
    }

    public void setO1(Object o1) {
        this.o1 = o1;
    }

    public T getMyVar(){
        return myvar;
    }
    public void setMyvar(T myvar){
        this.myvar = myvar;
    }
}
