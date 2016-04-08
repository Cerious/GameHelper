import java.io.*;
public class GameHelper {
	public String getUserInput(String prompt) {
		String inputLine = null;
		System.out.println(prompt + " ");
		try {
			BufferedReader is =  new BuffredReader(new InputStramReader(System.in));
			inputLine = is.readLine();
			if (inputLine.length() == 0) return null;	
		} catch (IOExeption e) {
			System.out.println("IOExeption: " + e);
		}
		return inputLine;
	}
}