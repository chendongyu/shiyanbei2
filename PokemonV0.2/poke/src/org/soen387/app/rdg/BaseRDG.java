package org.soen387.app.rdg;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.soen387.app.common.MySqlConnectJdbc;

public class BaseRDG {

	//Connector Class
	public static MySqlConnectJdbc connectJdbc;
	
	//Connector
	public static Connection connect;
	
	BaseRDG(){
		super();
		connectJdbc = MySqlConnectJdbc.getConnectMysqlJdbc();
		this.connect = connectJdbc.getConnect();
	}
	
	/**
	 * Search in database
	 * 
	 * @param the SQL (query)
	 * @param the params in SQL (the parameter in query)
	 * @return search result
	 * @throws SQLException
	 */
	public static ResultSet excuteSelSql(String sql,Object...params) throws SQLException{
		//execute query
		PreparedStatement pstmt;
		pstmt = (PreparedStatement)connect.prepareStatement(sql);
		if(params != null) {
			for(int i=0; i<params.length; i++) {
				if(params[i] instanceof String) {   //if is an instant of string
					pstmt.setString(i+1, (String)params[i]);
				}else if(params[i] instanceof Integer) { //if is an instant of integer
					pstmt.setInt(i+1, (Integer)params[i]);
				}
			}
		}
		ResultSet rs = pstmt.executeQuery();	
		return rs;
	}

	/**
	 * Insert to database
	 * 
	 * @param the SQL (query)
	 * @param the params in SQL (the parameter in query)
	 * @return insert number (number of row)
	 * @throws SQLException 
	 */
	public static int excuteInsertSql(String sql,Object...params) throws SQLException{
		
		int num = 0;
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
			
			try {
				num = pstmt.executeUpdate();
				connect.commit();
			}catch(Exception e) {
				connect.rollback();
				System.out.println("Logs out DDL EXCEPTION");
			}
		}
		
		return num;
	}
	/*
	 * TODO
	 */
	public static <T>List<T> getDataFromResult(ResultSet resultSet,T t) throws SQLException{
		
/*		List<T> list = new ArrayList<T>();
		Field[] declaredFields = t.getClass().getDeclaredFields();
		int col = resultSet.getMetaData().getColumnCount();
		int index = 0;
		if(declaredFields.length == col) {
			while(resultSet.next()){
				Class<?> t2 = Class.forName(t.getClass().getName());
				index++;
				declaredFields[index-1].setAccessible(true);
				if(declaredFields[index-1].getType() == String.class) {
					declaredFields
				}
				
			}
		}*/
		return null;
	}
}
