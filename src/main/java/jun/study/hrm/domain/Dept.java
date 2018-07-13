package jun.study.hrm.domain;

import lombok.Data;

@Data
public class Dept implements java.io.Serializable{

	private Integer id;		// id
	private String name;	// 部门名称
	private String remark;	// 详细描述
	// 无参数构造器
	public Dept() {
		super();
	}
	// setter和getter方法
	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + ", remark=" + remark + "]";
	}

}