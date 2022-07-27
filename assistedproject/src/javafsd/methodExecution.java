package javafsd;

public class methodExecution {

public int multipynumbers(int a,int b) {
	int x=a*b;
	return x;
}

public static void main(String[] args) {

	methodExecution b=new methodExecution();
	int ans= b.multipynumbers(10,6);
	System.out.println("Multipilcation is :"+ans);
	}
}
