package entity;

import java.util.Date;

/**
 * 用户地址类
 * @author 25112
 *
 */
public class Address {
	/**
	 * id
	 */
	private Integer id;
	
	/**
	 * 邮编
	 */
	private String postCode;
	/**
	 * 联系人
	 */
	private String contact;
	/**
	 * 地址
	 */
	private String addressDesc;
	/**
	 * 联系电话
	 */
	private String tel;
	/**
	 * 创建者
	 */
	private Integer createdBy;
	/**
	 * 创建时间
	 */
	private Date creationDate;
	/**
	 * 更新者
	 */
	private Integer modifyBy;
	/**
	 * 更新时间
	 */
	private Date modifyDate;
	/**
	 * 用户ID
	 */
	private Integer userId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String content) {
		this.contact = content;
	}

	public String getAddressDesc() {
		return addressDesc;
	}

	public void setAddressDesc(String addressDesc) {
		this.addressDesc = addressDesc;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Integer getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
}	
