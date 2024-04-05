package com.jang.ezen.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StartMemberVO {
	private int id;
	private String name;
	private String phone;
	private String address;
}
