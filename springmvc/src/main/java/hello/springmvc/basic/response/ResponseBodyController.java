package hello.springmvc.basic.response;

import hello.springmvc.basic.HelloData;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.annotation.RequestScope;

import java.io.IOException;

@Controller
public class ResponseBodyController {

    @RequestMapping("/response-body/string-v1")
    public void responseBodyV1(HttpServletResponse response) throws IOException {
        response.getWriter().write("ok");
    }

    @RequestMapping("/response-body-json-v1")
    public ResponseEntity<HelloData> responseBodyV1() throws IOException {
        HelloData helloData = HelloData.builder().username("enzo").age(30).build();

        return new ResponseEntity<>(helloData, HttpStatus.OK);
    }

    @ResponseBody
    @RequestMapping("/response-body/string-v3")
    public String responseBodyV3()  {
        return "ok";
    }

    @GetMapping("/response-body-json-v1")
    public ResponseEntity<HelloData> responseBodyV4()  {
        HelloData data = new HelloData("hello json v1 controller", 32);

        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @GetMapping("/response-body-json-v2")
    public HelloData responseBodyJsonV2()  {
        HelloData data = new HelloData("userAr", 32);
        return data;
    }

}
