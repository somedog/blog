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
@TableName("article_comment")
public class ArticleComment extends Model<ArticleComment> {

    private static final long serialVersionUID = 1L;

	private Integer id;
	@TableField("user_id")
	private Integer userId;
	@TableField("article_id")
	private Integer articleId;
	private String content;
	private String publishdate;
	@TableField("receiver_id")
	private Integer receiverId;
	@TableField("usered_id")
	private Integer useredId;
	private String deletedate;
	private String isdelete;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getArticleId() {
		return articleId;
	}

	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPublishdate() {
		return publishdate;
	}

	public void setPublishdate(String publishdate) {
		this.publishdate = publishdate;
	}

	public Integer getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(Integer receiverId) {
		this.receiverId = receiverId;
	}

	public Integer getUseredId() {
		return useredId;
	}

	public void setUseredId(Integer useredId) {
		this.useredId = useredId;
	}

	public String getDeletedate() {
		return deletedate;
	}

	public void setDeletedate(String deletedate) {
		this.deletedate = deletedate;
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
		return "ArticleComment{" +
			"id=" + id +
			", userId=" + userId +
			", articleId=" + articleId +
			", content=" + content +
			", publishdate=" + publishdate +
			", receiverId=" + receiverId +
			", useredId=" + useredId +
			", deletedate=" + deletedate +
			", isdelete=" + isdelete +
			"}";
	}
}
