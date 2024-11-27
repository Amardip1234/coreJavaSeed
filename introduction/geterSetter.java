package introduction;


class MobileDevice {
	private String brandName;
	private int price,model,storage;
	
	public void setdata(String brand,int price,int model,int storage) {
		brandName = brand;
		this.price = price;
		this.model = model;
		this.storage = storage;
		
	}
	public void getdata() {
		System.out.println("BrandName = "+ brandName);
		System.out.println("Price = " + price);
		System.out.println("Model = " +model);
		System.out.println("Storage = "+ storage);
	}
}

class chair{
	private int legs,price;
	private String material;
	
	public void setchain(int legs,int price,String material) {
		this.legs = legs;
		this.price = price;
		this.material = material;
	}
	public void getchain() {
		System.out.println(legs);
		System.out.println(price);
		System.out.println(material);
	}
	
}

class customer{
	int customerID;
	String customerName;
	String city;
	
	customer(){
		
	}
	customer(int customerID,String customerName, String city){
		this.customerID = customerID;
		this.customerName = customerName;
		this.city = city;
	}
	public void print() {
		System.out.println(customerID);
		System.out.println(customerName);
		System.out.println(city);
	}
}

class Math{
	public int add(int a, int b) {
		return a+b;
	}
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	public float add(float a, int b) {
		return a+b;
	}
}

public class geterSetter {
		
	
	public static void main(String[] args) {
		
		MobileDevice m1 = new MobileDevice();
		m1.setdata("iphone", 80000, 16, 128);
//		m1.getdata();
//		chair c1 = new chair();
//		c1.setchain(4, 5000, "wooden");
//		c1.getchain();
		
		customer cust1 = new customer(1,"Amar","Mumbai");
		cust1.print();
		customer cust2 = new customer(2,"Adi","Powai");
		cust2.print();
	}

}
