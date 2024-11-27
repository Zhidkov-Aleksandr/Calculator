import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        // Добавляем новый сканер
        Scanner s = new Scanner(System.in);

        // Программа выводит приветствие
        System.out.println("Добро пожаловать в вычислительный центр.\nВведите число:");

        // Считываем первое число, с проверкой на правильность ввода
        double number1 = 0;
        if (s.hasNextDouble()) {
            number1 = s.nextDouble();
        } else {
            System.out.println("Вы ввели не целое число");
            System.exit(0);
        }

        // Считываем знак арифметического действия
        System.out.println("Теперь введите арифметический знак (+, -, /, *): \n(или введите S, для остановки программы)");
        char operation = s.next().charAt(0);
        if (operation == '+' || operation == '-' || operation == '*' || operation == '/') {

        } else if (operation == 's' || operation == 'S') {
            System.out.println("Завершение работы");
            System.exit(0); // Завершение работы при вводе команды S
        } else {
            System.out.println("Ошибка: Нужно ввести один из знаков (+, -, /, *)");
            System.exit(0);// Закрываем программу из-за неправильно введённого знака
        }

        // Считываем второе число, с проверкой на правильность ввода
        System.out.println("Осталось ввести второе число:");
        double number2 = 0;
        if (s.hasNextDouble()) {
            number2 = s.nextDouble();
        } else {
            System.out.println("Вы ввели не целое число");
            System.exit(0);
        }

        //Преобразуем тип данных из int  в double, для того чтобы результат был без запятой
        int indouble = 0;
        //Прописываем варианты действия в зависимости от выбранного арифметического знака
        switch (operation) {
            case '+':
                double redouble = (number1 + number2);
                indouble = (int) redouble;
                System.out.println("Вы сложили два числа: " + (int) number1 + " + " + (int) number2);
                System.out.println("Результат:" + indouble);
                System.out.println("Расчет окончен, до новых встреч.");
                break;
            case '-':
                redouble = (number1 - number2);
                indouble = (int) redouble;
                System.out.println("Вы вычли из " + (int) number1 + " - " + (int) number2);
                System.out.println("Результат:" + indouble);
                System.out.println("Расчет окончен, до новых встреч.");
                break;
            case '*':
                redouble = (number1 * number2);
                indouble = (int) redouble;
                System.out.println("Вы умножили " + (int) number1 + " х " + (int) number2);
                System.out.println("Результат:" + indouble);
                System.out.println("Расчет окончен, до новых встреч.");
                break;
            case '/':
                if (number2 != 0) {
                    redouble = (number1 / number2);
                    String roundupresult = String.format("%.2f", redouble);
                    System.out.println("Вы разделили " + (int) number1 + " / " + (int) number2);
                    System.out.printf("Результат:" + roundupresult);
                    System.out.println("Расчет окончен, до новых встреч.");
                    break;
                    //Выводим сообщение о том, что на ноль делить нельзя
                } else {
                    System.out.println("Нельзя делить на ноль!");
                }
                break;
            //Выводим сообщение о неправильном знаке арифметического действия
            default:
                System.out.println("Вы ввели неверный знак.\nДопустимые знаки: (+, -, /, *)");
                // Закрываем сканер, чтобы не ел ресурсы;
                s.close();
                System.exit(0);
        }

    }
}