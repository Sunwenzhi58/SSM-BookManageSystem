package cn.highedu.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class SpringMVCSupport extends WebMvcConfigurationSupport {
//设置静态资源访问过滤，当前类需要设置为配置类的话，扫描加载。
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        //当我们访问/pages/***,从pages目录下查找内容
        registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
        registry.addResourceHandler("/css/**").addResourceLocations("/css/");
        registry.addResourceHandler("/js/**").addResourceLocations("/js/");
        registry.addResourceHandler("/plugins/**").addResourceLocations("/plugins/");
    }
}
