package com.mycompany.jointest.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.jointest.member.dao.MemberDao;
import com.mycompany.jointest.member.vo.Member;


@Service("memberService")
public class MemberServiceImpl implements MemberService{
   @Autowired
   private MemberDao memberDao;
   
   @Override
   public int signUp(Member vo) {
      int result=0;
      try {
         result = memberDao.signUp(vo);
         System.out.println(result);
      } catch (Exception e) {
         e.printStackTrace();
      }
      return result;
      
   }
}
