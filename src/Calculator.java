import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        // ��������� ����� ������
        Scanner s = new Scanner(System.in);

        // ��������� ������� �����������
        System.out.println("����� ���������� � �������������� �����.\n������� �����:");

        // ��������� ������ �����, � ��������� �� ������������ �����
        double number1 = 0;
        if (s.hasNextDouble()) {
            number1 = s.nextDouble();
        } else {
            System.out.println("�� ����� �� ����� �����");
            System.exit(0);
        }

        // ��������� ���� ��������������� ��������
        System.out.println("������ ������� �������������� ���� (+, -, /, *): \n(��� ������� S, ��� ��������� ���������)");
        char operation = s.next().charAt(0);
        if (operation == '+' || operation == '-' || operation == '*' || operation == '/') {

        } else if (operation == 's' || operation == 'S') {
            System.out.println("���������� ������");
            System.exit(0); // ���������� ������ ��� ����� ������� S
        } else {
            System.out.println("������: ����� ������ ���� �� ������ (+, -, /, *)");
            System.exit(0);// ��������� ��������� ��-�� ����������� ��������� �����
        }

        // ��������� ������ �����, � ��������� �� ������������ �����
        System.out.println("�������� ������ ������ �����:");
        double number2 = 0;
        if (s.hasNextDouble()) {
            number2 = s.nextDouble();
        } else {
            System.out.println("�� ����� �� ����� �����");
            System.exit(0);
        }

        //����������� ��� ������ �� int  � double, ��� ���� ����� ��������� ��� ��� �������
        int indouble = 0;
        //����������� �������� �������� � ����������� �� ���������� ��������������� �����
        switch (operation) {
            case '+':
                double redouble = (number1 + number2);
                indouble = (int) redouble;
                System.out.println("�� ������� ��� �����: " + (int) number1 + " + " + (int) number2);
                System.out.println("���������:" + indouble);
                System.out.println("������ �������, �� ����� ������.");
                break;
            case '-':
                redouble = (number1 - number2);
                indouble = (int) redouble;
                System.out.println("�� ����� �� " + (int) number1 + " - " + (int) number2);
                System.out.println("���������:" + indouble);
                System.out.println("������ �������, �� ����� ������.");
                break;
            case '*':
                redouble = (number1 * number2);
                indouble = (int) redouble;
                System.out.println("�� �������� " + (int) number1 + " � " + (int) number2);
                System.out.println("���������:" + indouble);
                System.out.println("������ �������, �� ����� ������.");
                break;
            case '/':
                if (number2 != 0) {
                    redouble = (number1 / number2);
                    String roundupresult = String.format("%.2f", redouble);
                    System.out.println("�� ��������� " + (int) number1 + " / " + (int) number2);
                    System.out.printf("���������:" + roundupresult);
                    System.out.println("������ �������, �� ����� ������.");
                    break;
                    //������� ��������� � ���, ��� �� ���� ������ ������
                } else {
                    System.out.println("������ ������ �� ����!");
                }
                break;
            //������� ��������� � ������������ ����� ��������������� ��������
            default:
                System.out.println("�� ����� �������� ����.\n���������� �����: (+, -, /, *)");
                // ��������� ������, ����� �� �� �������;
                s.close();
                System.exit(0);
        }

    }
}