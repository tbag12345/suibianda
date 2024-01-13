package com.yami.trading.bean.purchasing.dto;

/**
 * 兑换交易记录
 *
 */
public class ExchangeRecord {

	/**
	 * 
	 */
	private String symbol;
	private String pid ;
	/**
	 * 
	 */
	private String symbol_to;
	
	/**
	 * 金额
	 */
	private Double amount;
	
	/**
	 * 金额
	 */
	private Double amount_to;
	
	/**
	 * 创建时间
	 */
	private String create_time;

	/**
	 * 状态。submitted 已提交，canceled 已撤销， created 委托完成
	 */
	private String state = "submitted";
	
	/**
	 * 成交价格
	 */
	private Double closePrice;
	
	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getSymbol_to() {
		return symbol_to;
	}

	public void setSymbol_to(String symbol_to) {
		this.symbol_to = symbol_to;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getAmount_to() {
		return amount_to;
	}

	public void setAmount_to(Double amount_to) {
		this.amount_to = amount_to;
	}

	
	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Double getClosePrice() {
		return closePrice;
	}

	public void setClosePrice(Double closePrice) {
		this.closePrice = closePrice;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}
}
