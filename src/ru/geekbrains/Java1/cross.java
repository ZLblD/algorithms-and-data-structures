package ru.geekbrains.Java1;


import java.util.Random;
import java.util.Scanner;

public class cross {

    // 3. Определяем размеры массива
    static final int SIZE_X = 5;
    static final int SIZE_Y = 5;

    // 1. Создаем двумерный массив
    static char[][] field = new char[SIZE_Y][SIZE_X];

    // 2. Обозначаем кто будет ходить какими фишками
    static final char PLAYER_DOT = 'X';
    static final char AI_DOT = '0';
    static final char EMPTY_DOT = '.';

    // 8. Создаем сканер
    static Scanner scanner = new Scanner(System.in);
    // 12. Создаем рандом
    static final Random rand = new Random();

    // 4. Заполняем на массив
    private static void initField() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                field[i][j] = EMPTY_DOT;
            }
        }
    }

    // 5. Выводим на массив на печать
    private static void printField() {
        //6. украшаем картинку
        System.out.println("-------");
        for (int i = 0; i < SIZE_Y; i++) {
            System.out.print("|");
            for (int j = 0; j < SIZE_X; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
        //6. украшаем картинку
        System.out.println("-------");
    }

    // 7. Метод который устанавливает символ
    private static void setSym(int y, int x, char sym) {
        field[y][x] = sym;
    }

    // 9. Ход игрока
    private static void playerStep() {
        // сначала написать вот так
//        System.out.println("Введите координаты: X Y (1-3)");
//        int x = scanner.nextInt() - 1;
//        int y = scanner.nextInt() - 1;
//        setSym(y, x, PLAYER_DOT);
//
        // 11. переписываем с проверкой
        int x;
        int y;
        do {
            System.out.println("Введите координаты: X Y (1-5)");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(y, x));
        setSym(y, x, PLAYER_DOT);

    }

    // 13. Ход ПК
    private static void aiStep() {
        int x;
        int y;
        do {
            x = rand.nextInt(SIZE_X);
            y = rand.nextInt(SIZE_Y);
        } while (!isCellValid(y, x));
        setSym(y, x, AI_DOT);
    }

    // 14. Проверка победы
    private static boolean checkWin(char sym) {
        for (int i=0; i<field.length-4+1; i++) {
            for (int j=0; j<field.length-4+1; j++) {
                if (checkDiagonal(sym, i, j) || checkLanes(sym, i, j)) return true;
            }
        }
        return false;
    }


    static boolean checkLanes(char sym, int offsetX, int offsetY) {
        boolean cols, rows;
        for (int i = offsetX; i < 4 + offsetX; i++) {
            cols = true;
            rows = true;
            for (int j = offsetY; j < 4 + offsetY; j++) {
                cols = cols & (field[i][j] == sym);
                rows = rows & (field[j][i] == sym);
            }

            if (cols || rows) return true;
        }

        return false;
    }

    static boolean checkDiagonal(char sym, int offsetX, int offsetY) {
        boolean toright, toleft;
        toright = true;
        toleft = true;
        for (int i = 0; i < 4; i++) {
            toright = toright & (field[i + offsetX][i + offsetY] == sym);
            toleft = toleft & (field[4 - i - 1 + offsetX][i + offsetY] == sym);
        }

        if (toright || toleft) return true;

        return false;
    }


    // 16. Проверка полное ли поле? возможно ли ходить?
    private static boolean isFieldFull() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                if (field[i][j] == EMPTY_DOT) {
                    return false;
                }
            }
        }
        return true;
    }

    // 10. Проверяем возможен ли ход
    private static boolean isCellValid(int y, int x) {
        // если вываливаемся за пределы возвращаем false
        if (x < 0 || y < 0 || x > SIZE_X - 1 || y > SIZE_Y - 1) {
            return false;
        }
        // если не путое поле тоже false
        return (field[y][x] == EMPTY_DOT);
    }

    public static void main(String[] args) {
        // 1 - 1 иницируем и выводим на печать
        initField();
        printField();
        // 1 - 1 иницируем и выводим на печать

        // 15 Основной ход программы

        while (true) {
            playerStep();
            printField();
            if (checkWin(PLAYER_DOT)) {
                System.out.println("Player WIN!");
                break;
            }
            if (isFieldFull()) {
                System.out.println("DRAW");
                break;
            }

            aiStep();
            printField();
            if (checkWin(AI_DOT)) {
                System.out.println("Win SkyNet!");
                break;
            }
            if (isFieldFull()) {
                System.out.println("DRAW!");
                break;
            }
        }
    }
}
