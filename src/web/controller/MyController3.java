package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.awt.SunHints;

@Controller
public class MyController3 {

    //SpringMVC-@RequestMapping之value属性：用来设置请求路径，值是一个字符串数组，可以设置多个路径共同访问对应方法
    @RequestMapping(
            value = {"testRequestMapping_value1.action","testRequestMapping_value2.action"}
    )
    public String testValue(){
        System.out.println("testRequest----------测试SpringMVC-@RequestMapping之value属性");
        return "/second.jsp";
    }

    //测试SpringMVC-@RequestMapping之method属性：用来设置映射的请求方式
    //值是RequestMethod类型的数组
    //如果没有写,则没有限制,post与get都可以请求到对应的方法
    //如果指定了请求类型,则必须得是相应的请求才能访问到对应的方法
    @RequestMapping(
            value = "testMethod.action",
            method = RequestMethod.POST//两个都允许：method = {RequestMethod.POST,RequestMethod.GET}
             )
    public String testMethod(){
        System.out.println("测试SpringMVC-@RequestMapping之method属性");
        return "/second.jsp";
    }

    //SpringMVC-@RequestMapping之params属性：必须设置对应的请求参数和请求值才能访问到对应的内容

    @RequestMapping(
            value = {"testparams.action"},
            params = {"name=luzhibin","age=10"}
            )
    public String testParams(){
        System.out.println("测试SpringMVC-@RequestMapping之params属性");
        return "/second.jsp";
    }

    //SpringMVC-@RequestMapping之params属性：发送的请求头必须要与设置的请求相同时,才能够访问到对应的方法
    @RequestMapping(
            value = {"testheaders.action"},
            headers = {"Host=localhost:8080","Referer=http://localhost:8080/SpringMVCProject2_war_exploded/requestmapping.jsp"}
    )
    public String testHeaders(){
        System.out.println("测试SpringMVC-@RequestMapping之headers属性\n");
        System.out.println("Host=localhost:8080\",\"Referer=http://localhost:8080/SpringMVCProject2_war_exploded/requestmapping.jsp");
        return "/second.jsp";
    }

    @RequestMapping("testant.action/??")
    public String testAnt(){
        System.out.println("testant");
        return "/second.jsp";
    }
}
