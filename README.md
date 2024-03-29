# SpringMVCProject2总结

## SpringMVC测试工程2：

### 项目环境：

	IDE工具：IDEA、JDK1.8+Tomcat8.5.33、SpringMVC框架版本：spring-webmvc-5.0.7.RELEASE
	所需jar包：存放在\web\WEB-INF\lib目录下

### 总结：
#### 一.SpringMVC的请求转发与重定向

				1. 请求转发与重定向的区别：
				
					1、转发是在服务器端完成的，重定向是在客户端发生的；
					2、转发的速度快，重定向速度慢；
					3、转发是同一次请求，重定向是两次请求；
					4、转发地址栏没有变化，重定向地址栏有变化；
					5、转发必须是在同一台服务器下完成，重定向可以在不同的服务器下完成。
				
				2.学习使用SpringMVC的请求转发与重定向  

#### 二.接收参数  

				1.使用传统request对象接收参数：
				
					Springmvc框架会自动把Request对象传递给方法。
					
				2.不使用request接收简单类型参数：
				
					当请求的参数名称和处理器形参名称一致时会将请求参数与形参进行绑定。
					@RequestParam：形参的类型与绑定的类型不一致时,可以使用@RequestParam进行匹配
					value：请求参数名字
					required：是否必须，默认是true，表示请求中一定要有相应的参数，否则将报错
					defaultValue：默认值，表示如果请求中没有同名参数时的默认值
						
				3.以一个JavaBean对象接收：
				
					要求对象当中的属性要和表单当中的名称一致
					
				4.数组接收数据：
				
					name相同时,中以使用数组来接收对应的参数
					
				5.包装类接收参数	
				
				6.解决POST请求中文乱码问题：在web.xml中添加过滤器
				
#### 三. @RequestMapping相关属性

				1.value属性：
				
					用来设置请求路径值，是一个字符串数组，可以设置多个路径共同访问对应方法
					
				2.method属性：
				
					用来设置映射的请求方式 
					值是RequestMethod类型的数组
					如果没有写,则没有限制,post与get都可以请求到对应的方法
					如果指定了请求类型,则必须得是相应的请求才能访问到对应的方法
				
				3.params属性：
					
					必须设置对应的请求参数和请求值才能访问到对应的内容  
					
				4.headers属性：
				
					发送的请求头必须要与设置的请求相同时,才能够访问到对应的方法
					
				5.SpringMVC-@RequestMapping地址通配符写法(ant风格地址)
				
#### 四. @PathVariable 、@RequestHeader、@CookieValue

##### 1.使用@PathVariable接收RestFul风格参数  	
	
	* 默认情况下Form表单是不支持PUT请求和DELETE请求的
	* spring3.0添加了一个过滤器HiddenHttpMethodFilter
	* 可以将post请求转换为PUT或DELETE请求
	* 注入事项：
		* 从tomcat8开始,如果直接返回jsp页面,会报405错误 ** JSPs only permit GET POST or HEAD**
		* 使用重定向的形式跳转到对应jsp
		* 或者是直接把对应jsp的 isErrorPage="true"

##### 2.过滤器HiddenHttpMethodFilter源码分析  

##### 3.@RequestHeader  

	* 作用：在方法中接收请求头当中的信息
	
##### 4.@CookieValue

	* 作用：用来接收浏览发送过来的cookies值 