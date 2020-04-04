package Day_5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 输入输出流的结合应用
 * @author xie19
 *
 */
public class OUTINputStreamDemo {
	public static void main(String[] args){
//		//1:创建文件流对象
//		InputStream in=new FileInputStream("E:/File测试/新建文本文档.txt");
//		OutputStream out=new FileOutputStream("E:/File测试/新建文本文档copy.txt");
//		//取数据
//		byte[] by=new byte[5];
//		while(in.read(by)!=-1) {//in.read(by);//取数据放到byte数组里面
//			out.write(by);//存数据
//		}
//		in.close();
//		out.close();
		//---修改----
		InputStream in=null;
		OutputStream out=null;
		try {
			in=new FileInputStream("E:/File测试/新建文本文档.txt");
			out=new FileOutputStream("E:/File测试/新建文本文档copy.txt");
			byte[] by=new byte[5];
				while(in.read(by)!=-1) {
					out.write(by);
				}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(in!=null) {
				in.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(out!=null) {
				out.close();
				}
				} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
