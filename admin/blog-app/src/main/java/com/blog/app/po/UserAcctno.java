package com.blog.app.po;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
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
@TableName("user_acctno")
public class UserAcctno extends Model<UserAcctno> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private String password;
	private String acctno;
	private String lastdate;
	private String lasttime;
	private String isactive;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAcctno() {
		return acctno;
	}

	public void setAcctno(String acctno) {
		this.acctno = acctno;
	}

	public String getLastdate() {
		return lastdate;
	}

	public void setLastdate(String lastdate) {
		this.lastdate = lastdate;
	}

	public String getLasttime() {
		return lasttime;
	}

	public void setLasttime(String lasttime) {
		this.lasttime = lasttime;
	}

	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "UserAcctno{" +
			"id=" + id +
			", password=" + password +
			", acctno=" + acctno +
			", lastdate=" + lastdate +
			", lasttime=" + lasttime +
			", isactive=" + isactive +
			"}";
	}
}
