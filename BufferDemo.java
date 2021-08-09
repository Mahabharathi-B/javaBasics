import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class BufferDemo {
public static void main(String[] args) throws Exception
{    
	int bh;
System.out.println("Enter value");
//	try(BufferedReader b=new BufferedReader(new InputStreamReader(System.in))){
//   bh=Integer.parseInt(b.readLine());
//	}
//	System.out.println(bh);
	//b.close();
	//int j=9;s
Scanner sc=new Scanner(System.in);
bh=sc.nextInt();
System.out.println(bh);
	}
}


