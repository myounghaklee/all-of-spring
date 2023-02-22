package hello.servlet.web.frontController.v5;

import hello.servlet.web.frontController.ModelView;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface MyHandlerAdapter {

    //handler는 컨트롤러를 말함
    // 어댑터가 해당 컨트롤러를 처리할 수 있는지 판단하는 메서드
    boolean supports(Object handler);

    //실제 컨트롤러가 Modelview를 반환하지 못하면 어댑터가 직접 생성해서라도 반환해줘야됨
    ModelView handle(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException, IOException;
}
