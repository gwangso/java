package Day13;

public abstract class Salary {
	int salary;
	public abstract void tax(); 
}

class FullTimer extends Salary {
	public void tax() {
		double tax = salary * 0.1;
		System.out.println("정규직 세금 : " + tax);
	}
}

class Contract extends Salary {
	public void tax() {
		double tax = salary * 0.033;
		System.out.println("계약직 세금 : " + tax);
	}
}

class SalaryMain {
	public static void run() {
		FullTimer a = new FullTimer();
		Contract b = new Contract();
		
		a.salary = 2000000;
		b.salary = 1000000;
		a.tax();
		b.tax();
		
	}
}