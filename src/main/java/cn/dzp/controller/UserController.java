package cn.dzp.controller;
import cn.dzp.entity.User;
import cn.dzp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/homePage")
    public String list(Model model) {
        List<User> list = userService.findAllUser();
        model.addAttribute("list", list);
        return "homePage";
    }

    @RequestMapping("addPage")
    public String toAddPaper() {
        return "addPage";
    }

    @RequestMapping("/addUser")
    public String addUser(User user) {
        userService.addUser(user);
        return "redirect:/user/homePage";
    }

    @RequestMapping("/delUser/{id}")
    public String delUser(@PathVariable("id") Long id) {
        userService.delUserById(id);
        return "redirect:/user/homePage";
    }

    @RequestMapping("updatePage")
    public String updatePage(Model model, Long id) {
        model.addAttribute("user", userService.queryById(id));
        return "updatePage";
    }

    @RequestMapping("/updateUser")
    public String updatePaper(Model model, User user) {
        userService.updateUser(user);
        user = userService.queryById(user.getId());
        model.addAttribute("user", user);
        return "redirect:/user/homePage";
    }
}

