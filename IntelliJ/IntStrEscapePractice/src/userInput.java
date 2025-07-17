import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please Enter Name");
        String name=scanner.nextLine();
        System.out.println("Hello"+ name);

    }
}
