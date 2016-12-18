package org.yex01.dao;
//...372p.

import java.util.List;

import org.yex01.domain.Criteria;
import org.yex01.domain.ReplyVO;

public interface IF_ReplyDAO {
	
	public List<ReplyVO> selectReplies(Integer bno) throws Exception;

	public void insertReply(ReplyVO vo) throws Exception;

	public void updateReply(ReplyVO vo) throws Exception;

	public void deleteReply(Integer rno) throws Exception;

	//...389p.REST방식의 경우 전통적인 Model객체에 데이터를 담지 않고
	//...객체를 처리할 수 있기 때문에, 메서드의 파라미터 처리가 조금
	//...달라지긴 해도 간단하게 처리할 수 있음.

	//...390p.기존 페이징 처리에 사용하는 Criteria를 그대로 활용하고, 추가로
	//...게시물 번호에 맞는 데이터를 검색하기 위해 'bno'를 추가함.
	public List<ReplyVO> selectPageReplies(Integer bno, Criteria cri) throws Exception;

	//...390p.페이징 처리를 하기 위해서는 반드시 해당 게시물의 댓글 수가 필요함.
	public int countReplies(Integer bno) throws Exception;

	
}
