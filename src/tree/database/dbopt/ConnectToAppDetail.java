package tree.database.dbopt;

import tree.database.MySQLCor;

public class ConnectToAppDetail implements IDbConnector {

	public MySQLCor connect() {
		String dburl = "jdbc:mysql://localhost:3306/app_detail";
		MySQLCor mysql = new MySQLCor(dburl);
		return mysql;
	}

}
