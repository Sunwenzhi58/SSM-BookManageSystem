package cn.highedu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
//@ComponentScan({"cn.highedu.controller","cn.highedu.config"})
@ComponentScan("cn.highedu")
//开启json数据类型的自动转换功能
@EnableWebMvc
public class SpringMVCConfig {
}
