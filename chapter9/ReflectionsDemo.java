package chapter9;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class Reflection1{
	public Reflection1() {
		System.out.println("Hello");
	}
	public void display() {
		System.out.println("I am amar");
	}

	public void makeSound() {
		System.out.println("Wouuuu");
	}
}
public class ReflectionsDemo {
	
	public static void main(String[] args) {
		Reflection1 r = new Reflection1();
		Class obj = r.getClass();
		System.out.println(obj);
		
		String name = obj.getName();
		System.out.println("Name of Class "+name);
		
		Class superClass = obj.getSuperclass();
		System.out.println("SuperClass :"+ superClass.getName());
		
		Method methods[] = obj.getDeclaredMethods();
		System.out.println();
		for(Method m : methods) {
			System.out.println("Method Name: "+m.getName());
			
			int modifier = m.getModifiers();
			System.out.println("Modifier: "+Modifier.toString(modifier));
			
			System.out.println("Return Types: "+ m.getReturnType());
			System.out.println();
		}
		
			
		

	}

}
