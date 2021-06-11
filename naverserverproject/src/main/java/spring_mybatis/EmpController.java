package spring_mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpController {
	@Autowired
	EmpService service;
	
	//employees  테이블 전체 조회
	@RequestMapping("/emplist")
	public ModelAndView  getEmpList(){
		//mybatis SqlSession--EmpDAO--EmpService하위-
		List<EmpVO> list = service.getAllEmp(); //메서드 수정
		ModelAndView mv = new ModelAndView();
		mv.addObject("emplist", list);
		mv.setViewName("/mybatis/emplist");//WEB-INF/views/mybatis/emplist.jsp
		return mv;
		
	}
	
	//page 변수 전달값이 보여줄 페이지. 한페이지당 출력갯수 10개. 입사일이 빠른 사원부터 출력
	@RequestMapping("/emplistpage")
	public ModelAndView  getEmpList(int page){
		int rownum [] = new int[2];
		rownum[0]=(page-1)*10 + 1;
		rownum[1] = (page)*10;
		List<EmpVO> list = service.getPagingEmp(rownum);
		ModelAndView mv = new ModelAndView();
		mv.addObject("emplist", list);
		//request.getAttirbute("emplist")  ${emplist}
		mv.setViewName("/mybatis/emplist");//WEB-INF/views/mybatis/emplist.jsp
		return mv;
		
	}
	
	//클라이언트 입력 id 파라미터 
	//  /empdetail url 
	@RequestMapping("/empdetail")
	public ModelAndView getOneEmp(int id) {
		EmpVO vo = service.getOneEmp(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("detail", vo);
		mv.setViewName("/mybatis/empdetail");
		return mv;
		
	}
	
	
	//추가 - 폼 출력 / 사원정보 입력 - db insert - emplist 뷰 보여줌
	//employeed_id, email - 중복x 
	//last_name - not null
	//job_id, department_id, manager_id - foreign key
	
	@RequestMapping(value="/empadd", method=RequestMethod.GET)
	public String addEmp() {
		return "/mybatis/addform";
	}
	
	@RequestMapping(value="/empadd", method=RequestMethod.POST)
	public String addEmp2(EmpVO vo) {
		service.registerEmp(vo);
		//return "/mybatis/emplist";	//emplist.jsp이동(모델 없이)
		return "redirect:/emplist"; //emplist가 다시 조회해서 보여줌(/emplist 매핑 메소드 호출)
	}
	
	//수정
	//empadd처럼 폼 하나 보여주고, 폼 수정했을때 보여주는거 두개 보여줘야됨
	//미리 폼에 입력된 값이 설정된 상태에서 수정
	
	//수정폼
	@RequestMapping(value="/empmodify", method=RequestMethod.GET)
	public ModelAndView modifyEmp(int id) {
		EmpVO vo = service.getOneEmp(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("emp", vo);
		mv.setViewName("/mybatis/modifyform");
		return mv;
	}
	
	//수정 처리
	@RequestMapping(value="/empmodify", method=RequestMethod.POST)
	public String modifyEmp2(EmpVO vo) {
		service.updateEmp(vo);
		return "redirect:/emplist";
	}
	
	//삭제
//	@RequestMapping("/empdelete")
//	public String deleteEmp(int id) {
//		//EmpVO vo = service.삭제메소드(id);
//		return "redirect:/emplist";
//	}
//	
	
}
