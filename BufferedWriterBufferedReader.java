package Day_5;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;

/**
 * 字节流与缓冲流的数据存取速度对比
 * @author xie19
 *
 */
public class BufferedWriterBufferedReader {
	public static void main(String[] args) throws IOException {
		//字节输出缓冲流
				long time1=System.currentTimeMillis();
				OutputStream fileOutputStream = new FileOutputStream("E:/File测试/1.txt");
				BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
				bufferedOutputStream.write("ABCEFGABCEFGABCEFGABCEFGABCEFGABCEFGABCEFGABCEFGABCEFGABCEFG".getBytes());
				bufferedOutputStream.close();//关闭缓冲流对象
				//字节输入流缓冲流
				InputStream inp= new FileInputStream("E:/File测试/1.txt");
				byte[] ch1=new byte[1];
				while(inp.read(ch1)!=-1) {
					System.out.println(Arrays.toString(ch1));
				}
				long time2=System.currentTimeMillis();
				System.out.println(time2-time1);
			//	1:创建文件流对象
				OutputStream out=new FileOutputStream("E:/File测试/新建文本文档.txt");
				out.write("ABCEFGABCEFGABCEFGABCEFGABCEFGABCEFGABCEFGABCEFGABCEFGABCEFG".getBytes());
				out.close();
				InputStream in=new FileInputStream("E:/File测试/新建文本文档.txt");
				//取数据
				byte[] by=new byte[5];
				while(in.read(by)!=-1) {//in.read(by);//取数据放到byte数组里面
					System.out.println(Arrays.toString(by));
				}
				in.close();
				long time4=System.currentTimeMillis();
				System.out.println("字符输出输入流的时间"+(time4-time2));
	}
}
