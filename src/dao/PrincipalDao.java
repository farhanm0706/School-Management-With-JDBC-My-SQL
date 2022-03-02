package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Model.PrincipalModel;
import service.Admin;
import utility.ConnectionManager;

public class PrincipalDao extends GetConnection{
	Admin a=new Admin();
	Connection dbConn = null;
	@Override
	public Connection getDbConnection() throws ClassNotFoundException {
		Connection dbCon = ConnectionManager.getConnection();
		return dbCon;
	}

	public void storePrinciRecordInDb(ArrayList<PrincipalModel> empList) throws Exception {
		dbConn = getDbConnection();
		String sql = "insert into principal1(princiId,name1,phone,graduation,workPlace,salary) values (?,?,?,?,?,?)";
		try {
			PreparedStatement ps = dbConn.prepareStatement(sql);
			for(PrincipalModel em: empList) {
				ps.setString(1, em.getPrinciId());
				ps.setString(2, em.getName());
				ps.setLong(3, em.getphone());
				ps.setString(4, em.getHighest_Graduation());
				ps.setString(5,em.getWorkPlace());
				ps.setDouble(6, em.getSalary());
				int result = ps.executeUpdate();
				if(result == 1) {
					System.out.println("Principal record added successfully");
					a.homeAdmin();
				}
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void viewPrincipalTableRecord() throws Exception {
		dbConn = getDbConnection();
		String sql = "Select * from principal1";
		try {
			Statement stmt = dbConn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("PID: "+"PName: "+"PhoneNo: "+"Highest Education:"+"Prev.Work Institute:"+"Salary:");
			System.out.println("---------------------------------------------------------------------------");
			while(rs.next()) {
				
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getLong(3)+" "+rs.getString(4)+" "+rs.getString(5) +" "+rs.getDouble(6));
				System.out.println("------------------------------------------------------------------------------");
				
				}
			a.homeAdmin();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void deletePrincipalTableRecord(String pID) throws Exception
	{
		PrincipalModel em=new PrincipalModel();
		int result=0;
		dbConn=getDbConnection();
		String sql="delete from principal1 where princiId=?";
		try {
			PreparedStatement ps=dbConn.prepareStatement(sql);
			ps.setString(1, pID);
			result=ps.executeUpdate();
			if(result == 1) {
				System.out.println("Principal record deleted successfully");
				
				a.homeAdmin();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	}
