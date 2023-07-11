package com.cjsrhd94.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjsrhd94.domain.member.dto.MemberDto;
import com.cjsrhd94.domain.member.service.MemberService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/member")
public class MemberController {
	private final MemberService memberService;

	@PostMapping
	public Long save(@RequestBody MemberDto.Create dto) {
		return memberService.save(dto);
	}
}
