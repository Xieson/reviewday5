package Day_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

/**
 * 文件输出流OutputStream
 * @author xie19
 *
 */
public class OutputStreamDemo {
	public static void main(String[] args) throws Exception {
		File file=new File("E:/File测试/新建文本文档.txt");
//		Properties properties = System.getProperties();//获取电脑的所有属性值
//		Set<Entry<Object, Object>> entrySet = properties.entrySet();
//		for (Entry<Object, Object> entry : entrySet) {
//			System.out.println(entry.getKey()+"-----"+entry.getValue());
//		}
			OutputStream out=new FileOutputStream(file);//设置问true的话是充许输出的数据重复的,不设置的话默认为false
			out.write("ABCD,EF,G".getBytes(),0,1);
			out.close();
		
	}
}
