package kr.or.ddit.elecAuthorization.controller.approval;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// clone 수정
@Controller
public class ApprovalCreateController {
	@RequestMapping("/elecAuthorization/approval/approInsert")
	public String getBuyerForm(){
		return "elec/approval/approForm";
	}
}
