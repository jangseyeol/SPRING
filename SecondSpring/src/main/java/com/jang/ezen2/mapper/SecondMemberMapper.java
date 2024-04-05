package com.jang.ezen2.mapper;

import java.util.List;

import com.jang.ezen2.dto.MemberVO;

public interface SecondMemberMapper {
	public String getTime();
	public int insertMember(MemberVO vo);
	
	public int updateMember(MemberVO vo);
	public MemberVO selectOneMember(int id);
	public List<MemberVO> selectAllList();
	
}
