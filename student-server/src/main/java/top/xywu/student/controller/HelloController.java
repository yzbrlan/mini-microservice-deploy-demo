package top.xywu.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.xywu.student.config.StudentProperties;

import javax.annotation.Resource;

/**
 * @author xywu
 * @date 2021/02/07
 */
@RestController
public class HelloController {

    @Resource
    private StudentProperties studentProperties;

    @GetMapping(value = "/hello")
    public String hello() {
        return "age: " + studentProperties.getAge() + " grade: " + studentProperties.getGrade();
    }

    @RequestMapping(value = "/{age}/say/{username}", method = RequestMethod.GET)
    public String say(@PathVariable("age") Integer age, @PathVariable("username") String username) {
        return "age: " + age + " username: " + username;
    }

    @GetMapping(value = "/say")
    public String say2(@RequestParam(value = "age", required = false, defaultValue = "0") Integer result,
                       @RequestParam(value = "username", defaultValue = "boy") String username) {
        return "age: " + result + " username " + username;
    }
}
