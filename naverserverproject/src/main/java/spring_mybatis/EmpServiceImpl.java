package spring_mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service")
public class EmpServiceImpl implements EmpService {
	@Autowired
	EmpDAO dao;

	@Override
	public EmpVO getOneEmp(int employee_id) {
		return dao.getOneEmp(employee_id);
	}

	@Override
	public List<EmpVO> getAllEmp() {
		return dao.getAllEmp();
	}

//	@Override
//	public void insertEmp(EmpVO vo) {
//		dao.insertEmp(vo);
//		
//	}
//
//	@Override
//	public void updateEmp(EmpVO vo) {
//		dao.updateEmp(vo);
//		
//	}
//
//	@Override
//	public void deleteEmp(int employee_id) {
//		dao.deleteEmp(employee_id);
//		
//	}
//
	@Override
	public List<EmpVO> getPagingEmp(int page[]) {
		return dao.getPagingEmp(page);
	}

	@Override
	public void registerEmp(EmpVO vo) {
		//사번 중복 검사 or 이메일 중복 검사
		//job_id: jobs테이블 조회 존재 여부 - 결과 존재하면 직종 등록 가능
		//last_name: null인지 여부
		//insert
		System.out.println("성=" +vo.getLast_name());
		if(vo.getLast_name() != null) {
			EmpVO vo2 = dao.checkEmp(vo);
			String job_id = dao.checkJob(vo);
			System.out.println("vo2="+vo2+", job_id="+job_id);
			if(vo2 == null && job_id != null) { //중복된게 없으면
				dao.insertEmp(vo);
			}
		}
	}

	@Override
	public void updateEmp(EmpVO vo) {
		System.out.println("성=" +vo.getLast_name());
		System.out.println("이름="+vo.getFirst_name());
		if(vo.getLast_name() != null) {
			EmpVO vo2 = dao.checkEmp(vo);
			String job_id = dao.checkJob(vo);
			System.out.println("vo2="+vo2+", job_id="+job_id);
			if(job_id != null) { //중복된게 없으면
				dao.updateEmp(vo);
			}
		}
	}
	
	
//
//	@Override
//	public void insertEmp2(EmpVO vo) {
//		dao.insertEmp2(vo);
//		
//	}
//
//	@Override
//	public List<EmpVO> getEmpDept(List<Integer> deptList) {
//		return dao.getEmpDept(deptList);
//	}
//
//	@Override
//	public void updateEmpMap(Map<String, String> map) {
//		dao.updateEmpMap(map);
//		
//	}
//	

	
	
	
}
