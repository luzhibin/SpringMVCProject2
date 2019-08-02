package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class MyController2 {
    @RequestMapping("convert.action")
    public ModelAndView testConvert(Integer age, Date date,String name){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println(age);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(date));
        System.out.println(name);
        modelAndView.setViewName("/second.jsp");
        return modelAndView;
    }
}
