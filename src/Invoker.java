import java.util.ArrayList;

public class Invoker {
	private ArrayList<Command> commandList = new ArrayList<Command>();
	
	public void addAsset(Command command)
	{
		commandList.add(command);
	}
	
	public void addLiability(Command command)
	{
		commandList.add(command);
	}
	
	public void getNetWorth(Command c)
	{
		commandList.add(c);
		
		for (int i = 0; i < commandList.size(); i++) 
		{
			commandList.get(i).execute();
		}
		
		commandList.clear();
		
	}
	
}
