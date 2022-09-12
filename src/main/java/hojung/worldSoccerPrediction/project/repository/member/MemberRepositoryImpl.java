package hojung.worldSoccerPrediction.project.repository.member;

import hojung.worldSoccerPrediction.project.domain.member.Member;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class MemberRepositoryImpl implements CustomMemberRepository {
    @Override
    public Optional<Member> findByNickname(String nickname) {
        return Optional.empty();
    }

    @Override
    public Optional<Member> findByEmail(String email) {
        return Optional.empty();
    }
}
