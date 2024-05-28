package com.polovyi.ivan.tutorials;

public class Examples {


    public static void main(String[] args) {

//        int selectorExpression1 = 1;
//        switch (selectorExpression1 - 1) {
//        }
//
//        String selectorExpression2 = "A";
//        switch (selectorExpression2.toUpperCase()) {
//        }
//
//        switch (selectorExpression3()) {
//        }

        int selectorExpression4 = 0;
        switch (selectorExpression4) {
            default:
        }

        int selectorExpression5 = 2;
        switch (selectorExpression5) {
            default:
                System.out.println("Selector is = " + selectorExpression5);
        }

        int selectorExpression6 = 1;
        switch (selectorExpression6) {
            default:
                System.out.println("default: Selector is = " + selectorExpression6);
                System.out.println("Multiple line statement");
        }

        int selectorExpression7 = 1;
        switch (selectorExpression6) {
            case 1:
                System.out.println("Selector is = " + selectorExpression7);
            default:
                System.out.println("default: Selector is = " + selectorExpression7);
        }

        int selectorExpression8 = 1;
        switch (selectorExpression8) {
            case 1: {
                System.out.println("Selector is = " + selectorExpression8);
            }
            break;
            default:
                System.out.println("default: Selector is = " + selectorExpression8);
        }

        int selectorExpression9 = 1;
        switch (selectorExpression9) {
            default:
                System.out.println("default: Selector is = " + selectorExpression9);
            case 1:
                System.out.println("Selector is = " + selectorExpression9);
                break;
            case 2:
                System.out.println("Selector is = " + selectorExpression9);
            case 3:
                System.out.println("Selector is = " + selectorExpression9);
                break;
        }

        int selectorExpression10 = 3;
        switch (selectorExpression10) {
            case 1:
                System.out.println("Selector is = " + selectorExpression10);
                break;
            case 2:
            case 3:
                System.out.println("Selector is = " + selectorExpression10);
                break;
            default:
                System.out.println("default: Selector is = " + selectorExpression10);
        }

        final int CONSTANT = 2;
        int selectorExpression11 = 1;
        switch (selectorExpression11) {
            case 1:
                System.out.println("Selector is = " + selectorExpression11);
                break;
            case CONSTANT: // This is allowed because CONSTANT is a final constant
                System.out.println("Selector is = " + selectorExpression11);
                break;
            case 2 + 3: // This is allowed because 2 + 3 is a constant expression
                System.out.println("Selector is = five");
                break;
            // case variable: // This would cause a compile-time error
            //     System.out.println("Variable value");
            //     break;
            default:
                System.out.println("Default");
                break;
        }

        enum Day {
            SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
        }
        Day day = Day.SUNDAY;
        switch (day) {
            case SATURDAY:
            case SUNDAY:
                System.out.println("Rest");
                break;
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Work");
                break;
            default:
                throw new RuntimeException("???");
        }

        int selectorExpression12 = 2;
        switch (selectorExpression12) {
            case 1:
                System.out.println("Selector is = " + selectorExpression12);
                break;
            case 2: {
                int selectorExpression13 = 2;
                // int selectorExpression12 = 2; // won't compile
                switch (selectorExpression13) {
                    case 2: {
                        System.out.println("Outer selector is = " + selectorExpression12);
                        System.out.println("Inner selector is = " + selectorExpression13);
                    }
                    default:
                        System.out.println("default: Inner elector is = " + selectorExpression13);
                }
            }
            default:
                System.out.println("default: Selector is = " + selectorExpression12);
        }

        int selectorExpression14 = 1;
        switch (selectorExpression14) {
            default:
                String message = "message";
            case 1:
                //String message = ""; // won't compile
            case 2: {
                //String message = ""; // won't compile
                String message1 = "message";
            }
            case 3: {
                //String message = ""; // won't compile
                String message1 = "message";
            }
        }

        someMethod1(1);
        someMethod2(1);

        ////////////////////////////////////////////////////

        int selectorExpression15 = 1;
        switch (selectorExpression15) {
            case 1 -> System.out.println("Selector is 1");
            case 2 -> System.out.println("Selector is 2");
            default -> System.out.println("Selector is = " + selectorExpression15);
        }

        int selectorExpression16 = 1;
        switch (selectorExpression16) {
//            case 1 -> // won't compile
//            case 2 -> System.out.println("Selector is = " + selectorExpression16);
            case 1, 2 -> System.out.println("Selector is = " + selectorExpression16);
        }

        int selectorExpression17 = 1;
        switch (selectorExpression17) {
            // case 1 -> {} {} // won't compile
            case 2 -> System.out.println("Selector is 2");
            case 3 -> {
                System.out.println("Inside a block");
                System.out.println("Selector is 3");
            }
            //default -> throw new RuntimeException();
        }

        int selectorExpression18 = 1;
        switch (selectorExpression18) {
            case 1 -> System.out.println("Selector is 1");
            // break; // won't compile
            case 2 -> System.out.println("Selector is 2");
            // break; // won't compile
            default -> throw new RuntimeException();
        }

        int selectorExpression19 = 1;
        switch (selectorExpression19) {
            case 1 -> {
                int selectorExpression20 = 2;
                switch (selectorExpression20) {
                    case 2: {
                        System.out.println("Outer selector is = " + selectorExpression19);
                        System.out.println("Inner selector is = " + selectorExpression20);
                    }
                    default:
                        System.out.println("default: Inner elector is = " + selectorExpression19);
                }
            }
            default -> System.out.println("default: Selector is = " + selectorExpression19);
        }

        switch (day) {
            case SATURDAY -> System.out.println("Rest");
            case FRIDAY -> System.out.println("Work");

        }


    }

    public static int someMethod1(int value) {
        switch (value) {
            case 1:
                return 10; // Exit the method and return 10
            case 2:
                return 20; // Exit the method and return 20
            default:
                return 0;  // Exit the method and return 0
        }
    }

    public static void someMethod2(int value) {
        switch (value) {
            case 1:
                // Do something for case 1
                break; // Exit the switch block
            case 2:
                // Do something for case 2
                break; // Exit the switch block
            default:
                // Do something for default case
                break; // Exit the switch block
        }
        // Code here will be executed after the switch block
    }

    private static int selectorExpression3() {
        return 0;
    }
}
