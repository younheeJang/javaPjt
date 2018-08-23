package Practice0409;

import java.io.*;
import static java.lang.System.out;
public class DataOutputStream1 {

	public static void main(String[] args)  {

		DataOutputStream dos = null;
		FileOutputStream fos = null;
		
		
		try {

			fos = new 	FileOutputStream ("c:/data1.sav");
			
			dos = new DataOutputStream(fos);
			
			int i =10 ;
			double d = 3.14;
			String s = "사랑해요 자바 !!";
			
			dos.writeInt(i);
			dos.writeDouble(d);
			dos.writeUTF(s);
		
		
		}catch(FileNotFoundException fe) {
			fe.printStackTrace();
		}catch(IOException io) {
			io.printStackTrace();
		}finally {
			
			try {
				if(dos != null) dos.close();
			} catch (IOException io) {
				io.printStackTrace();
			}
		}
		
		
	}
}
