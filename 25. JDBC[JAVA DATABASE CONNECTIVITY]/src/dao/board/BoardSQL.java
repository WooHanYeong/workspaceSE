package dao.board;

public class BoardSQL {
	public static final String BROAD_INSERT
		="insert into board(board_no,board_title,board_content) values(board_no_seq.nextval,?,?)";
	public static final String BROAD_UPDATE
		= "update board set board_title = ? , board_content = ?, board_wday = ?, board_read_count = ? where board_no = ?";
 
	public static final String BROAD_DELETE
		= "delete board where board_no=?";
	public static final String BROAD_SELECT_BY_NO
		= "select * from board where board_no=?";
	public static final String BROAD_SELECT_ALL
		= "select * from board";
}
