package com.mycompany.jointest.member.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.jointest.member.vo.Member;
@Repository
public class MemberDao {
	 @Autowired
	 private SqlSession sqlSession;
	
	 public int signUp(Member vo) {
	     return sqlSession.insert("Member.signUp", vo);
	  }
}
