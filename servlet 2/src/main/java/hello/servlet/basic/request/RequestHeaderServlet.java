package hello.servlet.basic.request;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "requestHeaderServlet", urlPatterns = "/request-header")
public class RequestHeaderServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.service(request, response);
        printHeaders(request);
        printHeaderUtils(request);
    }

    private void printHeaderUtils(HttpServletRequest request) {
        System.out.println("---Header 편의 조회 Start ----");
        System.out.println("[HOst 편의 조회 ]");
        System.out.println("request.getServername() = :" + request.getServerName());//host header
        System.out.println("request.getServerPort() = :" + request.getServerPort()); // host header
        System.out.println();

        System.out.println("[Accept-Language 편의 조회]");
        request.getLocales().asIterator()
                .forEachRemaining(locale -> System.out.println("locale = : " + locale));
        System.out.println("request.getLocalie() = " + request.getLocales());
        System.out.println();


    }

    //ader 모든 정보
    private void printHeaders(HttpServletRequest request){
        System.out.println("---Headers - start ----");
//        Enumeration<String> headerNames = request.getHeaderNames();
//        while (headerNames.hasMoreElements()){
//            String headerName = headerNames.nextElement();
//            System.out.println(headerName + ": " + headerName);
//        }

        request.getHeaderNames().asIterator()
                        .forEachRemaining(headerName -> System.out.println(headerName + " : " + headerName));
        System.out.println("---Headers - end----");
        System.out.println();


    }


}
