package boot.data.inter;


import boot.data.dto.User_ApplyDto;

public interface ApplyInter {
   //public List<User_ApplyDto> getUserApplyList();
   //public List<User_ApplyDto> getSingleDto(int apply_Num);
   public User_ApplyDto getApplyNum(int apply_Num);
}