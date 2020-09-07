package com.gome.controller;

import com.gome.pojo.GomeUser;
import com.gome.service.GomeUserService;
import com.gome.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.events.Event;

import static com.gome.constant.GomeConstant.*;
import static com.gome.enums.ResultEnums.*;

import javax.servlet.http.HttpSession;

/**
 * @Description: 处理登录和注册
 * @Author: WangJinYue
 * @Date: 2020/8/3 15:33
 * @Modified By:
 */
@Controller
public class LoginController {
    @Autowired
    private GomeUserService gomeUserService;

    /**
     * 访问登录页面
     *
     * @return
     */
    @GetMapping({"/", "/login-ui"})
    public String loginUI() {
        return LOGIN;
    }

    /**
     * 处理登录
     *
     * @param userName
     * @param userPass
     * @param session  登录成功 像session中存放用户
     * @return
     */
    @PostMapping("/login")
    @ResponseBody
    public ResultUtil login(String userName, String userPass, HttpSession session) {
        //1. 校验参数是否合法.
        if (StringUtils.isEmpty(userName) || StringUtils.isEmpty(userPass)) {
            // 参数不合法.
            return ResultUtil.build(LOGIN_NULL.getStatus(), LOGIN_NULL.getMsg());
        }
        //2. 调用service执行登录.
        GomeUser gomeUser = gomeUserService.login(userName, userPass);
        //3. 根据service返回结果判断登录是否成功.
        if (gomeUser != null) {
            //4. 如果成功,将用户的信息放到session域中.
            session.setAttribute(USER, gomeUser);
            return ResultUtil.ok();
        } else {
            //5. 如果失败,响应错误信息给ajax引擎.
            return ResultUtil.build(LOGIN_ERROR.getStatus(), LOGIN_ERROR.getMsg());
        }
    }

    /**
     * 修改密码
     *
     * @param gomeUser
     * @return
     */
    @PostMapping("/update-user")
    @ResponseBody
    public ResultUtil updateUser(GomeUser gomeUser, String confirmPass) {
        if (StringUtils.isEmpty(gomeUser.getUserName()) || StringUtils.isEmpty(gomeUser.getUserPersonsName())) {
            return ResultUtil.build(USER_NAME_ERROR.getStatus(), USER_NAME_ERROR.getMsg());
        }
        if (StringUtils.isEmpty(gomeUser.getUserPass())){
            return ResultUtil.build(PASS_ERROR.getStatus(), PASS_ERROR.getMsg());
        }
        if(!gomeUser.getUserPass().equals(confirmPass)){
            return ResultUtil.build(UPDATE_PASS_NULL.getStatus(),UPDATE_PASS_NULL.getMsg());
        }
        return gomeUserService.updateUser(gomeUser);
    }
}
