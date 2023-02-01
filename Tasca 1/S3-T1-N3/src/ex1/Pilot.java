package ex1;

import java.util.ArrayList;
import java.util.List;

public class Pilot {
	
	private List<Command> commandList; 
	
	public Pilot() {
		commandList = new ArrayList<Command>(); 
	}

	   public void takeCommand(Command command){
	      commandList.add(command);		
	   }

	   public void activateAllCommands(){
		   
		   commandList.forEach(c -> c.execute());
		   
	   }
	      
}
