package cn.joinhealth.restful;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by linjian
 * 16/11/15
 * rest api测试
 */
@Controller
@RequestMapping("/restful")
public class RestFulTest {
    @RequestMapping(value = "/1", method = RequestMethod.GET)
    public ResponseEntity<User> getUser(@RequestParam(value = "name", defaultValue = "linjian")String name) {
        User user1 = new User("zhangsan",12);
        User user2 = new User("lisi",15);
        User user3 = new User("linjian",29);
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        for (User user:userList) {
            if (name.equals(user.getName())){
                return new ResponseEntity<>(user, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(new User("aaa", 11), HttpStatus.OK);
    }
}
