package command;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class AddCommand {
	Command Scan, Copy, Print;
	BlockingQueue<Command> queue = new LinkedBlockingQueue<Command>();
	
	public void enqueue(Command command) {
		queue.add(command);
		System.out.println("Add Command Enqueued" + command);
		try {
			System.out.println(queue.take());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
