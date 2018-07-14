package jun.study.hrm.domain;

import lombok.Data;

import javax.persistence.Table;

@Data
@Table(name = "job_inf")
public class Job implements java.io.Serializable{

	private Integer id;			// id
	private String name;		// 职位名称
	private String remark;		// 详细描述
	// 无参数构造器
	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Job [id=" + id + ", name=" + name + ", remark=" + remark + "]";
	}

}