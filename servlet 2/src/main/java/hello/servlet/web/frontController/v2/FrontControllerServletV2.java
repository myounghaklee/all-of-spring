package hello.servlet.web.frontController.v2;


import hello.servlet.web.frontController.Myview;
import hello.servlet.web.frontController.v1.ControllerV1;
import hello.servlet.web.frontController.v1.MemberListControllerV1;
import hello.servlet.web.frontController.v1.controller.MemberFormControllerV1;
import hello.servlet.web.frontController.v1.controller.MemberSaveControllerV1;
import hello.servlet.web.frontController.v2.controller.MemberFormControllerV2;
import hello.servlet.web.frontController.v2.controller.MemberLIstControllerV2;
import hello.servlet.web.frontController.v2.controller.MemberSaveControllerV2;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "frontControllerServletV2", urlPatterns = "/front-controller/v2/*")
public class FrontControllerServletV2 extends HttpServlet {
    private Map<String, ControllerV2> controllerMap = new HashMap<>();

    public FrontControllerServletV2() {
        //"url" 로 들어오면 mew Controller로 연동된다.
        //Http 요청이 들어왔을때 호출하는 매핑정보 세팅
        controllerMap.put("/front-controller/v2/members/new-form", new MemberFormControllerV2());
        controllerMap.put("/front-controller/v2/members/save", new MemberSaveControllerV2());
        controllerMap.put("/front-controller/v2/members/members", new MemberLIstControllerV2());
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("FrontControllerServlerV2.service");

        String requestURI = request.getRequestURI();
        ControllerV2 controller = controllerMap.get(requestURI);
        //예외처리
        if (controller == null) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        }
        Myview myview = controller.process(request, response);
        myview.render(request,response);
    }
}
