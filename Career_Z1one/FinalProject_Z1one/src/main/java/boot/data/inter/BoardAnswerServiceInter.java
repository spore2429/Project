package boot.data.inter;

import java.util.List;

import boot.data.dto.Board_ContentDto;

public interface BoardAnswerServiceInter {

	public int getMaxNum();
	public int getTotalCount();
	public void insertBanswer(Board_ContentDto dto);
	public List<Board_ContentDto> getAllBAnswer(String board_num);
	public Board_ContentDto getAnswer(String content_num); //댓글수정num
	public void updateBanswer(int idx,String content); //댓글 수정
	public void deleteAnswer(String content_num); //댓글 삭제
	
	public Board_ContentDto getAnswerCount(String board_num); //게시판list 댓글 수 나타내기 위한 사전 조건
}
