package AlfizaPakage;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Table {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Number:");
		int n=Integer.parseInt(br.readLine());
		for(int i=1;i<=10;i++) {
			System.out.println(n+"x"+i+"="+(n*i));
			
		}
		

	}

}
