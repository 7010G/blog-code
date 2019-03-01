package zzg.com.blog.dao.impl;

import org.springframework.stereotype.Service;
import zzg.com.blog.dao.AccountDao;
import zzg.com.blog.award.MapperAccount;
import zzg.com.blog.pojo.Account;

import javax.annotation.Resource;

@Service
public class AccountDaoImpl implements AccountDao {

    @Resource
    private MapperAccount mapperAccount;

    public Account login(Account account) {

        Account one = mapperAccount.findOne(account);

        return one;
    }

}
