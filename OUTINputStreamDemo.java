package Day_5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * ����������Ľ��Ӧ��
 * @author xie19
 *
 */
public class OUTINputStreamDemo {
	public static void main(String[] args){
//		//1:�����ļ�������
//		InputStream in=new FileInputStream("E:/File����/�½��ı��ĵ�.txt");
//		OutputStream out=new FileOutputStream("E:/File����/�½��ı��ĵ�copy.txt");
//		//ȡ����
//		byte[] by=new byte[5];
//		while(in.read(by)!=-1) {//in.read(by);//ȡ���ݷŵ�byte��������
//			out.write(by);//������
//		}
//		in.close();
//		out.close();
		//---�޸�----
		InputStream in=null;
		OutputStream out=null;
		try {
			in=new FileInputStream("E:/File����/�½��ı��ĵ�.txt");
			out=new FileOutputStream("E:/File����/�½��ı��ĵ�copy.txt");
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
