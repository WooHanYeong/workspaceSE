select * from DEPT;
--부서번호로 부서찾기
select * from dept where deptno=30;

--부서번호로 부서정보와 부서에소속된사원정도 selcet

select * 
	from dept d join emp e on d.deptno =e.deptno where d.deptno=30; 
    
    
    
    