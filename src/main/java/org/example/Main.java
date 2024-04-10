package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");
        int n = sc.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int m = sc.nextInt();
        logger.log("Создаём и наполняем список");
        //
        List list = new ArrayList();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(m));
        }
        //
        System.out.print(STR."Вот случайный список: \{list}");
        System.out.println();
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        Filter filter = new Filter(sc.nextInt());
        logger.log("Запускаем фильтрацию");
        List listF = filter.filterOut(list);
        logger.log("Выводим результат на экран");
        System.out.println(STR."Отфильтрованный список: \{listF}");
        logger.log("Завершаем программу");
    }
}