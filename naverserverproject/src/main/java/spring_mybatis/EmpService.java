package spring_mybatis;

import java.util.List;
import java.util.Map;

public interface EmpService {
	public EmpVO getOneEmp(int employee_id) ;
	public List<EmpVO> getAllEmp();
	public List<EmpVO> getPagingEmp(int page[]);
	public void registerEmp(EmpVO vo);
	public void updateEmp(EmpVO vo);


//	public void insertEmp(EmpVO vo);
//	public void updateEmp(EmpVO vo);
//	public void deleteEmp(int employee_id);
//	public void insertEmp2(EmpVO vo);
//	public List<EmpVO> getEmpDept(List<Integer> deptList);
//	public void updateEmpMap(Map<String, String> map);
	
}
