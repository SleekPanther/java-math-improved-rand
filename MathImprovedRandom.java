public class MathImprovedRandom {
	
	public static double random(){
		return Math.random();
	}
	
	public static double random(double upperBound){
		return Math.random() * upperBound;
	}
	
	public static double random(double lowerBound, double upperBound){
		double range = upperBound - lowerBound;
		return (Math.random()*range) + lowerBound;
	}
	
	
	public static int randInt(){
		return (int) (Math.random() * Integer.MAX_VALUE);		//use MAX_VALUE to simulate behavior of nextInt() from the defualt Random class 
	}
	
	public static int randInt(int upperBound){
		return (int) (Math.random() * upperBound);
	}
	
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