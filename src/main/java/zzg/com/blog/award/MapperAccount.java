package zzg.com.blog.award;

import org.apache.ibatis.annotations.Param;
import zzg.com.blog.pojo.Account;

import java.util.List;

public interface MapperAccount{

    List<Account> select(Account account);

    Integer insert(Account account);

    Integer update(Account account);

    void delete(Account account);

    Account  findOne(@Param("account") Account account);



}
