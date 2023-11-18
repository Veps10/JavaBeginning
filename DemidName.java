import java.util.Scanner;

public class DemidName {
  public static void main(String[] args) {
    try (Scanner console = new Scanner(System.in)) {
      System.out.println("Напиши свое имя");
      String name = console.nextLine();
      System.out.println("Напиши свой возраст");
      int age = console.nextInt();

      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
    }

  }

}