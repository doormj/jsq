package co.yedam.project5.member.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.yedam.project5.common.DataSource;
import co.yedam.project5.member.map.MemberMapper;
import co.yedam.project5.member.service.MemberService;
import co.yedam.project5.member.service.MemberVO;

public class MemberServiceImpl implements MemberService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private MemberMapper map = sqlSession.getMapper(MemberMapper.class);
	@Override
	public List<MemberVO> memberSelectList() {
		return map.memberSelectList();
	}
	@Override
	public MemberVO memberSelect(MemberVO vo) {
		return map.memberSelect(vo);
	}
	@Override
	public int memberInsert(MemberVO vo) {
		return map.memberInsert(vo);
	}
	@Override
	public int memberUpdate(MemberVO vo) {
		return map.memberUpdate(vo);
	}
	@Override
	public int memberDelete(MemberVO vo) {
		return map.memberDaelete(vo);
	}

}
