package com.milotnt.mapper;

import com.milotnt.pojo.ClassTable;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author MiloTnT [milotntspace@gmail.com]
 * @date 2021/8/11
 */

@Mapper
public interface ClassTableMapper {

    //查询所有课程
    List<ClassTable> findAll();

    //根据 id 删除课程
    Boolean deleteClassByClassId(Integer classId);

    //添加课程
    Boolean insertClass(ClassTable classTable);

    //根据 id 查询课表
    ClassTable selectByClassId(Integer classId);

    //根据 id 删除已预约的课程
    Boolean deleteOrderByClassId(Integer classId);

}
