package ThreadExample;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		
		SimpleThread ThreadOne = new SimpleThread();
		ThreadOne.start();
		ThreadOne.setName("ThreadOne");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RunnableThreadClass ThreadTwo = new RunnableThreadClass(); 
		
		ThreadTwo.run();
		System.out.println(ThreadOne.getName()+ " is running");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ThreadOne.run();
		while(true) {
		new Thread(){
			
			public void run() {
				System.out.println("new Thread() is Running!");
			}
		
		}.start();
		Thread.sleep(500);
		}
		
	}

}
