package com.jang.ezen.mapper;

import java.util.List;

import com.jang.ezen.dto.StartMemberVO;

public interface StartMemberMapper {
	public String getTime();
	
	public int insertMember(StartMemberVO vo);
	public int updateMember(StartMemberVO vo);
	public int deleteMember(int id);
	
	public StartMemberVO selectOneMember(int id);
	public List<StartMemberVO> selectAllList();

}
