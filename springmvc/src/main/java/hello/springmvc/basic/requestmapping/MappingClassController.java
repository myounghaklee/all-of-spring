package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {

    @GetMapping
    public String users(){
        return "getUsers";
    }

    @PostMapping
    public String addUser(){return "post user";}

    @GetMapping("/{userId}")
    public String finduser(@PathVariable String userId){
        return "userId is" + userId;
    }


}
