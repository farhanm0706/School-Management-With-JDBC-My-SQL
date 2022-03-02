package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Model.StudentModel;
import service.Principal;
import utility.ConnectionManager;

	public class StudentDao extends GetConnection{
		Principal a=new Principal();
		Connection dbConn = null;
		@Override
		public Connection getDbConnection() throws ClassNotFoundException {
			Connection dbCon = ConnectionManager.getConnection();
			return dbCon;
		}

		public void storeStudRecordInDb(ArrayList<StudentModel> empList) throws Exception {
			dbConn = getDbConnection();
			String sql = "insert into student(sId,name1,address,className) values (?,?,?,?)";
			try {
				PreparedStatement ps = dbConn.prepareStatement(sql);
				for(StudentModel em: empList) {
					ps.setString(1, em.getsId());
					ps.setString(2, em.getName());
					ps.setString(3, em.getAddress());
					ps.setString(4, em.getClassname());
				
					int result = ps.executeUpdate();
					if(result == 1) {
						System.out.println("Student record added successfully");
						a.homePrincipal();
					}
					
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				a.homePrincipal();
			}
		}

		public void viewStudentTableRecord() throws Exception {
			dbConn = getDbConnection();
			String sql = "Select * from student";
			try {
				Statement stmt = dbConn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				System.out.println("----------------------------------------------");
				System.out.println("SID: "+"SName:"+"Address"+"Class");
				System.out.println("----------------------------------------------");
				while(rs.next()) {
					
					System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+" "+rs.getString(3)+" "+rs.getString(4));
					System.out.println("------------------------------------------");
					
					}
				a.homePrincipal();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				a.homePrincipal();
			}
			
		}
		public void deletestudentTableRecord(String sId) throws Exception
		{
		
			int result=0;
			dbConn=getDbConnection();
			String sql="delete from student where sId=?";
			try {
				PreparedStatement ps=dbConn.prepareStatement(sql);
				ps.setString(1, sId);
				result=ps.executeUpdate();
				if(result == 1) {
					System.out.println("Student record deleted successfully");
					
					a.homePrincipal();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				a.homePrincipal();
			}
		}
		
	}



