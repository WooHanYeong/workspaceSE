package dao.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.common.DataSource;

/*
 * Dao(Data[DataBase] Access Object)객체
 * 	- board(게시판) 데이타를 저장하고있는 테이블에
 *        CRUD(Create,Read,Update,Delete)작업을 할수있는 
 *        단위메쏘드를 가지고있는 클래스
 */

/*
 * insert
 * selectAll
 * selectByBoardNo
 * deleteByBoardNo
 * updateByBoardNo
 */
public class BoardDao {
	private DataSource dataSource;
	
	public BoardDao() throws Exception{
		this.dataSource = new DataSource();
	}
	
	public int insert(Board board) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(BoardSQL.BROAD_INSERT);
		pstmt.setString(1, board.getBoardTitle());
		pstmt.setString(2, board.getBoardContent());
		int rowCount = pstmt.executeUpdate();
		dataSource.close(con);
		return rowCount;
	}
	
	public int deleteByBoardNo(int boardNo) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(BoardSQL.BROAD_DELETE);
		pstmt.setInt(1, boardNo);
		int rowCount = pstmt.executeUpdate();
		dataSource.close(con);
		return rowCount;
	}
	
	public int updateByBoardNo(Board board) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(BoardSQL.BROAD_UPDATE);
		pstmt.setString(1, board.getBoardTitle());
		pstmt.setString(2, board.getBoardContent());
		pstmt.setDate(3, board.getBoardWday());
		pstmt.setInt(4, board.getBoardReadCount());
		pstmt.setInt(5, board.getBoardNo());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
	}
		
	
	
	public Board findByBoardNo(int boardNo) throws Exception{
		Board board = null;
		Connection con =dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(BoardSQL.BROAD_SELECT_BY_NO);
		pstmt.setInt(1, boardNo);
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			board = new Board(rs.getInt("board_no"),
							rs.getString("board_title"),
							rs.getString("board_content"),
							rs.getDate("board_wday"),
							rs.getInt("board_read_count")
							);
		}
		dataSource.close(con);
		return board;
	}
	
	public List<Board> selectAll() throws Exception{
		List<Board> boardList = new ArrayList<Board>();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(BoardSQL.BROAD_SELECT_ALL);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			boardList.add(new Board(rs.getInt("board_no"),
					rs.getString("board_title"),
					rs.getString("board_content"),
					rs.getDate("board_wday"),
					rs.getInt("board_read_count")
					)
				);
		}
		dataSource.close(con);
		return boardList;
	} 	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//end
