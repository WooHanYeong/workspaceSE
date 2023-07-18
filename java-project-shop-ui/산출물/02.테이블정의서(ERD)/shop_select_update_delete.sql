/*
 * userinfo
 */

/*
 * product
 */
--제품리스트
select * from product;
--제품상세보기
select * from product where p_no=1;

/*
 * cart
 */
--1.로그인한 guard1 멤버한사람의 카트아이템리스트
select * from cart where userid='guard1';
--2.카트아이템 1개의 제품정보(guard1 멤버한사람)

--3.guard1 멤버한사람의  카트에 제품번호 존재여부
--3.guard1 카트에 있는 1번제품의 수량증가
--4.guard1 카트에 있는 cart_no 1번의 수량3개 수정

--5.guard1님 카트아이템1개삭제
--6.guard1님 카트아이템모두삭제

/*
 * order
 */
--1. 멤버 한사람의 주문전체목록
--2. 주문한개(멤버 한사람의) 
--3. 주문한개의 주문상세 여러개(주문상세)
--4. 주문한개의 주문상세,제품정보 여러개(주문상세,제품)
--5. 주문한개삭제(주문1개삭제,주문상세삭제)
--on delete cascade
--6. 멤버한사람의 주문내역전체삭제
----on delete cascade

