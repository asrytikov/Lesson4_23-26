/*
* Д/з: Необходимо написать простой консольный калькулятор на Java. Для считывания ввода нужно использовать класс Scanner.
* В конце напечатать результат. Используйте форматированный вывод. Пока пусть работает так, пользователь вводит целые числа,
* а на вывод передается результат 4-х операций(+, -, *, /) без выбора операции. В дальнейшем будете дорабатывать приложение.
* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        System.out.println("Сумма: " + (a+b));
        System.out.println("Разность: " + (a-b));
        System.out.println("Произведение: " + (a*b));
        System.out.println("Частное: " + ((double)a/b));
        scanner.close();
    }
}