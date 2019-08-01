package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {

    @RequestMapping("/first.action")
    public ModelAndView form(HttpServletRequest request){
        //使用传统的request对象来接收参数
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        //设置ModelAndView,用来存放数据和设置跳转的视图
        ModelAndView modelAndView = new ModelAndView();
        //设置数据到模型中，传入数据id和name
        modelAndView.addObject("id",id);
        modelAndView.addObject("name",name);
        System.out.println(id);
        System.out.println(name);
        //设置视图jsp
        modelAndView.setViewName("/second.jsp");
        return modelAndView;
    }
    @RequestMapping
    public String myform(HttpServletRequest request){
        String parameter = request.getParameter("id");
        String parameter1 = request.getParameter("name");
        return "/second.jsp";
    }
}
