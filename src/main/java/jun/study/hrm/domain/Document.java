package jun.study.hrm.domain;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Table;

@Data
@Table(name = "document_inf")
public class Document implements java.io.Serializable{

	private int id;					// 编号
	private String title;			// 标题
	private String fileName;		// 文件名
	private MultipartFile file;		// 文件
	private String remark;			// 描述
	private java.util.Date createDate;	// 上传时间
	private User user;				// 上传人
	// 无参数构造器
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Document [id=" + id + ", title=" + title + ", fileName="
				+ fileName + ", file=" + file + ", remark=" + remark
				+ ", createDate=" + createDate + ", user=" + user + "]";
	}
	
	

}