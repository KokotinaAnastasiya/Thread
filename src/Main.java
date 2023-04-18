import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число потоков");
        int numberThread = scanner.nextInt();

        System.out.println("Введите время выполнения потока в сек.");
        int numberThread2 = scanner.nextInt();

         ThreadCreate.threadGo(numberThread,numberThread2);

         System.out.println("Sleep!!!");
         Thread.sleep(5000);
         System.out.println("Good morning!");
    }
}
