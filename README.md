# 介绍
为了验证新旧项目对tracing的支持，项目模块说明：

├── dubbo-greeting         # 采用Dubbo+Spring XML配置方式
├── dubbo-user             # 采用Dubbo+Spring XML配置方式
├── dubbo-user-api
├── springboot-dubbo-hello # 采用Springboot Dubbo 注解方式
└── web-front              # 采用Springboot Dubbo XML配置方式

# 调用关系
![image](https://github.com/myc547/springboot-dubbo-jaeger/blob/master/doc/springboot-dubbo-jaeger.png)

# 技术框架
1. dubbo 2.6.0
2. springboot: 2.3.2.RELEASE
3. spring-cloud-starter-zipkin: 2.2.3.RELEASE

# 运行
1.需要有zipkin server支持
2.下载代码运行以xxxApplication开头的main方法