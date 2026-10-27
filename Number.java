package aarya;

public class Number {
	int num;
	Number()
	{
		num=10;
	}
	Number(int a)
	{
		num=a;
	}
	void display() {
		System.out.println("num="+num);
	}
}
class CDemo
{
	public static void main(String[]args)
	{
		Number obj1 = new Number();
		Number obj2 = new Number(50);
		
		obj1.display();
		obj2.display();
	}
}
