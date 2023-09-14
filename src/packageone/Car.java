package packageone;

public  class Car implements body,Engine {
	public void color() {
		System.out.println("black");
	}
	public void interiors() {
		System.out.println("white");
	}
	public void fourthstroke() {
		System.out.println("700gggg");
	}
	 public void oil() {
		 System.out.println("diesel");
	 }
	 public void twostroke() {
			System.out.println("563f");
		}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Car car=new Car();
     car.color();
     car.fourthstroke();
     car.interiors();
     car.oil();
	}
	
}
