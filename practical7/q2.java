package practical7GRADED;
import java.io.File;
import java.io.IOException;
import java.util.Date;

//This program will only run once.
public class q2 {
	public static void main (String[] args) throws IOException {
		//Creating new filename using Scanner
		Date date = new Date();
		String newDate = date.toString().replaceAll(":", "_");
		
		File text = new File(args[0]);
		
		//Checking if file exists
		if (!text.exists()) {
			System.out.println("The file already exist.");
		}
		
		else {
			//Creating new file that is to be renamed
			File newFile = new File(args[0] + newDate);
			
			//Renaming the file
			boolean successful = text.renameTo(newFile);
			
			if(!successful) {
				System.out.println("Renaming file unsuccessful.");
			}
			
			else {
				System.out.println("Renaming successful! New file is: " + newFile.getAbsolutePath());
			}
		}
	}
}
