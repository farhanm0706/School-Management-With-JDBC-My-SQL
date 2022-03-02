package service;

import java.util.ArrayList;

import Model.StudentModel;
import dao.StudentDao;

public class StudentDetails {
	StudentDao empDao = new StudentDao();
	ArrayList<StudentModel> empList = new ArrayList<StudentModel>();
	public void addStudentToList(StudentModel em) throws Exception
	{
		empList.add(em);
		empDao.storeStudRecordInDb(empList);
}
}
