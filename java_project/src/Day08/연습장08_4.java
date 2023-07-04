package Day08;

import java.util.Timer;
import java.util.TimerTask;

public class 연습장08_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Timer m = new Timer();
		TimerTask task = new TimerTask() {
			int count = 0;
		
			@Override
			public void run() {
				if(count < 5) {
					count++;
				}else {
					System.out.println("시간초과");
				}				
			}
			
		};
		m.schedule(task, 3000, 1000);
		
		
	}

}
