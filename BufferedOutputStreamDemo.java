package Day_5;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/**
 * �ֽ��������������
 * @author xie19
 *
 */
public class BufferedOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		//�ֽ����������
		OutputStream fileOutputStream = new FileOutputStream("E:/File����/1.txt");
		BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
		bufferedOutputStream.write("ABC".getBytes());
		bufferedOutputStream.close();//�رջ���������
		//�ֽ�������������
		InputStream inp= new FileInputStream("E:/File����/1.txt");
		byte[] ch=new byte[5];
		while(inp.read(ch)!=-1) {
			System.out.println(Arrays.toString(ch));
		}
		
	}
}
