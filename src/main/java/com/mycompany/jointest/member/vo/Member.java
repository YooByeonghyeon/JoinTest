package com.mycompany.jointest.member.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class Member {
	private String memberid;
	private String memberpwd;
	private String membernm;
	private Date memberenrolldt;
	
	public Member() {}
	
	public Member(String memberid, String memberpwd, String membernm, Date memberenrolldt) {
		super();
		this.memberid = memberid;
		this.memberpwd = memberpwd;
		this.membernm = membernm;
		this.memberenrolldt = memberenrolldt;
	}
	@Override
	public String toString() {
		return "Member [memberid=" + memberid + ", memberpwd=" + memberpwd + ", membernm=" + membernm
				+ ", memberenrolldt=" + memberenrolldt + "]";
	}
	public String getMemberid() {
		return memberid;
	}
	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}
	public String getMemberpwd() {
		return memberpwd;
	}
	public void setMemberpwd(String memberpwd) {
		this.memberpwd = memberpwd;
	}
	public String getMembernm() {
		return membernm;
	}
	public void setMembernm(String membernm) {
		this.membernm = membernm;
	}
	public Date getMemberenrolldt() {
		return memberenrolldt;
	}
	public void setMemberenrolldt(Date memberenrolldt) {
		this.memberenrolldt = memberenrolldt;
	}
	
}
