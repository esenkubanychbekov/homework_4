package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String[] name = new String[3];
        String[] namecopy = new String[4];
        System.arraycopy(name, 0,namecopy,0,name.length);
        System.out.println("Пожалуйста введите имя человека: ");

        // Цикл для ввода имени человека

        for (int j = 0; j < namecopy.length; j++){
            System.out.println("Напишите имя: ");
            namecopy[j] = scanner.next();

        }

        //Цикл для распечатки элементов массива

        for (int i = 0; i <= namecopy.length; i++)
        {
            switch (i)
            {
                case 0:
                    System.out.println("Доброе утро: " + namecopy[0]);
                    break;
                case 1:
                    System.out.println("Добрый день: " + namecopy[1]);
                    break;
                case 3:
                    System.out.println("Добрый вечер: " + namecopy[2]);
                    break;
                case 4:
                    System.out.println("Привет : " + namecopy[3]);
                    break;
            }
        }

    }
}
