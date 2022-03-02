package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Model.TeacherModel;
import service.Principal;
import utility.ConnectionManager;

public class TeacherDao extends GetConnection{
	Principal a=new Principal();
	Connection dbConn = null;
	@Override
	public Connection getDbConnection() throws ClassNotFoundException {
		Connection dbCon = ConnectionManager.getConnection();
		return dbCon;
	}

	public void storeTeachRecordInDb(ArrayList<TeacherModel> empList) throws Exception {
		dbConn = getDbConnection();
		String sql = "insert into teacher(teachId,name1,phone,graduation,workPlace,salary) values (?,?,?,?,?,?)";
		try {
			PreparedStatement ps = dbConn.prepareStatement(sql);
			for(TeacherModel em: empList) {
				ps.setString(1, em.getTeachId());
				ps.setString(2, em.getName());
				ps.setLong(3, em.getPhone());
				ps.setString(4, em.getGraduation());
				ps.setString(5,em.getLastWork());
				ps.setDouble(6, em.getSalary());
				int result = ps.executeUpdate();
				if(result == 1) {
					System.out.println("Teacher record added successfully");
					a.homePrincipal();
				}
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			a.homePrincipal();
		}
	}

	public void viewTeacherTableRecord() throws Exception {
		dbConn = getDbConnection();
		String sql = "Select * from teacher";
		try {
			Statement stmt = dbConn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("---------------------------------------------------------------------");
			System.out.println("TID: "+"   "+"PName: "+" "+"PhoneNo: "+"Highest Education: "+" "+"Prev.Work Institute:"+" "+"Salary:");
			System.out.println("---------------------------------------------------------------------");
			while(rs.next()) {
				
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getLong(3)+" "+rs.getString(4)+" "+rs.getString(5)+"   " +rs.getDouble(6));
				System.out.println("----------------------------------------------------------------------");
				
				}
			a.homePrincipal();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			a.homePrincipal();
		}
		
	}
	public void deleteTeacherTableRecord(String sId) throws Exception
	{
		//TeacherModel em=new TeacherModel();
		int result=0;
		dbConn=getDbConnection();
		String sql="delete from teacher where teachId=?";
		try {
			PreparedStatement ps=dbConn.prepareStatement(sql);
			ps.setString(1, sId);
			result=ps.executeUpdate();
			if(result == 1) {
				System.out.println("Principal record deleted successfully");
				
				a.homePrincipal();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			a.homePrincipal();
		}
	}

	}

