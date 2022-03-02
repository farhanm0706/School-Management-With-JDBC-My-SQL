package service;

import java.util.ArrayList;

import Model.PrincipalModel;
import Model.TeacherModel;
import dao.PrincipalDao;
import dao.TeacherDao;



public class TeacherDetails implements EmployeeInterface {
	TeacherDao empDao = new TeacherDao();
	ArrayList<TeacherModel> teachList = new ArrayList<TeacherModel>();
	public void addTeacherToList(TeacherModel em) throws Exception
	{
		teachList.add(em);
		empDao.storeTeachRecordInDb(teachList);
}
}

