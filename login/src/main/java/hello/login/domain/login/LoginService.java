package hello.login.domain.login;

import hello.login.domain.member.Member;
import hello.login.domain.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class LoginService {
    private final MemberRepository memberRepository;

    public Member login(String loginId, String password){
        /**
         * 주석 코드 == 아래코드
         */
//        Optional<Member> findMemeberOptional = memberRepository.findByloginId(loginId);
//        Member member = findMemeberOptional.get();
//        if(member.getPassword().equals(password)){
//            return member;
//        }else{
//            return null;
//        }

        Optional<Member> byloginId = memberRepository.findByloginId(loginId);
        return byloginId.filter(m -> m.getPassword().equals(password))
                .orElse(null);
    }

}
