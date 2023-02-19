package sifiCalculator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile extends WriteToFilenl{

	
	public void writeToFile(double p) {
		File file = new File("abc.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));) {
					String ss = String.valueOf(p);
					bw.write(ss);
					bw.write(" ");
//					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
	}
	
	

}
