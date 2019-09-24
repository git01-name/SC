package entity;

import java.util.Date;
import java.util.List;

/**
 * �û���
 * @author 25112
 *
 */
public class User {
	/**
	 * id
	 */
	private Integer id;
	/**
	 * �û�����
	 */
	private String userCode;
	/**
	 * �û�����
	 */
	private String userName;
	/**
	 * �û�����
	 */
	private String userPassword;
	/**
	 * �Ա�
	 */
	private Integer gender;
	/**
	 * ��������
	 */
	private Date birthday;
	/**
	 * �绰
	 */
	private String phone;
	/**
	 * ��ַ
	 */
	private String address;
	/**
	 * �û���ɫ
	 */
	private Integer userRole;
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
	 * ��ɫ
	 */
	private Role role;
	
	/**
	 * ����
	 */
	private Integer age;
	
	/**
	 * �û���ַ�б�
	 */
	private List<Address> addressList;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List<Address> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getUserRole() {
		return userRole;
	}

	public void setUserRole(Integer userRole) {
		this.userRole = userRole;
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
}
