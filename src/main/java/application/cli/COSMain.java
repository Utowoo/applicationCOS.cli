package application.cli;

import application.cli.exception.COSException;
import application.cli.exception.InvalidCOSCommandException;

public class COSMain {
	public static void main(String[] args) {
		
		try {
			COSCmd cmd = new COSCmd(args);
			COSCommandHelper command = cmd.parse();
			command.displayHeader();
			command.buildContext();
			command.execute();
		} catch (COSException e) {
			// TO-DO : ADD LOG
			System.exit(1);
		}
	}
}
