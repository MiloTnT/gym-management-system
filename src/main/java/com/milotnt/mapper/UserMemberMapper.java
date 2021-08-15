package com.milotnt.mapper;

import com.milotnt.pojo.Member;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ZhangMing [1157038410@qq.com]
 * @date 2021/8/11
 */

@Mapper
public interface UserMemberMapper {

    //根据会员账号查询会员
    Member selectByMemberAccount(Integer memberAccount);

}
