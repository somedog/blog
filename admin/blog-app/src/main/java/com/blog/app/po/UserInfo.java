package com.blog.app.po;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author xiaohuyao
 * @since 2018-05-21
 */
@TableName("user_info")
public class UserInfo extends Model<UserInfo> {

    private static final long serialVersionUID = 1L;

	private Integer id;
	private String acctno;
	private String username;
	private String area;
	private String email;
	private String job;
	@TableField("git_no")
	private String gitNo;
	private String image;
    /**
     * 0-男，1-女
     */
	private String sex;
	private String description;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAcctno() {
		return acctno;
	}

	public void setAcctno(String acctno) {
		this.acctno = acctno;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getGitNo() {
		return gitNo;
	}

	public void setGitNo(String gitNo) {
		this.gitNo = gitNo;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "UserInfo{" +
			"id=" + id +
			", acctno=" + acctno +
			", username=" + username +
			", area=" + area +
			", email=" + email +
			", job=" + job +
			", gitNo=" + gitNo +
			", image=" + image +
			", sex=" + sex +
			", description=" + description +
			"}";
	}
}
