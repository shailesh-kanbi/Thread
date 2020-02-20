package command;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ExecuteCommand implements Command {
	
	private String executeCommand;
	private Command executeCommands;
	BlockingQueue<Command> queue = new LinkedBlockingQueue<Command>();
	Command copy;
	
	public ExecuteCommand() {
		// TODO Auto-generated constructor stub
	}
	
	public ExecuteCommand(String ExecuteCommand) {
		// TODO Auto-generated constructor stub
		this.executeCommand = ExecuteCommand;
		
	}
	public void CopyCommand(Command command) throws InterruptedException {
		System.out.println(command);
		System.out.println(queue.add(command));
		System.err.println("Copy command Added! "+command);
		//System.out.println("take :"+queue.take());
		Object firstElement =queue.take();
		System.out.println("First Element : "+firstElement);
	}
	
	public String getExecuteCommand() {
		return executeCommand;
	}
	
	public Command getExecuteCommands() {
		return executeCommands;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Executed!");
		
		
	}
	public void enqueue(Command command) {
		queue.add(command);
		
	}
}
