package Chapter3;

public class varArgs {

	public void printNumbers(double ...numbers) {
		for(double i:numbers) {
			System.out.println(i);
		}
	}
	
	public void print2(String name, int ...marks) {
		System.out.println(name);
		for(int i : marks) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		varArgs a = new varArgs();
		a.printNumbers(11.1,12,13,14);
		a.print2("Amar",96,93,93,75,84);

	}

}
