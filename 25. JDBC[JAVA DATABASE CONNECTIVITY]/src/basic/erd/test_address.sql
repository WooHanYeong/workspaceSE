select *from address;

insert into address values(address_no_seq.nextval,'우한영','123-456-7899','경기도 안양시');

update address set name='우영한',phone='1588-1588' ,address='안양시 경기도' where no=1;

delete from address where no=1;

commit;