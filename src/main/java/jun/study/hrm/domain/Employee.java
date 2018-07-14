package jun.study.hrm.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Table;

@Data
@Table(name = "employee_inf")
public class Employee implements java.io.Serializable{

	private Integer id;			// id
	private Dept dept;			// 部门
	private Job job;			// 职位
	private String name;		// 名称
	private String cardId;		// 身份证
	private String address;		// 地址
	private String postCode;	// 邮政编码
	private String tel;			// 电话
	private String phone;		// 手机
	private String qqNum;		// qq
	private String email;		// 邮箱
	private Integer sex;		// 性别
	private String party;		// 政治面貌
	/**
	 *  使用@ModelAttribute接收参数时
	 *  form表单中有日期,Spring不知道该如何转换,
	 *  要在实体类的日期属性上加@DateTimeFormat(pattern="yyyy-MM-dd")注解 
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private java.util.Date birthday;	//生日
	private String race;				// 名族
	private String education;			// 学历
	private String speciality;			// 专业
	private String hobby;				// 爱好
	private String remark;				// 备注
	private java.util.Date createDate;	// 建档日期
	// 无参数构造器
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", dept=" + dept + ", job=" + job
				+ ", name=" + name + ", cardId=" + cardId + ", address="
				+ address + ", postCode=" + postCode + ", tel=" + tel
				+ ", phone=" + phone + ", qqNum=" + qqNum + ", email=" + email
				+ ", sex=" + sex + ", party=" + party + ", birthday="
				+ birthday + ", race=" + race + ", education=" + education
				+ ", speciality=" + speciality + 
				", hobby=" + hobby + ", remark=" + remark + ", createDate="
				+ createDate + "]";
	}

}