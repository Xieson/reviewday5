package Day_5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ImgoutinputStreamDemo {
	public static void main(String[] args) {
		InputStream in=null;
		OutputStream out=null;
		try {
			in=new FileInputStream("E:/File≤‚ ‘/1.jpg");
			out=new FileOutputStream("E:/File≤‚ ‘/1copy.jpg");
			byte[] b=new byte[1024];
			while(in.read(b)!=-1) {
				out.write(b);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
