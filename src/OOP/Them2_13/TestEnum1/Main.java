package OOP.Them2_13.TestEnum1;

import java.util.Scanner;

/**
 * Created by Yuriy on 02.03.2017.
 */
public class Main {
    public enum MyDayOfWeek {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

        public MyDayOfWeek nextDay() {
            MyDayOfWeek[] dayOfWeek = MyDayOfWeek.values();
            int ordinal = this.ordinal();
            return ++ordinal == dayOfWeek.length ?  dayOfWeek[0]: dayOfWeek[ordinal];
        }

        public static void main(String[] args) {
            for (MyDayOfWeek days : MyDayOfWeek.values()) {
                System.out.println(days);
            }
            System.out.println("\n//////Laba2////////\n");

            for (MyDayOfWeek days : MyDayOfWeek.values()) {
                switch (days) {
                    case TUESDAY:
                        System.out.println("My Java day:" + days.name());
                        break;
                    case THURSDAY:
                        System.out.println("My Java day:" + days.name());
                        break;
                    case SATURDAY:
                        System.out.println("My Java day:" + days.name());
                        break;
                }
            }
            System.out.println("\n////////Laba3///////\n");
            System.out.println("Please enter day of week in CAPS:");
            String value = new Scanner(System.in).nextLine();
            System.out.println("The next day of week:" + MyDayOfWeek.valueOf(value).nextDay());
        }
    }
}
