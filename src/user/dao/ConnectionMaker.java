package user.dao;



import java.sql.Connection;
import java.sql.SQLException;


public interface ConnectionMaker {
	
	
	public Connection makeConnection() throws ClassNotFoundException, SQLException;	 //          makeConnection() 메소드 생성
}
