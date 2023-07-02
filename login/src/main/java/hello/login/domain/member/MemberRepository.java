package hello.login.domain.member;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.*;

@Slf4j
@Repository
public class MemberRepository {

    private static Map<Long, Member> store = new HashMap<>(); // static 사용
    private static long sequence = 0L; // static 사요ㅕㅇ

    public Member save(Member member){
        member.setId(++sequence);
        log.info("saved memver ={}", member);
        store.put(member.getId(), member);
        return member;
    }

    public Member findByid(Long id ){
        return store.get(id);
    }

    public Optional<Member> findByloginId(String loginId){

    }

    public List<Member> findAll(){
        return new ArrayList<>(store.values());
    }


}
