package com.itwill.emp;

import java.util.List;

public class EmpDaoTestMain {

	public static void main(String[] args)throws Exception {
		EmpDao empDao=new EmpDao();
		System.out.println("---------------------------------------");
		Emp emp = empDao.findEmpWithDeptByEmpno(7499);
		System.out.println(emp);
		System.out.println(emp.getDept());
		System.out.println("---------------------------------------");
		List<Emp> empList = empDao.findEmpWithDeptByEmpAll();
		System.out.println(empList);
		
	}

}
