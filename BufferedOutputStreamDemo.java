package Day_5;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/**
 * 字节输入输出缓冲流
 * @author xie19
 *
 */
public class BufferedOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		//字节输出缓冲流
		OutputStream fileOutputStream = new FileOutputStream("E:/File测试/1.txt");
		BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
		bufferedOutputStream.write("ABC".getBytes());
		bufferedOutputStream.close();//关闭缓冲流对象
		//字节输入流缓冲流
		InputStream inp= new FileInputStream("E:/File测试/1.txt");
		byte[] ch=new byte[5];
		while(inp.read(ch)!=-1) {
			System.out.println(Arrays.toString(ch));
		}
		
	}
}
