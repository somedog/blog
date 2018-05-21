package com.blog.app.po;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author xiaohuyao
 * @since 2018-05-21
 */
public class Websiteinfo extends Model<Websiteinfo> {

    private static final long serialVersionUID = 1L;

	private Integer id;
	@TableField("art_mo_record")
	private Integer artMoRecord;
	private Integer days;
	private Integer total;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getArtMoRecord() {
		return artMoRecord;
	}

	public void setArtMoRecord(Integer artMoRecord) {
		this.artMoRecord = artMoRecord;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Websiteinfo{" +
			"id=" + id +
			", artMoRecord=" + artMoRecord +
			", days=" + days +
			", total=" + total +
			"}";
	}
}
