package jp.practice.sales;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class SalesForm {

	/** 商品名 */
    private String name;

    /** 個数 */
    @NotNull
    //@Pattern(regexp = "^\\d+$", message = "点数には1以上の数字を入力してください")
    @Min(1)
    private Integer quantity;


	/** 削除対象行 */
    @NotNull
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
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity セットする quantity
	 */
	public void setQuantity(Integer quantity) {
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
