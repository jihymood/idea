# idea

Idea后台交互数据模板：以后的项目可以参考拿来这个模板直接用  
项目成功运行但是客户端调用的时候报错，没有获取到数据。在项目运行过程中发现有security，于是在项目的xxx.iml文件中找到了下面几句，删除即可。  

`<orderEntry type="library" name="Maven: org.springframework.security:spring-security-web:4.2.2.RELEASE" level="project" />
<orderEntry type="library" name="Maven: org.springframework.security:spring-security-core:4.2.2.RELEASE" level="project" />
<orderEntry type="library" name="Maven: org.springframework.security:spring-security-config:4.2.2.RELEASE" level="project" />`


