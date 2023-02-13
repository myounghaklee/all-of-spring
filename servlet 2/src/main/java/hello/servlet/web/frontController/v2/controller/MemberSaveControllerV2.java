package hello.servlet.web.frontController.v2.controller;

import hello.servlet.domain.member.Member;
import hello.servlet.web.frontController.Myview;
import hello.servlet.web.frontController.v2.ControllerV2;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class MemberSaveControllerV2 implements ControllerV2 {
    @Override
    public Myview process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("username");
        int age = Integer.parseInt(request.getParameter("age"));

        Member member = new Member(userName, age);

        //Model에 보관
        request.setAttribute("member", member);
        return new Myview("/WEB-INF/views/save-result.jsp");
    }
}
