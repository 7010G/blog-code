package zzg.com.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import zzg.com.blog.pojo.Account;
import zzg.com.blog.service.ServiceLogin;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class Controller_Login {

    @Resource
    private ServiceLogin serviceAccount;

    @RequestMapping(value = "/",method = {RequestMethod.GET,RequestMethod.POST})
    public String login(){
        System.out.println("");
        return "/login/login";
    }


    @RequestMapping(value = "/login" ,method = {RequestMethod.GET,RequestMethod.POST})
    public String login(Account account, HttpSession session) {
        System.out.println(account.toString());
        account = serviceAccount.login(account);
        if(account!=null){
            session.setAttribute("userName",account.getUsername());
            return "/home";
        }else {
            return  "error";
        }
    }
}
