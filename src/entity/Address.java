package entity;

import java.util.Date;

/**
 * �û���ַ��
 * @author 25112
 *
 */
public class Address {
	/**
	 * id
	 */
	private Integer id;
	
	/**
	 * �ʱ�
	 */
	private String postCode;
	/**
	 * ��ϵ��
	 */
	private String contact;
	/**
	 * ��ַ
	 */
	private String addressDesc;
	/**
	 * ��ϵ�绰
	 */
	private String tel;
	/**
	 * ������
	 */
	private Integer createdBy;
	/**
	 * ����ʱ��
	 */
	private Date creationDate;
	/**
	 * ������
	 */
	private Integer modifyBy;
	/**
	 * ����ʱ��
	 */
	private Date modifyDate;
	/**
	 * �û�ID
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
