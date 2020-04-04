package Day_5;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * 文件过滤器
 * @author xie19
 *
 */
public class FileDemo1 {
	public static void main(String[] args) {
//		File file=new File("E:/File测试");
//		File file1=new File("E:/File测试","1232新建文本文档1.txt");
//		System.out.println(file1);
		File file1=new File("E:/File测试");
		System.out.println(file1.getName());
//		File[] listFiles = file.listFiles(new FilenameFilter() {
//			@Override
//			public boolean accept(File dir, String name) {
////				name.endsWith(".txt")以.txt结尾的文件,new File(dir,name).isFile(),获取地址下面的普通文件
//				System.out.println(new File(dir,name).isFile()&&name.endsWith(".txt"));
//				return new File(dir,name).isFile()&&name.endsWith(".txt");
//			}
//		});
//		for (File file2 : listFiles) {
//			System.out.println(file2);
//		}
//	}
	}
}
