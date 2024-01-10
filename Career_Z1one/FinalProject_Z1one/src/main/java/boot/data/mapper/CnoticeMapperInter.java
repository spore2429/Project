package boot.data.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import boot.data.dto.CnoticeDto;
import boot.data.dto.Company_DetailDto;
import boot.data.dto.RecruitDto;

@Mapper
public interface CnoticeMapperInter {
	// 세부분류리스트
	public List<CnoticeDto> testList(String[] industry, String[] career, String[] location, String gradeLeft,
			String gradeRight, String[] type, String[] academy, String orderBy);

	// 조회수순리스트
	public List<CnoticeDto> readCountList();

	// 디테일페이지
	public CnoticeDto getNoticeData(int cnotice_num);

	// 공고 추가
	public void insertNotice(CnoticeDto dto);

	// 공고 삭제
	public void deleteNotice(int cnotice_num);

	// 공고 수정
	public void updateNotice(CnoticeDto dto);
	
	// 공고 디테일 추가
	public void insertDetail(Company_DetailDto dto);
	
	//공고 디테일 불러오기
		public Company_DetailDto getDetailData(int cnotice_num);
		
		//맥스넘
		public int getMaxNum();
}