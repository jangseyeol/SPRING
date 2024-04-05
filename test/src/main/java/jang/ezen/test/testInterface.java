package jang.ezen.test;

import java.util.List;

public interface testInterface {
	int insertMember(MemberVO vo);
	int updateMember(MemberVO vo);
	int deleteMember(int id);
	
	MemberVO selectMemberOne(int id);

	List<MemberVO> selectMemberList();
	

}
