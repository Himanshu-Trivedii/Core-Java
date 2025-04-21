public class FinallyEdgeCases {

    public static void main(String[] args) {
        System.out.println("Case 1: return in try and finally");
        System.out.println("Returned: " + case1());
        System.out.println();

        System.out.println("Case 2: exception in try and finally");
        try {
            case2();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();

        System.out.println("Case 3: System.exit(0) in try (this will terminate the program!)");
        // Commenting out to avoid JVM termination during testing
        // case3();

        System.out.println("Case 4: try-finally in loop with continue");
        case4();
        System.out.println();

        System.out.println("Case 5: exception in try, return in finally");
        System.out.println("Returned: " + case5());
        System.out.println();

        System.out.println("Case 6: finally throws exception after try");
        try {
            case6();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();

        System.out.println("Case 7: break in try with finally in loop");
        case7();
    }

    static int case1() {
        try {
            return 1;
        } finally {
            return 2;
        }
    }

    static void case2() {
        try {
            throw new RuntimeException("From try");
        } finally {
            throw new RuntimeException("From finally");
        }
    }

    static void case3() {
        try {
            System.exit(0);
        } finally {
            System.out.println("This won't print");
        }
    }

    static void case4() {
        for (int i = 0; i < 2; i++) {
            try {
                System.out.println("Try " + i);
                continue;
            } finally {
                System.out.println("Finally " + i);
            }
        }
    }

    static int case5() {
        try {
            throw new RuntimeException("Boom");
        } finally {
            return 42;
        }
    }

    static void case6() {
        try {
            System.out.println("Try block runs fine");
        } finally {
            throw new RuntimeException("From finally");
        }
    }

    static void case7() {
        for (int i = 0; i < 2; i++) {
            try {
                System.out.println("Try " + i);
                break;  // Break after first iteration
            } finally {
                System.out.println("Finally " + i);  // This still runs
            }
        }
    }
}
