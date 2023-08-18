package class_;

class SungJuk{
   private String name;
   private double avg;
   private int tot;
   private int kor;
   private int eng;
   private int math;
   private char grade;
   
   public String getName(){
      return name;
   }
   public int getKor(){
      return kor;
   }
   public int getEng(){
      return eng;
   }
   public int getMath(){
      return math;
   }
   public int getTot(){
      return tot;
   }
   public double getAvg(){
      return avg;
   }
   public char getGrade(){
      return grade;
   }
	   
   public void setData(String name, int kor, int eng, int math){
	  System.out.println("this = " + this);   // aa의 경우 this = class_.SungJuk@7e774085 (클래스가 가지고 있는 나의 객체 주소)
	  this.name = name;  // 여기는 t his 줘야함 안그러면 null값 나옴. why? name이 어디있는 name인지 모르니까
	  this.kor = kor;
	  this.eng = eng;
	  this.math = math;
   }
   
   public void calcTot(){
	   tot = kor + eng + math;  // 안에서는 어차피 구분이 되기에 this가 의미없다.(this가 숨어있음)
   }
   public void calcAvg(){
	   avg = (double) tot/3.0;
   }
   
	public void calcGrade() {
		if(avg>=90) {
			grade = 'A';
		}else if(avg>=80) {
			grade= 'B';
		}else if(avg>=70) {
			grade= 'C';
		}else if(avg>=60) {
			grade= 'D';
		}else {
			grade= 'F';
		}
	}
   
/*	public void calcGrade(){
      
      switch ((int)(avg/10)) {
      case 9: case 10:
    	 grade = "A";
         break;
      case 8:
    	 grade = "B";
         break;
      case 7:
    	 grade = "C";
         break;
      case 6:
    	 grade = "D";
         break;
      default:
    	 grade = "F";
         break;
      }
   }*/
}
