import java.util.Scanner;
class UserInputAddition{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        System.out.println("Addition of two Numbers "+ (num1+num2));

    }
}
//https://www.udemy.com/course/nodejs-the-complete-guide/?couponCode=UPGRADE02223