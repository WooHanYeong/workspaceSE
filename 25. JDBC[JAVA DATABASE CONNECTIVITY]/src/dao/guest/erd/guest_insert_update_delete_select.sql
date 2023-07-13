--guest
/*
이름             널?       유형             
-------------- -------- -------------- 
GUEST_NO       NOT NULL NUMBER(10)     
GUEST_NAME              VARCHAR2(50)   
GUEST_DATE              DATE           
GUEST_EMAIL             VARCHAR2(50)   
GUEST_HOMEPAGE          VARCHAR2(50)   
GUEST_TITLE             VARCHAR2(100)  
GUEST_CONTENT           VARCHAR2(4000) 
*/
--delete
delete from guest where guest_no=1;

--insert
insert into guest values(guest_guest_no_seq.nextval , '우한영1',sysdate,'96_why@naver.com','http://www.naver.com','방명록사용법','바보');
insert into guest values(guest_guest_no_seq.nextval , '우한영2',sysdate,'96_why@naver.com','http://www.naver.com','방명록사용법','바보');
insert into guest values(guest_guest_no_seq.nextval , '우한영3',sysdate,'96_why@naver.com','http://www.naver.com','방명록사용법','바보');
insert into guest values(guest_guest_no_seq.nextval , '우한영4',sysdate,'96_why@naver.com','http://www.naver.com','방명록사용법','바보');
insert into guest values(guest_guest_no_seq.nextval , '우한영5',sysdate,'96_why@naver.com','http://www.naver.com','방명록사용법','바보');

--pk update
update guest set guest_name='name수정', guest_email='email수정', guest_homepage='homepage수정', guest_title='title수정', guest_content='content수정'
where guest_no=1;
--select pk
select * from guest where guest_no=1;
--select all
select * from guest;

commit;
