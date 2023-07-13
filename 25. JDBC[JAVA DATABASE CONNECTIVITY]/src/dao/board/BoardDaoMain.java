package dao.board;

import dao.guest.Guest;

public class BoardDaoMain {

	public static void main(String[] args) throws Exception {
		
		BoardDao boardDao = new BoardDao();
		
		System.out.println("1.insert");
		System.out.println("row Count : " + boardDao.insert(new Board(0,"타이틀","내용",null,0)));
		
		System.out.println("2.delete");
		System.out.println("row Count : "+ boardDao.deleteByBoardNo(1));
		
		System.out.println("3.update");
		Board findBoard = boardDao.findByBoardNo(10);
		findBoard.setBoardTitle("타이틀변경");
		findBoard.setBoardContent("내용변경");
		
		System.out.println("rowCount : " + boardDao.updateByBoardNo(findBoard));

		
		System.out.println("4.findByPrimarykey");
		System.out.println("row Count : " + boardDao.findByBoardNo(5));
		
		System.out.println("5.findAll");
		System.out.println(boardDao.selectAll());
	}

}
