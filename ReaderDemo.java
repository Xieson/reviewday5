package Day_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/**
 * 输入流
 * @author xie19
 *
 */
public class ReaderDemo {
	public static void main(String[] args) throws IOException {
		File file=new File("E:/File测试/新建文件.txt");
		Reader rd=new FileReader(file);
		char[] ch=new char[5];
//		rd.read(ch);
		while(rd.read(ch)!=-1) {
			System.out.println(Arrays.toString(ch));
		}
	}
}
