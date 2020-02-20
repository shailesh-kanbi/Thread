package command;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {

	 public static void main(String[] args) throws InterruptedException {
		 
		BlockingQueue<Command> queue = new LinkedBlockingQueue<Command>();
		
		Command Scan = new ExecuteCommand();
		AddCommand addCommand = new AddCommand();
		addCommand.enqueue(Scan);
		
		
		
		 
	}
}
