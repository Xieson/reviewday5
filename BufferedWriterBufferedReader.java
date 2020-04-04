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
 * �ֽ����뻺���������ݴ�ȡ�ٶȶԱ�
 * @author xie19
 *
 */
public class BufferedWriterBufferedReader {
	public static void main(String[] args) throws IOException {
		//�ֽ����������
				long time1=System.currentTimeMillis();
				OutputStream fileOutputStream = new FileOutputStream("E:/File����/1.txt");
				BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
				bufferedOutputStream.write("ABCEFGABCEFGABCEFGABCEFGABCEFGABCEFGABCEFGABCEFGABCEFGABCEFG".getBytes());
				bufferedOutputStream.close();//�رջ���������
				//�ֽ�������������
				InputStream inp= new FileInputStream("E:/File����/1.txt");
				byte[] ch1=new byte[1];
				while(inp.read(ch1)!=-1) {
					System.out.println(Arrays.toString(ch1));
				}
				long time2=System.currentTimeMillis();
				System.out.println(time2-time1);
			//	1:�����ļ�������
				OutputStream out=new FileOutputStream("E:/File����/�½��ı��ĵ�.txt");
				out.write("ABCEFGABCEFGABCEFGABCEFGABCEFGABCEFGABCEFGABCEFGABCEFGABCEFG".getBytes());
				out.close();
				InputStream in=new FileInputStream("E:/File����/�½��ı��ĵ�.txt");
				//ȡ����
				byte[] by=new byte[5];
				while(in.read(by)!=-1) {//in.read(by);//ȡ���ݷŵ�byte��������
					System.out.println(Arrays.toString(by));
				}
				in.close();
				long time4=System.currentTimeMillis();
				System.out.println("�ַ������������ʱ��"+(time4-time2));
	}
}
