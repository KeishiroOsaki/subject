package jp.practice.sales;

/**
 * 売上明細1件分のデータを保持するクラス
 */
public class Item{

	/**削除フラグ */
	private boolean removeFlg;
    /** 商品id */
    private String id;
    /** 商品名 */
    private String name;
    /** 単価 */
    private int price;
    /** 個数 */
    private int quantity;
    /** 小計 */
    private int subtotal;

    /**
	 * コンストラクターです。
     * @param id 商品id
     * @param name 商品名
     * @param price 単価
     * @param quantity 個数
     * @param subtotal 小計
     */
    public Item(String id, String name, int price, int quantity, int subtotal) {
		this.removeFlg = false;
		this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.subtotal = subtotal;
    }

	/**
	 * @return removeFlg
	 */
	public boolean getRemoveFlg() {
		return removeFlg;
	}

	/**
	 * @param removeFlg セットする removeFlg
	 */
	public void setRemoveFlg(boolean removeFlg) {
		this.removeFlg = removeFlg;
	}

	/**
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(String id) {
		this.id = id;
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
	 * @return price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price セットする price
	 */
	public void setPrice(int price) {
		this.price = price;
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
	 * @return subtotal
	 */
	public int getSubtotal() {
		return subtotal;
	}

	/**
	 * @param subtotal セットする subtotal
	 */
	public void setSubtotal(int subtotal) {
		this.subtotal = subtotal;
	}

	/* (非 Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/* (非 Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Item)) {
			return false;
		}
		Item other = (Item) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

}