package entity;

import java.util.Date;

/**
 * 
 * @author 25112
 *
 */
public class Bill {
	
	private String providerName;
	/**
	 * ����Id
	 */
	private Integer id;
	/**
	 * ��������
	 */
	private String billCode;
	/**
	 * ��Ʒ����
	 */
	private String productName;
	/**
	 * ��Ʒ����
	 */
	private String productDesc;
	/**
	 * ��Ʒ��λ
	 */
	private String productUnit;
	/**
	 * ��Ʒ����
	 */
	private double productCount;
	/**
	 * ��Ʒ�ܶ�
	 */
	private double totalPrice;
	/**
	 * �Ƿ�֧��
	 */
	private int isPayment;
	/**
	 * ��Ӧ��Id
	 */
	private Integer providerId;
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
	
	
	private Provider provider;

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBillCode() {
		return billCode;
	}

	public void setBillCode(String billCode) {
		this.billCode = billCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getProductUnit() {
		return productUnit;
	}

	public void setProductUnit(String productUnit) {
		this.productUnit = productUnit;
	}

	public double getProductCount() {
		return productCount;
	}

	public void setProductCount(double productCount) {
		this.productCount = productCount;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getIsPayment() {
		return isPayment;
	}

	public void setIsPayment(int isPayment) {
		this.isPayment = isPayment;
	}

	public Integer getProviderId() {
		return providerId;
	}

	public void setProviderId(Integer providerId) {
		this.providerId = providerId;
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
