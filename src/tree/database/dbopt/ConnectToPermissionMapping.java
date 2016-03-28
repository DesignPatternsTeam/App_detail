package tree.database.dbopt;

import tree.database.MySQLCor;

public class ConnectToPermissionMapping implements IDbConnector {

	public MySQLCor connect() {
		String dburlper = "jdbc:mysql://localhost:3306/permission-mapping";
		MySQLCor mysqlper = new MySQLCor(dburlper);
		return mysqlper;
	}

}
