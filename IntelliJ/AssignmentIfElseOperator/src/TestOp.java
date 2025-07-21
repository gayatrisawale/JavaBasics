import java.lang.*;
import java.util.Scanner;
public class TestOp {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Run the test");
        System.out.println("--------ADDITION----------");
        System.out.println("Take elements value");
        int v1=scn.nextInt();
        int v2=scn.nextInt();
        int add= v1+v2;
        System.out.println("Result"+ add);
        System.out.println("--------SUBSTARCTION----------");
        float f1=scn.nextFloat();
        float f2=scn.nextFloat();
        float sub= f1-f2;
        System.out.println("Result"+ sub);
        System.out.println("--------MULTIPLICATION----------");
        long l1=scn.nextLong();
        long l2=scn.nextLong();
        long mult= l1 * l2;
        System.out.println("Result"+ mult);
        System.out.println("--------MOD----------");
        int t1=scn.nextInt();
        int t2=scn.nextInt();
        int mod= t1%t2;
        System.out.println("Result"+ mod);
        System.out.println("------------==============---------------");

        System.out.println("-----Calculate perimeter of rectangle---");
        int a= scn.nextInt();
        int b= scn.nextInt();
        int c= scn.nextInt();
        int d= scn.nextInt();
        int pm=a+b+c+d;
        System.out.println("Perimetre Result is "+pm);
        System.out.println("------------==============---------------");

    }
}
