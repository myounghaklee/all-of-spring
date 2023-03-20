package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class MappingClassController {

    @GetMapping
    public String users(){
        return "get users";
    }

    @PostMapping("/mapping/users")
    public String addUser(){return "post user";}

    @PatchMapping("/mapping/users/{userId}")
    public String finduser(@PathVariable String userId){
        return "userId is" + userId;
    }

    @DeleteMapping("/mapping/users/{userId}")
    public String delteUser(@PathVariable String userId){
        return "delte userId = " + userId;
    }


}
