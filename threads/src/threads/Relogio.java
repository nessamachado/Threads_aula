package threads;

public class Relogio implements Runnable {
	
	
	int segundos = 0;
	
	@Override
	public void run() { 
		while (true) {
			try {
				System.out.println(segundos);
				segundos++;
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}