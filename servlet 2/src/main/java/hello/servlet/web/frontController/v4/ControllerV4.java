package hello.servlet.web.frontController.v4;

import java.util.Map;

public interface ControllerV4 {


    /**
     * 이 버전은 modelView가 없다.model 객체는 파라미터로 전달되기 땜누에 그냥 사용하면 되고, 결과로 뷰의 이름만 반환해주면 된다.
     * @param paramMap
     * @param model
     * @return
     */
    String process(Map<String, String> paramMap, Map<String, Object>model);
}
