package sungJuk;

import java.util.ArrayList;

public class SungJukList implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {  // 아래의 지저분한 출력문을 SungJukDTO에 toString 메서드 오버라이딩을 이용해 간단하게 표시
		System.out.println();
		
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		for(SungJukDTO sungJukDto : arrayList) {
			System.out.println(sungJukDto);
		} // for
	}// 이 방식은 calc() 메소드를 SungJukInsert에서 대신 수행
}

/*
public class SungJukList implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		calc(arrayList);  // calc() 메소드 호출
	}
	
	// calc() 메소드 추가
    private void calc(ArrayList<SungJukDTO> arrayList) {
    	 // 각 학생의 총점과 평균을 계산하고 출력
        for (SungJukDTO dto : arrayList) {
            dto.calc(); // SungJukDTO의 calc() 메소드를 호출하여 총점과 평균 계산
            System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
            		dto.getNo(), dto.getName(), dto.getKorean(),
            		dto.getEnglish(), dto.getMath(), dto.getTotal(), dto.getAvg()
            );
        } //for
    }
}
*/