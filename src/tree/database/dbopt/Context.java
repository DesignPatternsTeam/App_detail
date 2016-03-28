package tree.database.dbopt;

import tree.database.MySQLCor;

public class Context {
	private IDbConnector connector;
	private MySQLCor mysql;
	
	public void setConnector(IDbConnector conn){
		this.connector = conn;
	}
	
	public void connect(){
		mysql = connector.connect();
	}
	
	public MySQLCor getMySQLCor(){
		return mysql;
	}
}
