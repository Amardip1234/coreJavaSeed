package chapter6innerClass;
interface MaxOf{
	public int max(int a, int b);
}
interface Multiply{
	public int mult(int a, int b);
}
interface Length{
	public int len(String n);
}
interface Cube{
	public int printcube(int a);
}
interface Add{
	public int printAddd(int a, int b);
}
interface Num{
	public void print(int a);
}
public class LambdaExpression {

	public static void main(String[] args) {
		Num n = (a)->{System.out.println("Hello "+a);};
		n.print(20);
		
		Add a = (c,b)->{return(c+b);};
		System.out.println(a.printAddd(20, 30));
		
		Cube c = (d)->(d*d*d);;
		System.out.println(c.printcube(2));
		
		Length l = (k)->{return k.length();};
		System.out.println(l.len("Amar"));
		
		MaxOf m = (num1,num2)->
		{
			if(num1>num2) return num1;
			else return num2;
			
		};
		System.out.println(m.max(5, 7));
		
		Multiply mul = (int nu1,int nu2)->
		{
			int result = nu1*nu2;
			return result;
		};
		System.out.println(mul.mult(3, 6));
	}	

}
