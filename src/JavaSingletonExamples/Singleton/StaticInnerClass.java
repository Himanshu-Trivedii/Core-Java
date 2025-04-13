package JavaSingletonExamples.Singleton;

public class StaticInnerClass {
    private StaticInnerClass() {}

    private static class Holder {
        private static final StaticInnerClass INSTANCE = new StaticInnerClass();
    }

    public static StaticInnerClass getInstance() {
        return Holder.INSTANCE;
    }
}