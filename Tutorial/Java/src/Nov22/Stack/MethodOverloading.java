class Main {
	static int x1;
	
	public static void main(String args[]) {
		
	}
	/// NOT Overloaded
	public static void SayHi(){
		System.out.println("Hi");
	}

	public static String SayHi(){
		return "Hi" + name;
	}
	
	/// Overloaded
	public static void SayHi(){
		System.out.println("Hi");
	}

	public static String SayHi(String name){
		return "Hi" + name;
	}
}
	
	
