package Day_5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

/**
 * 文件输入流Inputstream
 * @author xie19
 *
 */
public class InputStreamDemo {
	public static void main(String[] args) throws Exception {
		File file=new File("E:/File测试/新建文本文档.txt");
		InputStream is=new FileInputStream(file);
		byte[] by=new byte[5];
//		is.read(by);
//		System.out.println(Arrays.toString(by));
		while(is.read(by)!=-1) {//is.read(by)返回值为int,当数据取完后,返回-1
			String str=new String(by);//将byte数组转化为字符串
			System.out.println(str);
		}
		is.close();//关闭流
	}
}
