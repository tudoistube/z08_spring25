package org.yex01.service;
//...376p.
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.yex01.dao.IF_ReplyDAO;
import org.yex01.domain.Criteria;
import org.yex01.domain.ReplyVO;

@Service
public class ReplyServiceImpl implements IF_ReplyService {

	@Inject
	private IF_ReplyDAO dao;


	@Override
	public List<ReplyVO> selectReplies(Integer bno) throws Exception {
		return dao.selectReplies(bno);
	}

	@Override
	public void insertReply(ReplyVO vo) throws Exception {
		dao.insertReply(vo);
	}

	@Override
	public void updateReply(ReplyVO vo) throws Exception {
		dao.updateReply(vo);
	}

	@Override
	public void deleteReply(Integer rno) throws Exception {
		dao.deleteReply(rno);
	}

	//...392p.
	@Override
	public List<ReplyVO> selectPageReplies(Integer bno, Criteria cri) throws Exception {
		return dao.selectPageReplies(bno, cri);
	}

	@Override
	public int countReplies(Integer bno) throws Exception {
		return dao.countReplies(bno);
	}

}
