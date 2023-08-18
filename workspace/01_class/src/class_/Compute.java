package class_;

public class Compute {
	private int x;
	private int y;
	private int sum; // 합
	private int sub; // 차
	private int mul; // 곱
	private double div; // 몫
	
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getSum() {
		return sum;
	}
	public int getSub() {
		return sub;
	}
	public int getMul() {
		return mul;
	}
	public double getDiv() {
		return div;
	}
	
	
	public int setX(int x) {
		return this.x = x;
	}
	public int setY(int y) {
		return this.y = y;
	}
	
	
	public void calc() {
		sum = x + y;
		sub = x - y;
		mul = x * y;
		div = (double) x / y;
	}
}
