import java.util.Scanner;

public class StringOutPutFormatting {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                System.out.println("Type in a text less than or equal to 10 chars long: ");
                String s1=sc.next();
                System.out.println("Type in number between 0 to 999: ");
                int x=sc.nextInt();
                //Complete this line
                String num = String.format("%03d", x);

                System.out.printf("%-15s", s1);
                System.out.println(num);
            }
            System.out.println("================================");

    }
}
