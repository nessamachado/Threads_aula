package threads;


import java.text.SimpleDateFormat;
import java.util.Date;

public class SaudacaoThread implements Runnable {

	@Override
	public void run() {
		while(true) {
			long milliSeconds = System.currentTimeMillis();
			SimpleDateFormat sdf = new SimpleDateFormat ("HH:mm:ss");
			Date resultdate = new Date(milliSeconds);
			String formattedDate = sdf.format(resultdate);
			if(formattedDate.equals("8:00:00")) {
				System.out.println("Bom dia!");
			} else if (formattedDate.equals("12:00:00")) {
				System.out.println ("Boa tarde!");
			} else if (formattedDate.equals("17:30:00")) {
				System.out.println("Boa noite!");
			}
			else {
				try {
					Thread.sleep(1000);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	
	
	
}
