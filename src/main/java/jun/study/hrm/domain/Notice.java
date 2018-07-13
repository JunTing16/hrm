package jun.study.hrm.domain;

import lombok.Data;

@Data
public class Notice implements java.io.Serializable{

	private Integer id;		// 编号
	private String title;   // 标题
	private String content; // 内容
	private java.util.Date createDate;  // 发布日期
	private User user;		// 发布人
	// 无参数构造器
	public Notice() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Notice [id=" + id + ", title=" + title + ", content=" + content
				+ ", createDate=" + createDate + ", user=" + user + "]";
	}
	
	

}