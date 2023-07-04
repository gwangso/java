package ex02;

public class ScoreVO {
	private static String num = "0000";
	
	private String sno;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	private String grd;
	
	public ScoreVO() {
		
	}
	
	public ScoreVO(String sno, String name, int kor, int eng, int mat) {
		this.sno = "2023"+ sno;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		tot = kor + eng + mat;
		avg = (kor + eng + mat)/3.;
		if (avg >= 90) {
			if (avg >= 95) {
				grd = "A+";
			} else {
				grd = "A0";
			}
		} else if (avg >= 80) {
			if (avg >= 85) {
				grd = "B+";
			} else {
				grd = "B0";
			}
		} else if (avg >= 70) {
			if (avg >= 75) {
				grd = "C+";
			} else {
				grd = "C0";
			}
		} else if (avg >= 60) {
			if (avg >= 65) {
				grd = "D+";
			} else {
				grd = "D0";
			}
		} else {
			grd = "F";
		}
	}
	
	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getTot() {
		return tot;
	}

	public void setTot() {
		this.tot = kor+eng+mat;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg() {
		this.avg = (kor+eng+mat)/3.;
	}

	public String getGrd() {
		return grd;
	}

	public void setGrd() {
		if (avg >= 90) {
			if (avg >= 95) {
				grd = "A+";
			} else {
				grd = "A0";
			}
		} else if (avg >= 80) {
			if (avg >= 85) {
				grd = "B+";
			} else {
				grd = "B0";
			}
		} else if (avg >= 70) {
			if (avg >= 75) {
				grd = "C+";
			} else {
				grd = "C0";
			}
		} else if (avg >= 60) {
			if (avg >= 65) {
				grd = "D+";
			} else {
				grd = "D0";
			}
		} else {
			grd = "F";
		}
	}
	
	@Override
	public String toString() {
		return "ScoreVO [sno=" + sno + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", tot="
				+ tot + ", avg=" + avg + ", grd=" + grd + "]";
	}

	public void print_land() {
		System.out.printf("학생 성적\t\t%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%s\n",sno, name, kor, eng, mat, tot, avg, grd);
	}

	public void print_port() {
		System.out.println("학생 정보");
		System.out.println("---------------------");
		System.out.println("학번 : " + sno);
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("총점 : " + tot);
		System.out.printf("평균 : %.2f\n",avg);
		System.out.println("성적 : " + grd);
	}
	
}