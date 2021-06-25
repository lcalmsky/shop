package io.lcalmsky.shop.service;

import io.lcalmsky.shop.domain.Member;
import io.lcalmsky.shop.repository.MemberRepositoryOld;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class MemberServiceTest {

    @Autowired
    MemberService memberService;
    @Autowired
    MemberRepositoryOld memberRepository;

    @Test
    public void 회원가입() {
        // given
        Member member = new Member();
        member.setName("kim");

        // when
        Long joinedMemberId = memberService.join(member);

        // then
        assertEquals(member, memberRepository.findOne(joinedMemberId));
    }

    @Test
    public void 중복_회원_예외() {
        // given
        Member member1 = new Member();
        member1.setName("kim");

        Member member2 = new Member();
        member2.setName("kim");

        // when
        memberService.join(member1);
        assertThrows(IllegalArgumentException.class, () -> memberService.join(member2));
    }
}
