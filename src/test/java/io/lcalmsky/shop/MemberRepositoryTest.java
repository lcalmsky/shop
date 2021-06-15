//package io.lcalmsky.shop;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.transaction.annotation.Transactional;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@SpringBootTest
//class MemberRepositoryTest {
//
//    @Autowired
//    MemberRepository memberRepository;
//
//    @Test
//    @DisplayName("Member 저장 테스트")
//    @Transactional
//    void save() {
//        //given
//        Member member = new Member();
//        member.setUsername("홍길동");
//        // when
//        Long savedId = memberRepository.save(member);
//        Member foundMember = memberRepository.find(savedId);
//        // then
//        assertThat(foundMember.getId()).isEqualTo(member.getId());
//        assertThat(foundMember.getUsername()).isEqualTo(member.getUsername());
//    }
//
//    @Test
//    void find() {
//    }
//}
