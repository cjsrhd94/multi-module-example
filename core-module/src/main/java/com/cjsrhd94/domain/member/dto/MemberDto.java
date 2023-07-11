package com.cjsrhd94.domain.member.dto;

import com.cjsrhd94.domain.member.entity.Member;

import lombok.Getter;
import lombok.NoArgsConstructor;

public class MemberDto {

	@Getter
	@NoArgsConstructor
	public static class Create {
		private String name;

		public Member toEntity() {
			return Member.builder()
				.name(name)
				.build();
		}
	}
}
