package com.ezen.jang.mapper;

import java.util.List;

import com.ezen.jang.dto.MemberVO;

public interface MemberMapper {
	public String getTime();
	
	public int insertMember(MemberVO vo);
	public int updateMember(MemberVO vo);
	public int deleteMember(int id);
	
	public MemberVO selectOneMember(int id);
	public List<MemberVO> selectAllList();
}
