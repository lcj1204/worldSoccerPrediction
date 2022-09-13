package hojung.worldSoccerPrediction.project.repository.member;

import hojung.worldSoccerPrediction.project.domain.member.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByNickname(String alias);
    Optional<Member> findByEmail(String email);
    List<Member> findAll();
}
