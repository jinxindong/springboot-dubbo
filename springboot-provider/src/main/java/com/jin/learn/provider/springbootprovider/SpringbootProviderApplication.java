package com.jin.learn.provider.springbootprovider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {
		"classpath:provider.xml"
})//开启注解 然后这里如果再次导入 在管控台会出现2个实例*/
//@EnableDubbo// 开启这个注解之后 不需要xml文件 xml文件不会生效   使用dubbo的@Service和@Reference
public class SpringbootProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProviderApplication.class, args);
	}

}
