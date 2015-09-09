package exercise1dot3;

public class MyPoint {
	
	private int x;
	private int y;
	
	public MyPoint() {}
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	public double distance(int x, int y) {
		return Math.sqrt((Math.pow(x-this.x, 2))+(Math.pow(y-this.y, 2)));
	}
	
	public double distance(MyPoint another){
		return Math.sqrt((Math.pow(another.x-x, 2))+(Math.pow(another.y-y, 2)));
	}

	
	public boolean equals(MyPoint another) {
		if (x == another.x && y == another.y){
			
		return true;
		}else return false;
	}
	

}
