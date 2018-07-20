package ru.geekbrains.Java_Algorithms.Lesson_3;

class Reverser {
    private String input;               // входная строка
    private String output;              // выходная строка

    public Reverser(String input) {
        this.input = input;
    }

    public String dorev(){              // Метод переставноки симовлов
        int stackSize =input.length();  //определение размера стека
        StackCahrImpl stackCahr = new StackCahrImpl(stackSize); // создание стека
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);      // чтение символа из входного потока
            stackCahr.push(ch);             // занесение в стек
        }
        output = "";
        while (!stackCahr.isEmpty()){
            char ch = (char) stackCahr.pop();
            output += ch;
        }
        return output;
    }
}
