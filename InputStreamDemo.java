package Day_5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

/**
 * �ļ�������Inputstream
 * @author xie19
 *
 */
public class InputStreamDemo {
	public static void main(String[] args) throws Exception {
		File file=new File("E:/File����/�½��ı��ĵ�.txt");
		InputStream is=new FileInputStream(file);
		byte[] by=new byte[5];
//		is.read(by);
//		System.out.println(Arrays.toString(by));
		while(is.read(by)!=-1) {//is.read(by)����ֵΪint,������ȡ���,����-1
			String str=new String(by);//��byte����ת��Ϊ�ַ���
			System.out.println(str);
		}
		is.close();//�ر���
	}
}
