package Day_5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * �ַ������Writer
 * @author xie19
 *
 */
public class WriterDemo {
	public static void main(String[] args) {
		File file=new File("E:/File����/�½��ļ�.txt");
		Writer writer=null;
		try {
			writer = new FileWriter(file);
			writer.write("aBCDACND\nAWCJQ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {if(writer!=null) {
			writer.close();
	
		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
