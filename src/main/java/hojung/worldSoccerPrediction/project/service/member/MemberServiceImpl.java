package hojung.worldSoccerPrediction.project.service.member;

import hojung.worldSoccerPrediction.project.domain.member.Member;
import hojung.worldSoccerPrediction.project.repository.member.MemberRepository;

public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;
    public MemberServiceImpl(MemberRepository memberRepository, MemberRepository memberRepository1) {
        this.memberRepository = memberRepository1;
    }

    @Override
    public void join(Member member) {
        validateDuplicateEmail(member);
        validateDuplicateNickname(member);

        memberRepository.save(member);
    }

    private void validateDuplicateEmail(Member member) {
        memberRepository.findByEmail(member.getEmail())
                .ifPresent(s -> {
                        throw new IllegalArgumentException("이미 존재하는 이메일 입니다.");
                });
    }
    private void validateDuplicateNickname(Member member) {
        memberRepository.findByNickname(member.getNickname())
                .ifPresent(s -> {
                        throw new IllegalArgumentException("이미 존재하는 닉네임 입니다.");
                });
    }

    @Override
    public Long login(String email, String password) {
        return null;
    }

    @Override
    public Member getMember(Long memberId) {
        memberRepository.findById(memberId)
                .orElseThrow();
        return null;
    }

    @Override
    public void changeMember(Member member) {
        memberRepository.findById(member.getId())
                .orElseThrow();

        memberRepository.save(member);
    }

    @Override
    public Long deleteMember(Long memberId) {
        Member member = memberRepository.findById(memberId)
                .orElseThrow();

        // memberId 를 리턴해주면, DB에서 찾아 삭제한다.
        return memberId;
    }
}
