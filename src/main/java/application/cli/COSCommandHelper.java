package application.cli;

import application.cli.exception.COSException;
import application.cli.help.IHelp;

public abstract class COSCommandHelper implements IHelp {
	public String displayHelp() {
		return null;
		
	}

	public void displayHeader() {
		// TODO Auto-generated method stub
		
	}

	public void buildContext() throws COSException {
		// TODO Auto-generated method stub
		
	}

	public abstract void execute() throws COSException;

	public COSCommandHelper parse() {
		// TODO Auto-generated method stub
		return null;
	}
}
