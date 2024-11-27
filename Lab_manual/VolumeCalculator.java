package Lab_manual;

public class VolumeCalculator {
	private final double pi;
	
	
	public VolumeCalculator() {
		pi = 3.14;
	}
	
	public double calculateVolume(double radius, double height) {
		return pi*radius*radius*height;
	}

	 	
	public double calculateVolume(int length,int breadth,int height) {
		return length * breadth * height;
	}
	
	public static void main(String[] args) {
		VolumeCalculator v = new VolumeCalculator();
		 double volume1 =  v.calculateVolume(4, 4,4);
		 System.out.println("Volume of cuboid: "+volume1);
		 System.out.println("Volume of cylinder:"+v.calculateVolume(3,14));
	}

}
