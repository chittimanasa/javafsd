package assistedproject2;

public class Polymorphism {
	
	 public int sum(int x, int y) 
	    { 
	        return (x + y); 
	    } 
	    public int sum(int x, int y, int z) 
	    { 
	        return (x + y + z); 
	    } 
	    public double sum(double x, double y) 
	    { 
	        return (x + y); 
	    } 
	    public static void main(String args[]) 
	    { 
	        Polymorphism s = new Polymorphism(); 
	        System.out.println(s.sum(50, 60)); 
	        System.out.println(s.sum(50, 60, 70)); 
	        System.out.println(s.sum(50.5, 60.5)); 
	    } 


}