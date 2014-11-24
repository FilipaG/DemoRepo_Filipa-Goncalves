
public class Lab02p3 {

	public static void main(String[] args) {
		int x = 33;
		int y = 40;
		int z = 20;
		String result;
		if (x > y) {
			if (y > z)
				result = "The value of x is higher than y and z";
		
			else if (x > z) {
				result = "The value of x is higher than y and z";
			}
			else
				result ="The value of z is higher than x and y";	
		}
		else {
			if (x > z)	
		     result = "The value of y is higher than x and z";
		     else if (y > z) {
					result = "The value of y is higher than x and z";
				}
			 else
					result ="The value of z is higher than x and y";  
		}
		System.out.println(result);
		}
	}
