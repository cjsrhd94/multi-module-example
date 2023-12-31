package com.cjsrhd94.domain.member.repository;

import static com.cjsrhd94.domain.member.entity.QMember.*;

import org.springframework.stereotype.Repository;

import com.cjsrhd94.domain.member.entity.Member;
import com.querydsl.jpa.impl.JPAQueryFactory;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MemberQueryRepository {
	private final JPAQueryFactory queryFactory;

	public Member findByMemberId(Long id) {
		return queryFactory
			.select(member)
			.from(member)
			.where(member.id.eq(id))
			.fetchOne();
	}
}
