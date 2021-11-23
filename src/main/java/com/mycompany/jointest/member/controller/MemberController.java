package com.mycompany.jointest.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mycompany.jointest.member.service.MemberService;
import com.mycompany.jointest.member.vo.Member;

@Controller
public class MemberController {
   @Autowired
   private MemberService memberService;
   
   @RequestMapping(value = "index", method = RequestMethod.GET)
   public ModelAndView memberInsert(ModelAndView mv) {
      mv.setViewName("index");
      return mv;
   }

   
   @RequestMapping(value = "signUp", method=RequestMethod.POST)
   public ModelAndView memberInsert(Member vo, @RequestParam("memberId") String id,@RequestParam("memberPwd") String pwd,@RequestParam("memberName") String name,
         HttpServletRequest request,HttpServletResponse response, RedirectAttributes rttr, ModelAndView mv) {
      int result=0;
      
      try {
         
         System.out.println(result);
         
         vo.setMemberid(id);
         vo.setMemberpwd(pwd);
         vo.setMembernm(name);
         result = memberService.signUp(vo);
         System.out.println(result);
         if(result==1) {
            String msg = "회원가입이 완료되었습니다.";
            rttr.addFlashAttribute("msg", msg);
            mv.setViewName("redirect:/index");
         }else {
            String msg = "회원가입에 실패했습니다.";
            rttr.addFlashAttribute("msg", msg);
            mv.setViewName("redirect:/index");
         }
         
      } catch (Exception e) {
         e.printStackTrace();
      }
      
      return mv;
   }

}