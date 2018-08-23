package Practice0409;

import java.io.*;
import static java.lang.System.out;

public class FileReaderEx1 {

	public static void main(String[] args) {

		FileReader reader = null;

		try {

			reader = new FileReader("c:/hello3.txt");

			int unicodeReader = 0;

			while ((unicodeReader = reader.read()) != -1) {
				out.print((char) unicodeReader);

			}

		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		} finally {

			try {

				if (reader != null) {
					reader.close();

				}

			} catch (IOException io) {
				io.printStackTrace();
			}

		}

	}
}
