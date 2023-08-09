package HomeWork_ln_14_modifiers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите родиус чтобы вычистлить Area");
        System.out.println(Circle.area(scanner.nextDouble()));
        System.out.println("Ответ");
        System.out.println("Ведите родиус чтобы вычистлить circumference");
        System.out.println(Circle.circumference(scanner.nextDouble()));
        System.out.println("Ответ");


    }}