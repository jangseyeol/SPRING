package jang.ezen.test;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class MemberVO {
	private int id;
	private String name;
	private String phone;
	private String address;
}