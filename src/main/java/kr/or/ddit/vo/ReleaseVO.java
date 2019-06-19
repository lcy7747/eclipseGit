package kr.or.ddit.vo;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

import kr.or.ddit.common.InsertHint;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ReleaseVO implements Serializable{
	
	private Integer rel_no;
	private String sale_ord_code;
	private String emp_id;
	@NotBlank(groups=InsertHint.class)
	private String rel_date;
	private String rel_delete;
	
}
