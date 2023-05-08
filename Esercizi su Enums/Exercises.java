public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }

    /**
     * 1:
     *
     *
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     *
     * Loop over the values with Days.values() and print them out.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        for(Days day : Days.values())
        System.out.println(day);
    }
    private enum Days {
        MONDAY(false),
        TUESDAY(false),
        WEDNASDAY(false),
        THURSDAY(false),
        FRIDAY(false),
        SATURDAY(true),
        SUNDAY(true);
        private boolean isWeekend;

        Days(boolean isWeekend) {
            this.isWeekend = isWeekend;
        }

        public boolean isWeekend() {
            return isWeekend;
        }
    }

    /**
     * 2:
     *
     *
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     *
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        for(Season stagione : Season.values()){
            System.out.println(stagione.getDateRange());
        }
    }
    private enum Season {
        SPRING("21 MARZO - 21 GIUGNO"),
        SUMMER("22 GIUGNO - 22 SETTEMBRE"),
        AUTUMN("23 SETTEMBRE - 21 DICEMBRE"),
        WINTER("22 DICEMBRE - 20 MARZO");
        private String dateRange;

        Season(String dateRange) {
            this.dateRange = dateRange;
        }
        public String getDateRange() {
            return dateRange;
        }
    }
    /**
     * 3:
     *
     *
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     *
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     *
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        try {
            TrafficLight light = TrafficLight.GREEN;
            for (; ; ) {
                switch (light) {
                    case GREEN:
                        Thread.sleep(10000);
                        light = TrafficLight.YELLOW;
                    case YELLOW:
                        Thread.sleep(10000);
                        light = TrafficLight.RED;
                    case RED:
                        Thread.sleep(10000);
                        light = TrafficLight.GREEN;
                }
            }
        }catch (Exception Exception){
            Exception.printStackTrace();
            System.out.println("Forse era meglio prendere un'altra strada, il semaforo non funziona");
        }
    }
    private enum TrafficLight {
        RED,
        YELLOW,
        GREEN;
    }
    /**
     * 4:
     *
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     *
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here
        for(Days day : Days.values()){
            if (day.isWeekend() == true){
                System.out.println(day);
            }
        }
    }

    /**
     * 5:
     *
     *
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     *
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        // Your code here
        for(Operator operazione : Operator.values()){
            System.out.println(operazione.getOperatorValue());
        }
        double num1 = 5;
        double num2 = 2;
    }
    private enum Operator {
        ADD(5,2,5+2),
        SUBTRACT(5,2,5-2),
        MULTIPLY(5,2,5*2),
        DIVIDE(5,2,5/2);
        private double number1;
        private double number2;
        private double operatorValue;

        Operator(double number1, double number2, double operatorValue) {
            this.number1 = number1;
            this.number2 = number2;
            this.operatorValue = operatorValue;
        }

        public double getNumber1() {
            return number1;
        }

        public double getNumber2() {
            return number2;
        }

        public double getOperatorValue() {
            return operatorValue;
        }
    }

}