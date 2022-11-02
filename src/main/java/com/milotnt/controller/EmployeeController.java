package com.milotnt.controller;

import com.milotnt.pojo.Employee;
import com.milotnt.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * @author MiloTnT [milotntspace@gmail.com]
 * @date 2021/8/18
 */

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    //查询员工
    @RequestMapping("/selEmployee")
    public String selectEmployee(Model model) {
        List<Employee> employeeList = employeeService.findAll();
        model.addAttribute("employeeList", employeeList);
        return "selectEmployee";
    }

    //跳转新增员工页面
    @RequestMapping("/toAddEmployee")
    public String toAddEmployee() {
        return "addEmployee";
    }

    //新增员工
    @RequestMapping("/addEmployee")
    public String addEmployee(Employee employee) {
        //工号随机生成
        Random random = new Random();
        String account1 = "1010";
        for (int i = 0; i < 5; i++) {
            account1 += random.nextInt(10);
        }
        Integer account = Integer.parseInt(account1);

        //获取当前日期
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String nowDay = simpleDateFormat.format(date);

        employee.setEmployeeAccount(account);
        employee.setEntryTime(nowDay);

        employeeService.insertEmployee(employee);

        return "redirect:selEmployee";

    }

    //删除员工
    @RequestMapping("/delEmployee")
    public String deleteEmployee(Integer employeeAccount) {
        employeeService.deleteByEmployeeAccount(employeeAccount);
        return "redirect:selEmployee";
    }

    //跳转员工修改页面
    @RequestMapping("/toUpdateEmployee")
    public String toUpdateEmployee(Integer employeeAccount, Model model) {
        List<Employee> employeeList = employeeService.selectByEmployeeAccount(employeeAccount);
        model.addAttribute("employeeList", employeeList);
        return "updateEmployee";
    }

    //修改员工信息
    @RequestMapping("/updateEmployee")
    public String updateEmployee(Employee employee) {
        employeeService.updateMemberByEmployeeAccount(employee);
        return "redirect:selEmployee";
    }

}
