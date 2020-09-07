package com.gome.interceptor;


import com.gome.constant.GomeConstant;
import com.gome.pojo.GomeUser;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Description: 拦截器
 * @Author: WangJinYue
 * @Date: 2020/8/4 16:35
 * @Modified By:
 */
public class AuthenticationInterceptor implements HandlerInterceptor {

    /**
     * 执行controller方法之前
     *
     * @param request
     * @param response
     * @param handler
     * @return false->拦截 true->放行
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.err.println("拦截器的前处理!!!");
        // 1. 获取session
        HttpSession session = request.getSession();
        // 2.通过session获取用户信息
        GomeUser gomeUser = (GomeUser) session.getAttribute(GomeConstant.USER);
        // 3.判断是否为null
        if (gomeUser == null) {
            // 3.1 为null->用户为登录 ->跳转到登录页面 return false;
            response.sendRedirect(request.getContextPath() + "/");
            return false;
        } else {
            // 3.4 不为null return true;
            return true;
        }
    }

    /**
     * 执行controller方法之后 返回ModelAndView之后执行
     * 拦截器的post处理中，修改ModelAndView
     *
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.err.println("拦截器的post请求!!!");
    }

    /**
     * 响应数据之前
     * 渲染完视图之后 查看请求响应了多长时间
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.err.println("拦截器的后处理!!!");
    }

}
