package src.generics;

public class Test {
    public static void main(String[] args) {
        Person<String> obj = new Person<>();
        obj.setMyvar("Himanshu");
        System.out.println(obj.getMyVar());

        obj.setO1("SHIVA");
        Object ans = obj.getO1();
        System.out.println(ans);

        ObjectKeyword ok = new ObjectKeyword();
        ok.setO(876);
        System.out.println(ok.getO());
        Integer x = (Integer) ok.getO(); // Autoboxing
        System.out.println(x);

    }
}