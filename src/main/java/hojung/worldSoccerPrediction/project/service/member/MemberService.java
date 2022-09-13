package hojung.worldSoccerPrediction.project.service.member;

import hojung.worldSoccerPrediction.project.domain.member.Member;

public interface MemberService {

    void join(Member member); // 회원 가입

    Long login(String email, String password); // email과 password로 로그인

    Member getMember(Long memberId); // id로 회원 조회
    void changeMember(Member member); // id로 회원 정보 수정
    Long deleteMember(Long memberId);// id로 회원 삭제
}
