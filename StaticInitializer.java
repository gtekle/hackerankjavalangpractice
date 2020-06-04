import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticInitializer {
public static Scanner sc=new Scanner(System.in);

public static int B=sc.nextInt();
public static int H=sc.nextInt();

public static boolean flag = initializeClassVariable();

private static boolean initializeClassVariable() {
    
    if(B > 0  && H > 0){
        return true;
    } else {
        System.out.println("java.lang.Exception: Breadth and height must be positive");
        return false;
    }
}


public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.println(area);
		}
		
	}//end of main

}//end of class