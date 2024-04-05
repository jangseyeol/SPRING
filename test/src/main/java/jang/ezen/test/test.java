package jang.ezen.test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class test {

	public static void main(String[] args) {
	
		try {
		String resource = "jang/ezen/test/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		SqlSession session = sqlSessionFactory.openSession(true);
			  		
		testInterface mapper = session.getMapper(testInterface.class);
		
		MemberVO vo = new MemberVO();
		
		vo.setId(3);
		vo.setName("장에스더");
		vo.setPhone("010-4567-7890");
		vo.setAddress("경기도 화성시");
		
//		mapper.insertMember(vo);
//		mapper.updateMember(vo);
//		mapper.deleteMember(1);
//		vo = mapper.selectMemberOne(1);
//		System.out.println(vo);
		
		List<MemberVO> list = mapper.selectMemberList();
		
		for(MemberVO v2 : list)
			System.out.println(v2);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
