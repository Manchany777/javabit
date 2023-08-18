package abstract_;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberMain {

	public static void main(String[] args) {
		//NumberFormat nf1 = new NumberFormat(); // 추상 클래스라 생성이 안된다. so, 자식클래스를 사용해야함
		
		// 3자리마다 ,를 찍고 소수이하 3째자리 반올림
		NumberFormat nf = new DecimalFormat(); // Sub class인 DecimalFormat을 이용하여 생성
		System.out.println(nf.format(12345678.456789));
		System.out.println(nf.format(12345678));
		System.out.println();
		
		// 유효숫자가 아닌 것은 표시하지 않는다.
		NumberFormat nf2 = new DecimalFormat("#,###.##원"); 
		System.out.println(nf2.format(12345678.456789));
		System.out.println(nf2.format(12345678));
		System.out.println();
		
		// 강제로 0을 표시
		NumberFormat nf3 = new DecimalFormat("#,###.00원"); 
		System.out.println(nf3.format(12345678.456789));
		System.out.println(nf3.format(12345678));
		System.out.println();
		
		//NumberFormat nf4 = NumberFormat.getInstance(); // 메소드를 이용하여 생성
		NumberFormat nf4 = NumberFormat.getCurrencyInstance(); // 메소드를 이용하여 생성 // 현재 서버가 있는 나라의 화폐단위 표시
		nf4.setMaximumFractionDigits(2); // 소수이하 둘쨰자리까지만 표시
		nf4.setMinimumFractionDigits(2); // 소수이하 둘쨰자리까지 표시하는데, 비어있는 자리는 0을 강제로 표시
		System.out.println(nf4.format(12345678.456789));
		System.out.println(nf4.format(12345678));
		System.out.println();
		
		//NumberFormat nf5 = NumberFormat.getInstance(Locale.US); // 메소드를 이용하여 생성
		NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.US); // 메소드를 이용하여 생성 // 특정 국가의 화폐단위 강제표시 (엔화, 위안화는 기호가 같다 주의) ㅕ
		nf5.setMaximumFractionDigits(2); // 소수이하 둘쨰자리까지만 표시
		nf5.setMinimumFractionDigits(2); // 소수이하 둘쨰자리까지 표시하는데, 비어있는 자리는 0을 강제로 표시
		System.out.println(nf5.format(12345678.456789));
		System.out.println(nf5.format(12345678));
		System.out.println();
	}
}
