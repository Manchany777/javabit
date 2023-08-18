package class_;

public class ComputeMain {

	public static void main(String[] args) {
		Compute[] compute = new Compute[3];
		compute[0] = new Compute();
		compute[1] = new Compute();
		compute[2] = new Compute();
		
		compute[0].setX(320); compute[0].setY(256);
		compute[1].setX(258); compute[1].setY(127);
		compute[2].setX(572); compute[2].setY(326);
		
		System.out.println("X"+"\t"+" Y"+"\t"+" 합"+"\t"+" 차"+"\t"+" 곱"+"\t"+" 몫");
		for(int i=0 ; i < compute.length; i++) {
			compute[i].calc();
			
			System.out.println(compute[i].getX()+"\t"
		    		 +compute[i].getY()+"\t"
		    		 +compute[i].getSum()+"\t"
		    		 +compute[i].getSub()+"\t"
		    		 +compute[i].getMul()+"\t"
		    		 +String.format("%.3f",compute[i].getDiv()));
			System.out.println();
		}
	}
}