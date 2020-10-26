package com.control;

import com.entity.S_user;
import com.result.Result;
import com.service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserControl {

    @Autowired
    private UserServiceInterface serviceInterface;

    /**
     * 登录功能
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public Result login(String username, String password,String checkcode, HttpServletRequest request){
        System.out.println(username+"    "+password+"   "+checkcode);
        /**
         * 做题思路：
         * 1.先获取验证进行比较
         * 2.获取用户名密码进行比较
         * 3.响应数据
         */
        Result result = null;
        HttpSession session = request.getSession();
        String code = (String) session.getAttribute("rand");
        System.out.println(code);
        if(code.toLowerCase().equals(checkcode.toLowerCase())){
            S_user s_user = serviceInterface.login(username, password);
            if(s_user!=null&&!StringUtils.isEmpty(s_user)){
                result = new Result(1,"响应成功",s_user);
            }else{
                result = new Result(2,"用户名或密码错误",null);
            }
        }else{
            result = new Result(3,"验证码错误",null);
        }
        return result;














//        //声明响应对象
//        Result result=null;
//        //获取session对象中的验证码
//        String code= (String) request.getSession().getAttribute("rand");
//        //获取页面的验证码和session对象中的验证码进行比较
//        if(code.toLowerCase().equals(checkcode.toLowerCase())){//统一把验证码转为小写之后，在进行比较
//            //调用业务层方法
//            S_user s_user = serviceInterface.login(username, password);
//
//            if(s_user!=null && !StringUtils.isEmpty(s_user)){
//                result=new Result(1,"成功响应",s_user);
//            }
//            else {
//                result=new Result(2,"用户名或密码有误",null);
//            }
//        }else {
//            result=new Result(3,"验证码不正确",null);
//        }
//
//
//        return result;
    }
}
