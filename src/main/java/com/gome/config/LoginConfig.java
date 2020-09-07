package com.gome.config;

import com.gome.interceptor.AuthenticationInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description: 拦截器配置
 * @Author: WangJinYue
 * @Date: 2020/8/4 16:56
 * @Modified By:
 */
@Configuration
public class LoginConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册 TestInterceptor拦截器
        InterceptorRegistration registration = registry.addInterceptor(new AuthenticationInterceptor());
        // 所有路径都被拦截
        registration.addPathPatterns("/**");
        // 添加不拦截的路径
        registration.excludePathPatterns(
                "/",
                "/static/**",
                "/login-ui",
                "/login",
                "/update-user"
        );

    }

}
