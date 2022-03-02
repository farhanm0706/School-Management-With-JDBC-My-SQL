package service;

import java.util.ArrayList;

import Model.PrincipalModel;
import dao.PrincipalDao;



public class PrincipalDetails implements EmployeeInterface {
	PrincipalDao empDao = new PrincipalDao();
	ArrayList<PrincipalModel> empList = new ArrayList<PrincipalModel>();
	public void addPrincipalToList(PrincipalModel em) throws Exception
	{
		empList.add(em);
		empDao.storePrinciRecordInDb(empList);
}
}
