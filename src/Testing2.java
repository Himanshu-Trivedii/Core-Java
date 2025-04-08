package src.generics.inheritance;

public class Testing2 extends MultipleParametersGenerics<String,String,Integer>{

    public static void main(String[] args) {
       MultipleParametersGenerics<String,String,Integer> m = new MultipleParametersGenerics<>();
       m.put("zzz","yyyy",47);
       System.out.println(m.getObj1());
       // agar tum   MultipleParametersGenerics<String,String,Integer> m = new MultipleParametersGenerics<>(); bhejoge to wohi expect karega koi aur float doubke nhi
        // but agar tum sirf   MultipleParametersGenerics  m = new MultipleParametersGenerics<>(); to phir Object jo  parent class hota hai at the end sabka wo paas hoga
        // and hence tum different wrapper classes ka use kar saktein ho.


    }






}
