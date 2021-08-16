package com.milotnt.controller;

import com.milotnt.pojo.Member;
import com.milotnt.service.AdminService;
import com.milotnt.service.EmployeeService;
import com.milotnt.service.EquipmentService;
import com.milotnt.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * @author ZhangMing [1157038410@qq.com]
 * @date 2021/8/16
 */

@Controller
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;
    @Autowired
    private AdminService adminService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private EquipmentService equipmentService;

    //查询会员
    @RequestMapping("/selMember")
    public String selectMember(Model model) {
        List<Member> memberList = memberService.findAll();
        model.addAttribute("memberList", memberList);
        return "selectMember";
    }

    //跳转新增会员页面
    @RequestMapping("/toAddMember")
    public String toAddMember() {
        return "addMember";
    }

    //新增会员
    @RequestMapping("/addMember")
    public String addMember(Member member) {
        //会员账号&卡号随机生成
        Random random = new Random();
        String account1 = "2021";
        for (int i = 0; i < 5; i++) {
            account1 += random.nextInt(10);
        }
        Integer account = Integer.parseInt(account1);

        //初始密码
        String password = "123456";

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateNowStr = simpleDateFormat.format(date);

        Integer nextClass = member.getCardClass();

        member.setMemberAccount(account);
        member.setCardId(account);
        member.setMemberPassword(password);
        member.setCardTime(dateNowStr);
        member.setCardNextClass(nextClass);

        Boolean flagAdd = memberService.insertMember(member);
        if (flagAdd == true) {
            System.out.println("新增会员成功！");
        } else if (flagAdd == false) {
            System.out.println("新增会员失败！");
        }

        return "redirect:selMember";

    }

    //删除会员
    @RequestMapping("/delMember")
    public String deleteMember(Integer memberId) {
        memberService.deleteByMemberId(memberId);
        return "redirect:selMember";
    }

    //跳转会员修改页面
    @RequestMapping("/toUpdateMember")
    public String toUpdateMember(Integer memberAccount, Model model) {
        List<Member> memberList = memberService.selectByMemberAccount(memberAccount);
        model.addAttribute("memberList", memberList);
        return "updateMember";
    }

    //修改会员信息
    @RequestMapping("/updateMember")
    public String updateMember(Member member) {
        memberService.updateMemberByMemberAccount(member);
        return "redirect:selMember";
    }


    //跳转会员卡查询页面
    @RequestMapping("/toSelByCard")
    public String toSelectByCardId() {
        return "selectByCardId";
    }

    //根据会员卡号查询
    @RequestMapping("/selByCard")
    public String selectByCardId(Model model, Integer memberAccount) {
        List<Member> memberList = memberService.selectByMemberAccount(memberAccount);
        if (memberList != null) {
            model.addAttribute("memberList", memberList);
        } else {
            String message = "会员卡号不存在！";
            model.addAttribute("noMessage", message);
        }
        return "selectByCardId";
    }

    //用户登录判断
    //管理员登录
    //回到主页

}
