package Practice0409;

import java.io.*;

public class FileWriteEx1 {

	public static void main(String[] args) {
		FileWriter writer = null;

		try {
			writer = new FileWriter("c:/hello3.txt");
			String s = "어서 모이자";

			writer.write(s);

			writer.flush();

		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		} finally {

			try {
					if(writer != null) {
						writer.close();
						
					}
			} catch (IOException io) {
					io.printStackTrace();
			}

		}

	}
}
