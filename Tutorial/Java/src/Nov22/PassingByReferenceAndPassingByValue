class Main {
	static int x1;
	
	public static void main(String args[]) {
		Point p = new Point(); // object creation
		// ClassName objectName 
		//Person Sahil = new Person();
		// dot operator -> (.) it is used to fetch fields and method of class
		//Person Sahil = new Person();
		//int age = Sahil.age;
		//Sahil.Walk();
		p.x = 4;
		p.y = 9;
		System.out.println("In main method, before swap method x = " + p.x + " y = " + p.y);
		Swap(p); // passing by reference
		System.out.println("In main method, after swap method x = " + p.x + " y = " + p.y);
		
		// passing by value
		Swap(p.x, p.y);
	}
	
	// passing by reference
	public static void Swap(Point p){
		// logic to Swap 
		int temp = p.x;
		p.x = p.y;
		p.y = temp;
		System.out.println("In swap method x = " + p.x + " y = " + p.y);
	}
	//passing by value
	public static void Swap(int x, int y){
		int temp = x;
		x = y;
		y = temp;
		System.out.println("In swap method x = " + x + " y = " + y);
	}
}

class Point{
	public int x;
	public int y;
}

class Person{
	String name;
	int age;
	
	public void Walk(){}
	public void Sleep(){}
}

class House{
	String Name;
	int numOfRooms;
	float SqFootage;
	
	void TurnOnElectricity();
	void TurnOFFElectricity();
	void TurnOnWaterSupply();
}
