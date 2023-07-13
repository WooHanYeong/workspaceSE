DROP TABLE member CASCADE CONSTRAINTS;

CREATE TABLE member(
		m_id                          		VARCHAR2(20)		 NULL ,
		m_password                    		VARCHAR2(20)		 NOT NULL,
		m_name                        		VARCHAR2(50)		 NOT NULL,
		m.address                     		VARCHAR2(100)		 NULL ,
		m_age                         		NUMBER(3)		 DEFAULT 0		 NULL ,
		m_married                     		CHAR(1)		 DEFAULT F		 NULL ,
		m_regdate                     		DATE		 DEFAULT sysdate		 NULL 
);

DROP SEQUENCE member_m_id_SEQ;

CREATE SEQUENCE member_m_id_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;


ALTER TABLE member ADD CONSTRAINT IDX_member_PK PRIMARY KEY (m_id);

