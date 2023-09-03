package co.yedam.project5.member.map;

import java.util.List;

import co.yedam.project5.member.service.MemberVO;

public interface MemberMapper {
	List<MemberVO> memberSelectList();
	MemberVO memberSelect(MemberVO vo);
	int memberInsert(MemberVO vo);
	int memberUpdate(MemberVO vo);
	int memberDaelete(MemberVO vo);
}
