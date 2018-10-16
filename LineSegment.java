import java.util.Scanner;

public class LineSegment {
	public static point a1 = new point();
	public static point b1 = new point();

	public LineSegment() {
		//main();
	}
	
	public void main() {
		System.out.println("Type in your first x and y coords");
		Scanner input = new Scanner(System.in);
		a1.setX(input.nextDouble());
		a1.setY(input.nextDouble());
		System.out.println(a1.toString());
		System.out.println("Type in your second x and y coords");
		b1.setX(input.nextDouble());
		b1.setY(input.nextDouble());
		System.out.println(b1.toString());
		drvr();
	}
	
	public static void drvr() {
		System.out.println("Type getLength, getSlope, intersectsX, intersectsY, or exit");
		Scanner input = new Scanner(System.in);
		String b = input.nextLine();
		String getLength = "getLength";
		String getSlope = "getSlope";
		String intersectsX = "intersectsX";
		String intersectsY = "intersectsY";
		String exit = "exit";
		if(b.equals(getLength)) {
			getLength();
		}else if(b.equals(getSlope)) {
			getSlope();
		}else if(b.equals(intersectsX)) {
			intersectsX();
		}else if(b.equals(intersectsY)) {
			intersectsY();
		}else if(b.equals(exit)){
			exit();		
		}else{
			System.out.print("I N V A L I D");
			drvr();
		}
	}
	
	public static void exit() {
		System.exit(0);
	}

	public static void getLength() {
		double i = b1.getX() - a1.getX();
		double j = b1.getY() - a1.getY();
		double k = Math.pow(i, 2) - Math.pow(j, 2);
		double l = Math.sqrt((double)k);
		System.out.println("Your Length is " + k);
		drvr();
	}
	
	public static void getSlope() {
		double i = b1.getY() - a1.getY();
		double j = b1.getX() - a1.getX();
		double l = i/j;
		System.out.println("Your slope is " + l);
		drvr();		
	}
	
	public static void intersectsX() {
		if (0 == a1.getY() || 0 == b1.getY())  {
			//return true;
			System.out.println("True");
			drvr();
		}else {
			//return false;
			System.out.println("False");
			drvr();
		}
	}
	
	public static void intersectsY() {
		if (0 == a1.getX() || 0 == b1.getX())  {
			//return true;
			System.out.println("True");
			drvr();

		}else {
			//return false;
			System.out.println("False");
			drvr();
			
		}
	}
	
	
	public String toString() {
		return ("(" +"Endpoints " + a1.getX() + ", " + a1.getY() + ")" + "\n" + "(" +"Endpoints " + b1.getX() + ", " + b1.getY() + ")"  );	
	}
	
	public static void main(String[] args) {
		new LineSegment();
	}
}
