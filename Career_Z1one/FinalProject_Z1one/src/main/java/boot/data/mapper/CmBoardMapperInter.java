package boot.data.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import boot.data.dto.User_BoardDto;

@Mapper
public interface CmBoardMapperInter {

	public void insertCmBoard(User_BoardDto dto);
	public List<User_BoardDto> getBoards(HashMap<String, Integer> map); 
	public int getTotalCount(String board_category);  //게시글 전체 수 (페이징과 연관)
	public int getMaxNum(); //내가 쓴 글을 getMaxNum으로 최대값을 올리면 바로 쓰자마자 보여준다.
	public User_BoardDto getData(String board_num); //게시판 글쓰기 후 내가 쓴 글 보이게 하기 위함. + 게시판 수정 위한 num값 받아오기
	public void updateReadCount(String board_num); 
	public String getEmail(String user_num);  //content의 작성자를 회원가입 email로 넣기
	public void updateLikes(String board_num); //content에서 좋아요 버튼 클릭시 board_like 숫자 +1 증가
	public void updateunLikes(String board_num); //content에서 좋아요 버튼 2번 클릭하면 board_like 숫자 -1 감소 
	public List<User_BoardDto> getBoardsByCategory(Map<String, Object> map);//해당 카테고리에 해당하는 전체 게시글 출력
	public void upadateBoard(User_BoardDto dto); //게시판 수정
	public void deleteBoard(String board_num);     //게시판 삭제
}
