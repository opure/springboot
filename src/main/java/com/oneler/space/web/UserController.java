package com.oneler.space.web;

import com.oneler.space.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by opure on 2016/8/14.
 */
@RestController
@RequestMapping("/users")
public class UserController {
    static Map<Long,User> users = Collections.synchronizedMap(new HashMap<Long,User>());

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<User> getUserList() {
        List<User> list = new ArrayList<>(users.values());
        return list;

    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String postUser(@ModelAttribute User user) {
        users.put(user.getId(),user);
        return "success";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable Long id) {
        return users.get(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updaeUser(@PathVariable Long id,@ModelAttribute User user) {
        User u = users.get(id);
        u.setAge(user.getAge());
        u.setName(user.getName());
        users.put(id,u);
        return "success";

    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id) {
        users.remove(id);
        return "success";
    }


}
