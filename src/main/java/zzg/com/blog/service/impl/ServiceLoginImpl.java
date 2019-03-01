package zzg.com.blog.service.impl;

import org.springframework.stereotype.Service;
import zzg.com.blog.dao.AccountDao;
import zzg.com.blog.pojo.Account;
import zzg.com.blog.service.ServiceLogin;

import javax.annotation.Resource;

@Service
public class ServiceLoginImpl implements ServiceLogin {

    @Resource
    private AccountDao accountDao;

    @Override
    public Account login(Account account) {
        Account one = accountDao.login(account);
        if (one!=null){
            return one;
        }else {
            return null;
        }
    }
}
