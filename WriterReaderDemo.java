package Day_5;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;

public class WriterReaderDemo {
	public static void main(String[] args) throws Exception {
		File file1=new File("E:/File测试/新建文件1.txt");
		Writer w=new FileWriter(file1);
		w.write("ABCDEFG");
		Reader r=new FileReader(file1);
		w.close();
		char[] ch=new char[1];
//		r.read(ch);
		while(r.read(ch)!=-1) {
			System.out.println(Arrays.toString(ch));
		}
		r.close();
		
		
	}
}
