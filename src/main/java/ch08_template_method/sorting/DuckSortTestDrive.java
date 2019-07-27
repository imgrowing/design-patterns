package ch08_template_method.sorting;

import java.util.Arrays;

public class DuckSortTestDrive {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("D8", 8),
                new Duck("D2", 2),
                new Duck("D7", 7),
                new Duck("DD2", 2),
                new Duck("D20", 20),
                new Duck("D10", 10),
                new Duck("DDD2", 2),
        };

        System.out.println("정렬 전:");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("정렬 후:");
        display(ducks);
    }

    private static void display(Duck[] ducks) {
        for (Duck duck : ducks) {
            System.out.println(duck);
        }
    }
}
