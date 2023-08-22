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
}
