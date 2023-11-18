import java.util.Scanner; // импортируем класс

public class Project0 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double i = 2;
            System.out.print("Введите целое число: ");
            if (sc.hasNextDouble()) { // возвращает истину если с потока ввода можно считать целое число
                i = sc.nextDouble(); // считывает целое число с потока ввода и сохраняем в переменную
                System.out.println(i * 2);
            } else {
                System.out.println("Вы ввели не целое число");
            }
        }
    }
}
