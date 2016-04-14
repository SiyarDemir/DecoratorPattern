package demir;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
	public static void main(String[] args) throws IOException {
		int c;
		try {
			InputStream in = 
					new UpperCaseInputStream(
						new BufferedInputStream(
							new FileInputStream("C:\\Users\\demirTGM\\Desktop\\Zeug\\4AHITM\\Softwareentwicklung\\Java\\Workspace\\14042016INSY4\\src\\demir\\test.txt")));
		
			while((c = in.read()) >= 0) {
				System.out.print((char)c);
			}
			
			in.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}