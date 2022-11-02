package com.milotnt.mapper;

import com.milotnt.pojo.ClassOrder;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author MiloTnT [milotntspace@gmail.com]
 * @date 2021/8/11
 */

@Mapper
public interface ClassOrderMapper {

    //查询所有报名表信息
    List<ClassOrder> findAll();

    //添加报名信息
    Boolean insertClassOrder(ClassOrder classOrder);

    //根据会员账号查询个人报名课表
    List<ClassOrder> selectClassOrderByMemberAccount(Integer memberAccount);

    //删除已预约的课程
    Boolean deleteByClassOrderId(Integer classOrderId);

    //查询会员是否报名该课程
    ClassOrder selectMemberByClassIdAndMemberAccount(Integer classId, Integer memberAccount);

    //根据课程 id 查询所有报名的会员
    List<ClassOrder> selectMemberOrderList(Integer classId);

}
