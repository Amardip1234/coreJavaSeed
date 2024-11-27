package chapter5RTTI_demo;

public class Mothod_ObjectClass {
	private int empId;
	private String name;
	
	public Mothod_ObjectClass() {
		empId = 101;
		name  = "Amar";
	}

	public Mothod_ObjectClass(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}
	
	
	public boolean equals(Object ob) {
		
		if(ob instanceof Mothod_ObjectClass) {
			Mothod_ObjectClass e = (Mothod_ObjectClass)ob;
			if(this.empId == e.empId && this.name.equals(e.name))
			return true;
		}
		
		return false;
	}
	
}
