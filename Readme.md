# all of spring
## webserver
- http 기반으로 동작
- 정적 리소스 제공, 기타 부가기능
- 정적 html, css, js이밎, 영상
- nginx, apache

## WAS ( wep aaplication server)
- http기반으로 동작
- 웹 서버 기능 포함 + 정적 리소스 제공 가능
- 코드를 실행해서 애플리케이션 로직 수행
  - 동적 html, http api(json)
  - 서블릿, jsp  스프링 mvc
- 톰캣, jetty, undertow가 있음

## 웹서버, WAS 차이 
- 웹서버는 정적리소스, WAS는 애플리케이션 로직
- 둘의 요어도 경계도 모호함
  - 웹서버도 프로그램을 실행하는 기능을 포함하기도함
  - WAS도 웹서버 기능을 제공함
- 자바는 서블린 컨테이너 기능을 제공하면 WAS( 서블릿 없이 자바 코들르 실행하는 서버 프레임워크도 있음)
- WAS는 애플리케이션 코들르 실행하는데 더 특화 되어 있다.

## 웹 시스템 구성하는방법
Client -> WebServer -> WAS -> DB 를 연결하여 구성한다
- WebServer는 정적리소스( HTML, CSS, JS, image)fmf cjflgkrh
- 웹서버는 애플리케이션 로직같은 동적인 처리가 필요하면 WAS에 요청을 위임한다. 
- WAS는 중요한 애플리케이션 로직을 전담하여 처리한다

이렇게 하면 효율적인 리소스 관리리가 가능하다 
- 정적 리소스가 많이 사용되면 웹서버만 늘리는등 할 수 있다. 
- 정적 리소스만 제공하는 웹 서버는 잘 죽지 않는다. 
- 애플리케이션 로직이 동작하는 WAS 서버는 잘 죽음
- WAS, DB장애시 WebServer서버가 오류화면을 제공할 수 있다. 

## Servlet
```java
@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet{
    @Override
  protected void service(httpServletRequest request, HttpServletResponse response ){
        //application logic
    }
}

```
- urlPatterns()의 url이 호출되면 서블릿코드 실행
- HTTP 요청정보를 편리하게 사용할 수 있는 HttpServletRequest
- HTTP 응답 정보를 편리하게 제공할 수 있는 HttpServletResponse
- 개발자는 HTTP 스펙을 매우 편리하게 사용
- 