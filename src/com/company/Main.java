package com.company;

import ibadts.*;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        homework2();
    }

    public static void example1() {
        int n = 13;

        Stack<Integer> stack = new Stack<>();
        while (n > 0) {
            stack.push(n % 2);
            n = n / 2;
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void example2() {
        Stack<String> stack = new Stack<>();

        try (Scanner scanner = new Scanner(System.in)) {
            boolean run = true;
            while (run) {
                String word = scanner.next();
                if (word.equals("END"))
                    run = false;
                else
                    stack.push(word);
            }
            while (!stack.isEmpty()) {
                System.out.println(stack.pop());
            }
        } catch (Exception e) {
            System.exit(1);
        }
    }

    public static void arbitraryExample() {
        int N = 100000;
        Stack<Integer> stack = new Stack<>();
        while (N > 0) {
            stack.push(N);
            N--;
        }

        long sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        System.out.println(sum);
    }
    public static void homework2()  {
        StaticStack words = new StaticStack(10);
        Scanner scanner = new Scanner(System.in);
        while (!words.isFull()) {
            words.push(scanner.next());
        }
        while (!words.isEmpty()) {
            System.out.println(words.pop());
        }
    }
    public static void homework3() {
        //confused
    }
}
