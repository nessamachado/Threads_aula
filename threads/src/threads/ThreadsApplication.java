package threads;

public class ThreadsApplication {
	
	public static void main(String[] args) {
		SaudacaoThread saudacaoThread = new SaudacaoThread();
		Thread thread = new Thread(saudacaoThread);
		thread.start();
		
	}

}
