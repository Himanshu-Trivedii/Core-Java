package interfaces;

public class Doctor implements Person{
    @Override
    public String tellYourName() {
        return "I am Doctor";
    }
}
