package com.product.model;

public class Product {
	private long productId; // 상품 아이디
	private String pname; // 상품 명
	private Integer unitPrice; // 상품 가격
	private String description; // 상품 설명
	private String manufacturer; // 제조사
	private String category; // 분류
	private long unitInStock; // 재고 수
	private String condition; // 신상품, 중고, 재생 품
	private String filename; // 파일 명

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getPname() {
		return pname == null ? "" : pname.trim();
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Integer getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDescription() {
		return description == null ? "" : description.trim();
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getManufacturer() {
		return manufacturer == null ? "" : manufacturer.trim();
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getCategory() {
		return category == null ? "" : category.trim();
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public long getUnitInStock() {
		return unitInStock;
	}

	public void setUnitInStock(long unitsInStock) {
		this.unitInStock = unitsInStock;
	}

	public String getCondition() {
		return condition == null ? "" : condition.trim();
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getFilename() {
		return filename == null ? "" : filename.trim();
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

}
