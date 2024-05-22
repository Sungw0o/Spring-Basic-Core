package hello.core.member;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;

@Component
public class MemoryMemberRepository implements MemberRepository{
    private static Map<Long,Member> store = new HashMap<>();

    @Override
    public void save(Member member){
        store.put(member.getId(),member);
    }

    @Override
    public Member findbyId(Long memberId) {
        return store.get(memberId);
    }


}
