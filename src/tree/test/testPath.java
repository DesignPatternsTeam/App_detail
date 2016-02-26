package tree.test;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import tree.database.MySQLCor;
import tree.parse.ExtractOuterClass;

public class testPath {

	/*		

	File getAbsoluteFile() 
	        ���ش˳���·�����ľ���·������ʽ�� 
	String getAbsolutePath() 
	        ���ش˳���·�����ľ���·�����ַ����� 
	File getCanonicalFile() 
	        ���ش˳���·�����Ĺ淶��ʽ�� 
	String getCanonicalPath() 
	        ���ش˳���·�����Ĺ淶·�����ַ����� 
	long getFreeSpace() 
	        ���ش˳���·����ָ���ķ�����δ������ֽ����� 
	String getName() 
	        �����ɴ˳���·������ʾ���ļ���Ŀ¼�����ơ� 
	String getParent() 
	        ���ش˳���·������Ŀ¼��·�����ַ����������·����û��ָ����Ŀ¼���򷵻� null�� 
	File getParentFile() 
	        ���ش˳���·������Ŀ¼�ĳ���·�����������·����û��ָ����Ŀ¼���򷵻� null�� 
	String getPath() 
	        ���˳���·����ת��Ϊһ��·�����ַ�����         
	*/
	
	
	public static void main(String[] args) {
		String dburl = "jdbc:mysql://localhost:3306/apktree";
		MySQLCor mysql = new MySQLCor(dburl);

		String filestr = "D:\\APK\\smaliTest\\a.b.namespace_8";
		File file = new File(filestr);

		ExtractOuterClass outcla = new ExtractOuterClass(file);
		List<File> filelist = outcla.extractClassFile();	
	
		StringBuffer buff[] = returnBuff(filelist);
		for (int i = 0; i < buff.length; i++) {
			System.out.println(buff[i]);
		}
		
	}

	private static StringBuffer[] returnBuff(List<File> filelist) {
		StringBuffer packages[] =  new StringBuffer[filelist.size()];
		
		Iterator<File> packs = filelist.iterator();
		int c = 0;
		while(packs.hasNext()){
			File pack = packs.next();
			StringBuffer parent = new StringBuffer(pack.getParent());
			parent.trimToSize();
			parent = new StringBuffer(parent.substring(parent.indexOf("\\smali\\") + 7));
			parent = new StringBuffer((parent.toString()).replace("\\", "."));
			packages[c] = parent;
			c++;			
		}

		List<String> list = Collections.synchronizedList(new LinkedList<String>());
		for (int i = 0; i < packages.length; i++) {
			if (!(list.contains(packages[i].toString()))) {
				list.add(packages[i].toString());
			}
		}

		String []npackages = list.toArray(new String[list.size()]);                    // packages �д洢 apk �Զ���İ��� ======== StringBuffer ��ʽ
		list.clear();
		list = null;
		
		StringBuffer packbuffer[] = new StringBuffer[npackages.length];
	       for(int i=0; i<npackages.length; i++) {  
	    	   packbuffer[i] = new StringBuffer(npackages[i]);
	    	   npackages[i] = null;      //�ͷ�
	        }  		       
	       npackages = null;
		
		return packbuffer;

	}
	
}
