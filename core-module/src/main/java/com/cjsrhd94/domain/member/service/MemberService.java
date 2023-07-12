package com.cjsrhd94.domain.member.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cjsrhd94.domain.member.dto.MemberDto;
import com.cjsrhd94.domain.member.entity.Member;
import com.cjsrhd94.domain.member.repository.MemberQueryRepository;
import com.cjsrhd94.domain.member.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {
	private final MemberRepository memberRepository;
	private final MemberQueryRepository memberQueryRepository;

	public Long save(MemberDto.Create dto) {
		return memberRepository.save(dto.toEntity())
			.getId();
	}

	public MemberDto.FindOne findByMemberId(Long id) {
		Member member = memberQueryRepository.findByMemberId(id);
		return new MemberDto.FindOne(member);
	}
}
