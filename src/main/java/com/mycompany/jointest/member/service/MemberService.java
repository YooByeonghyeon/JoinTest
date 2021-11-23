package com.mycompany.jointest.member.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mycompany.jointest.member.vo.Member;

public interface MemberService {
	public int signUp(Member vo) throws Exception;
}
