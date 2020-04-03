package task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Программа склонение \"Рубль\"");
        System.out.print("Введите целое число и нажмите enter: ");
        int i = sc.nextInt();
        switch(i % 100) {
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                System.out.println(i + " Рублей");
                break;
            default:
                switch (i % 10) {
                    case 0:
                        System.out.println(i + " Рублей");
                        break;
                    case 1:
                        System.out.println(i + " Рубль");
                        break;
                    case 2:
                    case 3:
                    case 4:
                        System.out.println(i + " Рубля");
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        System.out.println(i + " Рублей");
                }

                Scanner sc1 = new Scanner(System.in);
                System.out.println("Программа корректная дата");
                System.out.print("Введите год и нажмите enter: ");
                int year = sc1.nextInt();
                int i1 = year;
                int a = 0;
                if (i1 % 4 == 0) {
                    if ((i1 % 100 != 0) || (i1 % 400 == 0)){
                        System.out.println("Год високосный ");
                        a = 29;
                    }
                }
                else {
                    System.out.println("Год не високосный ");
                    a = 28;
                }
                String s1 = null;
                int max_day = 0;
                System.out.print("Введите месяц и нажмите enter: ");
                int month = sc.nextInt();
                switch (month){
                    case 1: s1 = "Января"; max_day = 31; break;
                    case 2: s1 = "Февраля"; max_day = a; /* System.out.println("a = "+ a);*/ break;
                    case 3: s1 = "Марта"; max_day = 31; break;
                    case 4: s1 = "Апреля"; max_day = 30; break;
                    case 5: s1 = "Мая"; max_day = 31; break;
                    case 6: s1 = "Июня"; max_day = 30; break;
                    case 7: s1 = "Июля"; max_day = 31; break;
                    case 8: s1 = "Августа"; max_day = 31; break;
                    case 9: s1 = "Сентябя"; max_day = 30; break;
                    case 10: s1= "Октября"; max_day = 31; break;
                    case 11: s1 = "Ноября"; max_day = 30; break;
                    case 12: s1 = "Декабря"; max_day = 31; break;
                }
                System.out.print("Введите день и нажмите enter: ");
                int day = sc1.nextInt();
                if (s1== null || day <=0 || year <=0 || day > max_day)
                    System.out.println("ВВДИТЕ ПРАВИЛЬНУЮ ДАТУ!!!");
                else
                    System.out.println("Дата правильна:  " + day +" "+ s1 + " " + year + " года");
        }

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Программа Какой год");
        System.out.print("Введите год и нажмите enter: ");
        int year = sc3.nextInt();
        int i2 = year;
        if (i % 4 == 0) {
            if ((i2 % 100 != 0) || (i2 % 400 == 0))
                System.out.print("Год високосный ");
        }
        else{
            System.out.print("Год не високосный ");}

        Scanner sc4 = new Scanner(System.in);
        System.out.println("Программа склонение \"Рубль\"");
        System.out.print("Введите число и нажмите enter: ");
        int i3 = sc4.nextInt();
        if (i3 % 10 == 0 || i3 % 10 >= 5 || i3 % 100 >= 10 && i3 % 100 <= 20)
            System.out.println(i + " Рублей");
        else
        if (i3 > 1 && i3 < 5 || i3 % 10 > 1 && i3 % 10 < 5)
            System.out.println(i + " Рубля");
        else
            System.out.println(i + " Рубль");


        Scanner sc5 = new Scanner(System.in);
        System.out.println("Программа сравнения двух строк");
        System.out.print("Введите первое слово и нажмите enter: ");
        String word1 = sc5.nextLine();
        System.out.print("Введите второе словои нажмите enter: ");
        String word2 = sc5.nextLine();
        if (word1.equals(word2))
            System.out.print("Отлично! Слова одинаковы.");
        else
        if (word1.equalsIgnoreCase(word2))
            System.out.print("Хорошо! Слова почти одинаковы.");
        else
        if (word1.length() == word2.length())
            System.out.print("Ну, хотябы они одной длинны");
        else
            System.out.print("Все пропало!!! Очень разные.");
    }
}
