package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	String[] name = new String[3];
        System.out.println("Пожалуйста введите имя человека: ");

        // Цикл для ввода имени человека
        
        for (int j = 0; j < name.length; ++j){
            System.out.println("Напишите имя: ");
            name[j] = scanner.next();

        }

        //Цикл для распечатки элементов массива

	for (int i = 0; i <= name.length; i++)
    {
        switch (i)
        {
            case 0:
                System.out.println("Доброе утро: " + name[0]);
            break;
            case 1:
                System.out.println("Добрый день: " + name[1]);
                break;
            case 3:
                System.out.println("Добрый вечер: " + name[2]);
                break;
        }
    }

    }
}
