package sifiCalculator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFilenl {
	
	public void writeToFilenl(int x) {
		File file = new File("abc.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));) {
					bw.newLine();
					String ss = String.valueOf(x);
//					bw.write("= ");
					bw.write(ss);
					bw.newLine();
//					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
	}

}
