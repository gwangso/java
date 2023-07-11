package Day13;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		SalaryMain.run();
//		
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");

//		String d = "20230315";
//		String form = String.format("%s-%s-%s", 
//				d.substring(0, 4),
//				d.substring(4, 6),
//				d.substring(6,8));
//		System.out.println(form);
		int a = 0;
		System.out.println("값입력");
		if (sc.hasNextInt()) {
			a = sc.nextInt();
			sc.nextLine();
		}else {
			a=(1);
			sc.nextLine();
		}
		
		System.out.println(a);
		
//		System.out.println(Date.valueOf(sdf.format(d)));
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
