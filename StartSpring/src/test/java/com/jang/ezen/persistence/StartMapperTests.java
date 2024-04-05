package com.jang.ezen.persistence;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jang.ezen.dto.StartMemberVO;
import com.jang.ezen.mapper.StartMemberMapper;

import lombok.extern.log4j.Log4j;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class StartMapperTests {

	@Autowired
	private StartMemberMapper startMemberMapper;
	
	@Test
	public void testGetTime() {
		log.info(startMemberMapper.getClass().getName());
		log.info(startMemberMapper.getTime());
	}
	
	@Test
	public void testInsert() {
		StartMemberVO vo = StartMemberVO.builder()
				.id(5)
				.name("장세열")
				.phone("010-1234-5567")
				.address("경기도 화성시")
				.build();
		
		startMemberMapper.insertMember(vo);
	}
	
	@Test
	public void testUpdate() {
		StartMemberVO vo = StartMemberVO.builder()
				.id(5)
				.name("신세계")
				.phone("010-5191-8611")
				.address("경기도 봉담")
				.build();
		
		startMemberMapper.updateMember(vo);
		
	}
	
	@Test
	public void testDelete() {
		startMemberMapper.deleteMember(5);
	}
	
	@Test
	public void testSelectOne() {
		StartMemberVO vo = startMemberMapper.selectOneMember(18);
		log.info(vo);
	}
	
	@Test
	public void testAllList() {
		startMemberMapper.selectAllList()
		.forEach(vo -> log.info(vo));
	}
	
}
