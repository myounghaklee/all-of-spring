package hello.springmvc.basic.request;

import jakarta.servlet.ServletInputStream;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Slf4j
@Controller
public class RequestBodystringController {
    @PostMapping("/request-body-string-v1")
    public void requestBodyString(HttpServletRequest request, HttpServletResponse response)throws IOException{
        ServletInputStream inputStream = request.getInputStream();
        StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);
    }
}
