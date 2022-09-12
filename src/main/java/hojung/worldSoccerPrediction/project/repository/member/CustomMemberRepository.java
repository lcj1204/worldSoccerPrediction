package hojung.worldSoccerPrediction.project.repository.member;

import hojung.worldSoccerPrediction.project.domain.member.Member;

import java.util.Optional;

public interface CustomMemberRepository {
    Optional<Member> findByNickname(String nickname);
    Optional<Member> findByEmail(String email);
}
