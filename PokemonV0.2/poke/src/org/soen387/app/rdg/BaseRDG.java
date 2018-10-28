package org.soen387.app.rdg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseRDG {

	//Connector Class
	public MySqlConnectJdbc connectJdbc;
	
	//Connector
	public Connection connect;
	
	BaseRDG(){
		super();
		connectJdbc = MySqlConnectJdbc.getConnectMysqlJdbc();
		this.connect = connectJdbc.getConnect();
	}
	
	public ResultSet excuteSql(String sql,Object...params) {
		try {
		PreparedStatement pstmt;
		pstmt = (PreparedStatement)connect.prepareStatement(sql);
		if(params != null) {
			for(int i=0; i<params.length; i++) {
				if(params[i] instanceof String) {
					pstmt.setString(i+1, (String)params[i]);
				}else if(params[i] instanceof Integer) {
					pstmt.setInt(i+1, (Integer)params[i]);
				}
			}
		}
		ResultSet rs = pstmt.executeQuery();	
		return rs;
		} catch (SQLException e) {
	        e.printStackTrace();
	        return null;
	    }
	}
}
