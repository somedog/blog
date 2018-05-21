package com.blog.app.po;

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
public class Article extends Model<Article> {

    private static final long serialVersionUID = 1L;

	private Integer id;
	private String content;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Article{" +
			"id=" + id +
			", content=" + content +
			"}";
	}
}
