package hello.springmvc.basic;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HelloData {
    private String username;
    private Integer age;
}
