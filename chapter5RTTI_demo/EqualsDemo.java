package chapter5RTTI_demo;

public class EqualsDemo {

	public static void main(String[] args) {
		Mothod_ObjectClass e1 = new Mothod_ObjectClass(101,"Amar");
		Mothod_ObjectClass e2 = new Mothod_ObjectClass(102,"Aaditya");
		Mothod_ObjectClass e3 = new Mothod_ObjectClass(101,"Amar");
		
		System.out.println("Class of e1:"+ e1.getClass());
		
		System.out.println("Hash code of e1" + e1.hashCode());
		System.out.println("Hash code of e2" + e2.hashCode());
		System.out.println("Hash code of e2" + e3.hashCode());
		System.out.println();
		
		
		if(e1.equals(e3)) {
			System.out.println("Matched");
		}else {
			System.out.println("Not matched");
		}
		
		if(e1.equals(e2)) {
			System.out.println("Matched");
		}else {
			System.out.println("Not matched");
		}
		
		if(e2.equals(e3)) {
			System.out.println("Matched");
		}else {
			System.out.println("Not matched");
		}
	}

}
