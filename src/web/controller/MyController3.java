package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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

    //SpringMVC-@RequestMapping之headers属性：发送的请求头必须要与设置的请求相同时,才能够访问到对应的方法
    @RequestMapping(
            value = {"testheaders.action"},
            headers = {"Host=localhost:8080","Referer=http://localhost:8080/SpringMVCProject2_war_exploded/requestmapping.jsp"}
    )
    public String testHeaders(){
        System.out.println("测试SpringMVC-@RequestMapping之headers属性\n");
        System.out.println("Host=localhost:8080\",\"Referer=http://localhost:8080/SpringMVCProject2_war_exploded/requestmapping.jsp");
        return "/second.jsp";
    }

    //ant风格地址
    @RequestMapping("testant.action/??")
    public String testAnt(){
        System.out.println("testant");
        return "/second.jsp";
    }

    //REST风格请求
    /*  REST 即 Representational State Transfer （资源）表现层状态转化
        用URL定位资源,用HTTP描述操作
        是目前最流行的一种互联网软件架构
        它结构清晰、符合标准、易于理解、扩展方便，所以正得到越来越多网站的采用
        使用POST, DELETE, PUT, GET 分别对应 CRUD
        Spring3.0 开始支持 REST 风格的请求*/
    @RequestMapping("restful/{id}")
    public String testRest(@PathVariable Integer id){//使用@PathVariable接收RestFul风格参数
        System.out.println("SpringMVC使用@PathVariable接收RestFul风格参数----:"+id);
        return "/second.jsp";
    }

    //默认情况下Form表单是不支持PUT请求和DELETE请求的
    //spring3.0添加了一个过滤器HiddenHttpMethodFilter
    //可以将post请求转换为PUT或DELETE请求
    @RequestMapping(value = "testRestForm/{id}",method = RequestMethod.PUT)
    public String testRestForm(@PathVariable Integer id){
        System.out.println("testRestForm==="+id);
        /*return "/second.jsp";// JSPs only permit GET POST or HEAD*/
        return "redirect:/localsecond_jsp";//重定向
    }
    @RequestMapping("localsecond_jsp")
    public String localsecond(){ return "/second.jsp"; }

    //SpringMVC-@RequestHeader,作用：在方法中接收请求头当中的信息
    @RequestMapping("testHeader")
    public String testHeader(@RequestHeader("Host") String host,
                             @RequestHeader("Referer") String referer,
                             @RequestHeader("Cookie") String cookie,
                             @CookieValue("JSESSIONID") String sessionID){  //@CookieValue,作用:用来接收浏览发送过来的cookie值
        System.out.println("测试SpringMVC-@RequestHeader");
        System.out.println("主机地址："+host);
        System.out.println("Referer:"+referer);
        System.out.println(cookie);
        System.out.println(sessionID);
        return "/second.jsp";
    }
}
