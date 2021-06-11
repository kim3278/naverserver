package spring_mybatis;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("dao")
public interface EmpDAO {
	public EmpVO getOneEmp(int employee_id);	//<select id="getOneEmp"
	public  List<EmpVO> getAllEmp();	//select id="getAllEmp"
	public List<EmpVO> getPagingEmp(int page[]); //<mapper namespace "xxx.EmpDAO"
	public EmpVO checkEmp(EmpVO vo); //사번 이메일 중복 검사
	public String checkJob(EmpVO vo); //직종 검사
	public void insertEmp(EmpVO vo); //insert
	public void updateEmp(EmpVO vo); //update
//	public void insertEmp(EmpVO vo);
//	public void updateEmp(EmpVO vo);
//	public void deleteEmp(int employee_id);

//	public void insertEmp2(EmpVO vo);
//	public List<EmpVO> getEmpDept(List<Integer> deptList);
//	public void updateEmpMap(Map<String, String> map);
}






