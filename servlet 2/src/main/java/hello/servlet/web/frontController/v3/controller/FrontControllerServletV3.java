package hello.servlet.web.frontController.v3.controller;

import hello.servlet.web.frontController.v3.ControllerV3;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "frontControllerServletV3", urlPatterns = "/front-controller/v3/*")
public class FrontControllerServletV3 extends HttpServlet {
    private Map<String, ControllerV3> controllerV3Map = new HashMap<>();

    public FrontControllerServletV3(){
        controllerV3Map.put("/front-controller/v3/members/new-form", new MemberFormControllerV3());
        controllerV3Map.put("/front-controller/v3/members/new-form", new MemberSaveControllerV3());
        controllerV3Map.put("/front-controller/v3/members/new-form", new MemberListControllerV3());
    }

}
