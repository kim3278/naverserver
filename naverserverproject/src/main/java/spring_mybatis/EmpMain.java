package spring_mybatis;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {

	public static void main(String[] args) throws IOException {
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring_mybatis/mybatis_spring.xml");
		EmpService service = factory.getBean("service", EmpService.class);
//		EmpDAO dao = new EmpDAO();
//		dao.setSession(session);
//		((EmpServiceImpl)service).setDao(dao);
	//	test1 ; 1개 vo
		EmpVO vo = service.getOneEmp(200);
		System.out.println(vo);
		//test2 : 리스트 
//		List<EmpVO> list = service.getAllEmp();
//		for(EmpVO vo : list) {
//			System.out.println(vo);
//		}
		//test3
//		EmpVO vo = new EmpVO
//		(300, "사원", "김", "kim@a.com", "010222333", "IT_PROG", 100,  30000, 50);
//		service.insertEmp(vo);
//		System.out.println("1명 사원 저장 완료");
//		EmpVO vo2 = service.getOneEmp(300);
//		System.out.println(vo2);
		
		//test4
//		// 300  사번의 사원 이름을 대리로 변경
//		EmpVO vo3 = new EmpVO();
//		vo3.setEmployee_id(300);
//		vo3.setFirst_name("대리");
//		service.updateEmp(vo3);
//		//service  추가메소드 - dao  추가메소드 - sql-mapping.xml 추가 태그
		
		//test5
//		int employee_id = 300;
//		service.deleteEmp(employee_id);
		
		//test6 : 페이징처리
//		int[] nums= {11, 20};
//		List<EmpVO> list = service.getPageEmp(nums);
//		for(EmpVO vo : list) {
//			System.out.println(vo);
//		}
		
		
		
		//test7
//		EmpVO vo = new EmpVO();
//		//vo.setEmployee_id(2000);
//		vo.setFirst_name("과장");
//		vo.setLast_name("김");//not null
//		vo.setJob_id("IT_PROG");//jobs테이블 참조
//		vo.setDepartment_id(100);//departments테이블 참조
//		vo.setEmail("kim16@kitri.com");//unique
//		vo.setPhone_number("010222222");
//		vo.setSalary(1000);
//		service.insertEmp2(vo);
//		System.out.println("===insert seq 완료===");
		
		//test8 - ArrayList
//		List<Integer> deptList = new ArrayList<Integer>();
//		deptList.add(10);
//		deptList.add(50);
//		deptList.add(80);
//		deptList.add(100);
//		List<EmpVO> list = service.getEmpDept(deptList);
//		for(EmpVO vo : list) {
//			System.out.println(
//					vo.getEmployee_id()+":"
//			        +vo.getFirst_name()+":"
//					+vo.getDepartment_id());
//		}
//		//test9 _ HashMap
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("dept", "50");
//		map.put("email", "a3@b.com");
//		//map.put("id", "16");
//		
//		service.updateEmpMap(map);
//		System.out.println("업데이트 수행 완료");
//		
}
}




//test12 : 리스트 파라미터
//ArrayList<Integer> deptlist = 
//		new ArrayList<Integer>();
//deptlist.add(100);
//deptlist.add(200);	
//deptlist.add(10);	

//test13: map 파라미터 
//리스트나 배열 : {10, 20, 30}--> get(0)->10
//맵 : {"dept","인사부"}, {"이메일","kiti.com"}--> get("dept")
/*	HashMap<String, String> map = 
		new HashMap<String, String>();
		map.put("deptid", "50");
		//map.put("emp_id", "303");
		map.put("email", "lee@a.com");
service.updateEmpWithMap(map);	
System.out.println("===update완료===");*/
