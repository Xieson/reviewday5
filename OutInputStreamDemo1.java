package Day_5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/**
 * 过滤文件,然后拷贝
 * @author xie19
 *
 */
public class OutInputStreamDemo1 {
	public static void main(String[] args) {
		InputStream in=null;
		OutputStream out=null;
		File in1=null;
		File file=new File("E:/File测试");
		File[] file1=file.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return new File(dir,name).isFile()&&name.endsWith(".txt");
			}
		});
		for (File file2 : file1) {
//			System.out.println(file2);
			try {
				in1=new File("E:/File测试");
				in=new FileInputStream(file2);
				out=new FileOutputStream(new File(in1,file2.getName()));
				byte[] by=new byte[1024];
				while(in.read(by)!=-1) {
					System.out.println(Arrays.toString(by));
					out.write(by);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
