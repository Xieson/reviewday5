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
 * �ļ������OutputStream
 * @author xie19
 *
 */
public class OutputStreamDemo {
	public static void main(String[] args) throws Exception {
		File file=new File("E:/File����/�½��ı��ĵ�.txt");
//		Properties properties = System.getProperties();//��ȡ���Ե���������ֵ
//		Set<Entry<Object, Object>> entrySet = properties.entrySet();
//		for (Entry<Object, Object> entry : entrySet) {
//			System.out.println(entry.getKey()+"-----"+entry.getValue());
//		}
			OutputStream out=new FileOutputStream(file);//������true�Ļ��ǳ�������������ظ���,�����õĻ�Ĭ��Ϊfalse
			out.write("ABCD,EF,G".getBytes(),0,1);
			out.close();
		
	}
}
