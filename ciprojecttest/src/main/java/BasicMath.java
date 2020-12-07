
public class BasicMath{
	
	public double add(double a, double b){
		
		double c;
		c = a + b;

		return c;
	}

	public double returnLessNum( double a, double b){

		double c;

		if(a < b){
			c = a;
		}
		else{
			c = b;
		}
		return c;
	}
	
	public double returnGreaterNum(double a, double b){
		double c;
		
		if(a>b){
			c = a;
		}
		else{
			c = b;
		}
		
		return c;
		
}
}