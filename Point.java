
public class Point {

	private int x;
	private int y;
	
	public Point (int initialX, int initialY) {
		x = initialX;
		y = initialY;
	}

	public void setX(int changeX) {
		x = changeX;
	}
	
	public void setY(int changeY) {
		y = changeY;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	public boolean isVertical(int randomX) {
		boolean isIt = false;
		
		if (randomX == x) {
			isIt = true;
		}
		return isIt;
	}
	
	public int quadrant() {
		int whatQuadrant = 0;
		
		if (x > 0 && y > 0) {
			whatQuadrant = 1;
		} else if (x < 0 && y > 0) {
			whatQuadrant = 2;
		} else if (x < 0 && y < 0) {
			whatQuadrant = 3;
		} else if (x > 0 && y < 0) {
			whatQuadrant = 4;
		} else if (x == 0 || y == 0) {
			whatQuadrant = 0;
		}
		return whatQuadrant;
	}
	
	
	public static void main(String[] args) {
		Point p1 = new Point (1,5);
		Point p2 = new Point (0,5);
		
		System.out.println("Point 1 is: " + p1.toString());
		System.out.println("Point 2 is: " + p2.toString());
		
		p1.setX(-5);
		p1.setY(15);
		
		p2.setX(-4);
		p2.setY(-10);
		
		System.out.println("You have changed your initial X and Y for Point 1 and the new values of X and Y are: " + p1.toString());
		System.out.println("You have changed your initial X and Y for Point 2 and the new values of X and Y are: " + p2.toString());
		
		System.out.println("Is your inputted X, vertical to the initial X: " + p1.isVertical(-5));
		
		System.out.println("The initial point is in quadrant: " + p1.quadrant());
		System.out.println("The initial point is in quadrant: " + p2.quadrant());
	}


}
