package src.src.Interfaces;


public class logic {
    public static void main(String[] args) {
        // Allowed
        Doctor d = new Doctor();
        Student s = new Student();
        Person p1 = new Doctor();
        Person p2 = new Student();
        // NOT ALLOWED
//        Person p3 = new Person(); // No Objects can be created for interface.ss
//        Student s2 = new Person(); Child canot hold reference to parent. Only parent can hold refernce to child class
//        Doctor d2 = new Person();
    }
}
