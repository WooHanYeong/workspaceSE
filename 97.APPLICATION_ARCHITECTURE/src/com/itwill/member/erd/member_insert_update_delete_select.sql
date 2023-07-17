--ebook table  CRUD sql

--insert

insert into ebook(ebook_id,ebook_name,ebook_age,ebook_regdate)
                values('aaaa','김경수',37,sysdate);
insert into ebook(ebook_id,ebook_name,ebook_age,ebook_regdate)
                values('bbbb','김경우',23,sysdate);
insert into ebook(ebook_id,ebook_name,ebook_age,ebook_regdate)
                values('cccc','김경미',47,sysdate);
                
--update pk

update member set 
    member_password='0000',
    member_name='김변경',
    member_address='제주도민',
    member_age=20,
    member_married='T',
    member_regdate=sysdate
where member_id='aaaa';

--delete pk
delete from member where member_id='aaaa';
--select pk
select member_id,member_password,member_name,member_address,member_age,member_married,member_regdate from member where member_id='bbbb';
--select All
select member_id,member_password,member_name,member_address,member_age,member_married,member_regdate from member;
commit;

desc member;


                
                
                