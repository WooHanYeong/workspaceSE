package dao.guest;

import java.sql.Date;

/*
VO(Value Object),DTO(Data Transfer Object)
	- guest 테이블 1개 row의 데이타의 값을 가지는객체
	- guest 테이블 1개 row의 데이타값을 이동(파라메타,리턴데이타)시키기위한객체 
	- guest 테이블의 컬럼과 동일한수의 멤버변수를가지는객체
*/
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

public class Guest {
	private int guestNo;
	private String gusetName;
	private Date date;
	private String gusetEmail;
	private String guestHomepage;
	private String guestTitle;
	private String guestContent;
	
	public Guest() {
	}
	
	public Guest(int guestNo, String gusetName, Date date, String gusetEmail, String guestHomepage, String guestTitle,
			String guestContent) {
		super();
		this.guestNo = guestNo;
		this.gusetName = gusetName;
		this.date = date;
		this.gusetEmail = gusetEmail;
		this.guestHomepage = guestHomepage;
		this.guestTitle = guestTitle;
		this.guestContent = guestContent;
	}

	public int getGuestNo() {
		return guestNo;
	}

	public void setGuestNo(int guestNo) {
		this.guestNo = guestNo;
	}

	public String getGusetName() {
		return gusetName;
	}

	public void setGusetName(String gusetName) {
		this.gusetName = gusetName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getGusetEmail() {
		return gusetEmail;
	}

	public void setGusetEmail(String gusetEmail) {
		this.gusetEmail = gusetEmail;
	}

	public String getGuestHomepage() {
		return guestHomepage;
	}

	public void setGuestHomepage(String guestHomepage) {
		this.guestHomepage = guestHomepage;
	}

	public String getGuestTitle() {
		return guestTitle;
	}

	public void setGuestTitle(String guestTitle) {
		this.guestTitle = guestTitle;
	}

	public String getGuestContent() {
		return guestContent;
	}

	public void setGuestContent(String guestContent) {
		this.guestContent = guestContent;
	}

	@Override
	public String toString() {
		return "Guest [guestNo=" + guestNo + ", gusetName=" + gusetName + ", date=" + date + ", gusetEmail="
				+ gusetEmail + ", guestHomepage=" + guestHomepage + ", guestTitle=" + guestTitle + ", guestContent="
				+ guestContent + "]";
	}
	
	
	
	
}
