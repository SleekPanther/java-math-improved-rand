public class MathImprovedRandom {
	
	//Returns a double between 0 and 1
	public static double random(){
		return Math.random();
	}
	
	//Returns a double between 0 and upperBound
	public static double random(double upperBound){
		return Math.random() * upperBound;
	}
	
	//Returns a `double` between lowerBound and upperBound
	public static double random(double lowerBound, double upperBound){
		double range = upperBound - lowerBound;
		return (Math.random()*range) + lowerBound;
	}
	
	
	//Returns an integer between 0 and Integer.MAX_VALUE (like Random class nextInt() )
	public static int randInt(){
		return (int) (Math.random() * Integer.MAX_VALUE);		//use MAX_VALUE to simulate behavior of nextInt() from the defualt Random class 
	}
	
	//Returns an integer between 0 and upperBound.  EXCLUDING upperBound
	public static int randInt(int upperBound){
		return (int) (Math.random() * upperBound);
	}
	
	//Returns an integer between lowerBound and upperBound. INCLUDING upperBound
	public static int randInt(int lowerBound, int upperBound){
		int range = upperBound - lowerBound +1;
		return (int) (Math.random()*range + lowerBound);
	}
	
	
	public static void main(String[] args) {
		System.out.println(MathImprovedRandom.random(10,20));
		for(int i=0; i< 30; i++){
			if( (int)MathImprovedRandom.random(10,20) == 20){
				System.out.println("found double  term");
			}
		}
		
		System.out.println(MathImprovedRandom.randInt(10,20));
		for(int i=0; i< 30; i++){
			if( MathImprovedRandom.randInt(10,20) == 20){
				System.out.println("found integer term");
			}
		}
	}
}
