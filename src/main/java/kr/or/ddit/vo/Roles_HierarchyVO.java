package kr.or.ddit.vo;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Roles_HierarchyVO implements Serializable{
	
	private String parent_role;
	private String child_role;
	
}
