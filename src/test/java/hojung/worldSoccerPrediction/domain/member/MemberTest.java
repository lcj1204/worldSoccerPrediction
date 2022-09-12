package hojung.worldSoccerPrediction.domain.member;

import hojung.worldSoccerPrediction.project.domain.member.Member;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MemberTest {

    @Test
    void MemberbuilderTest () {
        Member member = Member.builder()
                .email("email@email.com")
                .nickname("")
                .build();

        assertThat(member.getId()).isNull();
        assertThat(member.getEmail()).isEqualTo("email@email.com");
        assertThat(member.getPassword()).isNull();
    }
}