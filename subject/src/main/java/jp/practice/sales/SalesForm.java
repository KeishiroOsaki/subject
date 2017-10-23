package jp.practice.sales;


import javax.validation.constraints.Pattern;

public class SalesForm {

	/** 商品名 */
    private String name;
    /** 個数 */
    @Pattern(regexp = "^\\d+$", message = "点数には1以上の数字を入力してください")
    private int quantity;


	/** 削除対象行 */
	private String delRow;


	public SalesForm() {


	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity セットする quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	/**
	 * @return delRow
	 */
	public String getDelRow() {
		return delRow;
	}

	/**
	 * @param delRow セットする delRow
	 */
	public void setDelRow(String delRow) {
		this.delRow = delRow;
	}

}
