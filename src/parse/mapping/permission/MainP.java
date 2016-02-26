package parse.mapping.permission;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;

import tree.database.MySQLCor;

public class MainP {
	public static void main(String[] args) {
		//�������ݿ�
		String dburl = "jdbc:mysql://localhost:3306/apk_info",
		dburlper = "jdbc:mysql://localhost:3306/permission-mapping";
		MySQLCor mysql = new MySQLCor(dburl);	
		MySQLCor mysqlper = new MySQLCor(dburlper);	

		String insert = "select distinct apkid,apkname from method_android";
		ResultSet rs = mysql.select(insert);
		try {
			while(rs.next()){
				int apkid = rs.getInt(1);
				String apkname = rs.getString(2);
				System.out.println(apkid + "\n" + apkname);        //����
				
				new parsePermission(apkid, apkname, mysql, mysqlper).parse();
				System.out.println("��" + apkid + "��table������ϣ�");

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
					
/*		//�ҵ����apkname���ļ���
		String path = "F:\\APK\\smaliTest";
		File file = new File(path);
		File files[] = file.listFiles();
		
		int i = 0;
		for (File apk : files) {
			String tablename = apk.getName();
			tablename = new ParseName().parseName(tablename);
			new parsePermission(tablename,mysql,mysqlper).parse();
			System.out.println("��" + ( ++i) + "��table������ϣ�");
		}
*/
			
	}
}
