package com.example;

import java.util.Scanner;
import java.util.ArrayList;

public class TodoListApp {
    private static ArrayList<String> tasks = new ArrayList<>();
    private static ArrayList<Boolean> completed = new ArrayList<>();
    private static ArrayList<String> addtask = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menu(scanner);
    }

    public static void menu(Scanner scanner) {
        while (true) {
            System.out.println("To Do List APP");
            System.out.println("--------------");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.println("--------------");
            System.out.print("Select an option: ");
   
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    listTasks();
                    break;
                case 3:
                    markTask(scanner);
                    break;
                case 4:
                    deleteTask(scanner);
                    break;
                case 5:
                    System.out.println("Exiting APP.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid number. Enter a correct option.");
            }
        }
    }  