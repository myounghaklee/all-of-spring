# all of spring
## webserver
- http 기반으로 동작
- 정적 리소스 제공, 기타 부가기능
- 정적 html, css, js이밎, 영상
- nginx, apache

## was ( wep aaplication server)
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