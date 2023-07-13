package dao.member;

public class MemberDaoTestMain {

	public static void main(String[] args) throws Exception {
		MemberDao memberDao=new MemberDao();
		
		//System.out.println("delete   --> " + memberDao.delete("우한영"));
		System.out.println("insert   --> " + memberDao.insert(new Member("우한영23","한영","우한영1", "안양",28, "m", null)));
		System.out.println("update   --> " + memberDao.update(new Member("우한영33","한영2","우한영2", "안양시만안구",27, "f", null)));
		System.out.println("selectById-> " + memberDao.selectById("bbbb"));
		System.out.println("selectAll--> " + memberDao.selectAll());
		
	}

}

