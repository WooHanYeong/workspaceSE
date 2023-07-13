package dao.guest;

public class GuestDaoTestMain {

	public static void main(String[] args)throws Exception {
				
		GuestDao guestDao=new GuestDao();
		System.out.println("1.insert");
		System.out.println(">>> row Count : " + guestDao.inert(new Guest(0,"혼공자",null,"isgooe@naver.com","naver.com","고소장","경찰서")));
		
		System.out.println("2.delete");
		System.out.println(">>> row Count : " + guestDao.deleteByGuestNo(1));
		
		System.out.println("3.update");
		Guest findGuest = guestDao.findByGuestNo(2);
		findGuest.setGusetName("우변경");
		findGuest.setGusetEmail("99999@naver.com");
		findGuest.setGuestHomepage("daum.net");
		findGuest.setGuestTitle("다음으로변경");
		findGuest.setGuestContent("내마음이야");
		System.out.println(">>> row count:"+guestDao.updateByGuestNo(findGuest));

		System.out.println("4.findByPrimarykey");
		System.out.println(">>> row count : " + guestDao.findByGuestNo(5));
		
		System.out.println("5.findAll");
		System.out.println(">>>"+ guestDao.findByAll());
			
	}

}
