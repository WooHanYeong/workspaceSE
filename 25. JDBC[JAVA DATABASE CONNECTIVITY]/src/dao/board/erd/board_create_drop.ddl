DROP TABLE board CASCADE CONSTRAINTS;

CREATE TABLE board(
		board_no                      		NUMBER(10)		 NOT NULL,
		board_title                   		VARCHAR2(255)		 NULL ,
		board_content                 		VARCHAR2(4000)		 NULL ,
		board_wday                    		DATE		 NULL ,
		board_read_count              		NUMBER(10)		 NULL 
);

DROP SEQUENCE board_board_no_SEQ;

CREATE SEQUENCE board_board_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

CREATE TRIGGER board_board_no_TRG



ALTER TABLE board ADD CONSTRAINT IDX_board_PK PRIMARY KEY (board_no);

