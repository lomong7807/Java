package program;

import java.text.DecimalFormat;

public class Grade {
		
		private String name;
		private double koreanScore;
		private double englishScore;
		private double mathScore;
		
		public Grade(String name, double score1, double score2, double score3) {
			this.name = name;
			this.koreanScore = score1;
			this.englishScore = score2;
			this.mathScore = score3;
		}
		
		public double scoreAvg() {
			double result = (this.koreanScore+this.englishScore+this.mathScore) / 3;
			return result;
		}
		
		
		
		public static void main(String[] args) {
			
			Grade gr1 = new Grade("강백호", 90.0, 85.5, 70.0);
			Grade gr2 = new Grade("채치수", 82.0, 92.0, 60.5);
			
			DecimalFormat df = new DecimalFormat("0.00");
			
			System.out.println(gr1.name+"평균 점수: "+df.format(gr1.scoreAvg()));
			System.out.println(gr2.name+"평균 점수: "+df.format(gr2.scoreAvg()));
			
			
		}
	}

