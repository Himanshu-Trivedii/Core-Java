package src.generics.inheritance;

public class MultipleParametersGenerics <A,B,C>{
    A obj1;
    B obj2;
    C obj3;
    public void put(A a,B b,C c){
        this.obj1=a;
        this.obj2=b;
        this.obj3=c;
    }
    public A getObj1() {
        return obj1;
    }

    public void setObj1(A obj1) {
        this.obj1 = obj1;
    }

    public B getObj2() {
        return obj2;
    }

    public void setObj2(B obj2) {
        this.obj2 = obj2;
    }

    public C getObj3() {
        return obj3;
    }

    public void setObj3(C obj3) {
        this.obj3 = obj3;
    }



}
