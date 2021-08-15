package com.milotnt.mapper;

import com.milotnt.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ZhangMing [1157038410@qq.com]
 * @date 2021/8/10
 */

@Mapper
public interface AdminMapper {

    Admin selectByAccountAndPassword(Admin admin);

}
