package Day_5;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;

/**
 * ×Ö·ûµÄ»º³åÊäÈëÊä³öÁ÷
 * @author xie19
 *
 */
public class BufferedWriterReaderDemo {
	public static void main(String[] args) throws Exception {
		Writer w=new FileWriter("E:/File²âÊÔ/12.txt");
		BufferedWriter bufferedWriter=new BufferedWriter(w);
		bufferedWriter.write("ABCDCFG");
		bufferedWriter.close();
		Reader reader=new FileReader("E:/File²âÊÔ/12.txt");
		char[] ch=new char[1];
		while(reader.read(ch)!=-1) {
			System.out.println(Arrays.toString(ch));
		}
	}
}
