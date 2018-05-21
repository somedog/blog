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
@TableName("article_category")
public class ArticleCategory extends Model<ArticleCategory> {

    private static final long serialVersionUID = 1L;

	private Integer id;
	private String category;
	private String description;
	@TableField("article_name")
	private String articleName;
	@TableField("article_sign")
	private String articleSign;
	@TableField("article_author")
	private Integer articleAuthor;
	private String newdate;
	private String modifydate;
	private String deletedate;
	@TableField("delete_user")
	private Integer deleteUser;
	private String isdelete;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public String getArticleSign() {
		return articleSign;
	}

	public void setArticleSign(String articleSign) {
		this.articleSign = articleSign;
	}

	public Integer getArticleAuthor() {
		return articleAuthor;
	}

	public void setArticleAuthor(Integer articleAuthor) {
		this.articleAuthor = articleAuthor;
	}

	public String getNewdate() {
		return newdate;
	}

	public void setNewdate(String newdate) {
		this.newdate = newdate;
	}

	public String getModifydate() {
		return modifydate;
	}

	public void setModifydate(String modifydate) {
		this.modifydate = modifydate;
	}

	public String getDeletedate() {
		return deletedate;
	}

	public void setDeletedate(String deletedate) {
		this.deletedate = deletedate;
	}

	public Integer getDeleteUser() {
		return deleteUser;
	}

	public void setDeleteUser(Integer deleteUser) {
		this.deleteUser = deleteUser;
	}

	public String getIsdelete() {
		return isdelete;
	}

	public void setIsdelete(String isdelete) {
		this.isdelete = isdelete;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "ArticleCategory{" +
			"id=" + id +
			", category=" + category +
			", description=" + description +
			", articleName=" + articleName +
			", articleSign=" + articleSign +
			", articleAuthor=" + articleAuthor +
			", newdate=" + newdate +
			", modifydate=" + modifydate +
			", deletedate=" + deletedate +
			", deleteUser=" + deleteUser +
			", isdelete=" + isdelete +
			"}";
	}
}
