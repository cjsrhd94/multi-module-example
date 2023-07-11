package com.cjsrhd94.domain.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjsrhd94.domain.member.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
