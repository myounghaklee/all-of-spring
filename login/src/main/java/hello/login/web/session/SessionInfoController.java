package hello.login.web.session;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
public class SessionInfoController {

    @GetMapping("session-info")
    public String sessionInfo(HttpServletRequest request){

    }


    public MyReservationResponse retrieveReservation(){
        //승인 된 예약 조회
        dropInService.getMyReservation()
        //해당 box의 dropIn에 다른 user가 예약했는지 조회
        boxService.
        //내 예약정보와 다른사람의 예약정보 조합

        //MyReservationResponse로 변환하여 return;
    }
}
