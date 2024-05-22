package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository; //추상화에만 의존 DIP 원칙을 지킴

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }
    @Override
    public void join(Member member){
        memberRepository.save(member);
    }
    @Override
    public Member findMember(Long memberId){
        return memberRepository.findbyId(memberId);
    }

    //테스트
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
