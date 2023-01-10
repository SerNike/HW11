package com.skypro.HW11;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " "+ lastName;
        System.out.println("ФИО сотрудника —  " + fullName);
    }
    public static void task2() {
        String fullName ="Ivanov Ivan IvanovIch";
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + upperFullName);

    }
    public static void task3() {
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "e");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
    }
}
