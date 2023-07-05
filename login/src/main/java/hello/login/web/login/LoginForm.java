package hello.login.web.login;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
@Builder
public class LoginForm {

    @NotEmpty
    private String loginId;

    @NotEmpty
    private String password;
}
