package com.milotnt.service.impl;

import com.milotnt.mapper.ClassOrderMapper;
import com.milotnt.pojo.ClassOrder;
import com.milotnt.service.ClassOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author MiloTnT [milotntspace@gmail.com]
 * @date 2021/8/11
 */

@Service
public class ClassOrderServiceImpl implements ClassOrderService {

    @Autowired
    private ClassOrderMapper classOrderMapper;

    @Override
    public List<ClassOrder> findAll() {
        return classOrderMapper.findAll();
    }

    @Override
    public Boolean insertClassOrder(ClassOrder classOrder) {
        return classOrderMapper.insertClassOrder(classOrder);
    }

    @Override
    public List<ClassOrder> selectClassOrderByMemberAccount(Integer memberAccount) {
        return classOrderMapper.selectClassOrderByMemberAccount(memberAccount);
    }

    @Override
    public Boolean deleteByClassOrderId(Integer classOrderId) {
        return classOrderMapper.deleteByClassOrderId(classOrderId);
    }

    @Override
    public ClassOrder selectMemberByClassIdAndMemberAccount(Integer classId, Integer memberAccount) {
        return classOrderMapper.selectMemberByClassIdAndMemberAccount(classId, memberAccount);
    }

    @Override
    public List<ClassOrder> selectMemberOrderList(Integer classId) {
        return classOrderMapper.selectMemberOrderList(classId);
    }
}
