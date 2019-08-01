package web.controller;

import com.sun.xml.internal.bind.v2.model.core.ID;
import domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.naming.Name;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Controller
public class MyController {

    //发送请求第一种方式:使用传统的request对象来接收参数
    @RequestMapping("/first01.action")
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
    @RequestMapping("/first02.action")
    public String myform(HttpServletRequest request){
        String id2 = request.getParameter("id");
        String name2 = request.getParameter("name");
        System.out.println(id2);
        System.out.println(name2);
        return "redirect:/second.jsp";
    }

    //第二种方式：不使用request接收简单类型参数
    //当请求的参数名称和处理器形参名称一致时会将请求参数与形参进行绑定，并且会自动进行类型的转换：基本数据类型-->包装类
    /*形参的类型与绑定的类型不一致时,可以使用@RequestParam进行匹配
    value：请求参数名字、required：是否必须，默认是true，表示请求中一定要有相应的参数，否则将报错、defaultValue：默认值，表示如果请求中没有同名参数时的默认值*/
    @RequestMapping("/second.action")
    //前提：参数名称需保持一致，如果要求参数名称不一致,则可以在前面加上 @RequestParam(value = " ")
    public String myform2(@RequestParam(value = "id",required = false,defaultValue = "100") Integer idkey, String name){
        System.out.println(idkey);
        System.out.println(name);
        return "redirect:/second.jsp";
    }

    //使用Javabean对象接收参数：要求对象当中的属性要和表单当中的名称一致
    @RequestMapping("/myform")
    public String myform3(User user){
        System.out.println(user);
        return "redirect:/second.jsp";
    }

    //数组接收参数
/*    @RequestMapping("/myform2")
    public String myform4(String name[]){
        System.out.println(Arrays.toString(name));
        return "redirect:/second.jsp";
    }*/
    @RequestMapping("/myform2")
    public String myform4(User user){
        System.out.println(user);
        return "redirect:/second.jsp";
    }


}
