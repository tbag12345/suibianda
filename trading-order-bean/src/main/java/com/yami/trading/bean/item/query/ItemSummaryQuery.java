package com.yami.trading.bean.item.query;

import javax.validation.constraints.NotNull;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.yami.trading.common.dto.BaseDTO;
import com.yami.trading.common.query.Query;
import com.yami.trading.common.query.QueryType;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 简况DTO
 *
 * @author lucas
 * @version 2023-05-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ItemSummaryQuery {

    private static final long serialVersionUID = 1L;

    /**
     * 审计机构
     */
    @NotNull(message = "审计机构 不能为空")
    private String uuid;
    /**
     * 市净率
     */
    private String pbTtm;
    /**
     * 每股净资产
     */
    private String bps;
    /**
     * 股息率
     */
    private String dividendRate;
    /**
     * 净利率
     */
    private String netProfitRatio;
    /**
     * 营业额同比
     */
    private String operateIncomeQoq;
    /**
     * 占溢利同比
     */
    private String yoyProfitShare;
    /**
     * 港股市值
     */
    private String hkskMarketCap;
    /**
     * 总市值
     */
    private String skMarketCap;
    /**
     * 市盈率
     */
    private String peTtm;
    /**
     * 每股盈利
     */
    private String basicEps;
    /**
     * 每股股息
     */
    private String dpsHkd;
    /**
     * 毛利率
     */
    private String grossProfitMargin;
    /**
     * 营业额
     */
    private String operateIncome;
    /**
     * 股东应占溢利
     */
    private String shhareholdersEarnings;
    /**
     * 港股股本
     */
    private String hongKongStockCapital;
    /**
     * 总股本
     */
    private String commonAcs;
    /**
     * 代码
     */
    @Query(tableColumn = "a.symbol", javaField = "symbol", type = QueryType.EQ)
    private String symbol;
    /**
     * 证券代码
     */
    private String secucode;
    /**
     * 证券类型
     */
    private String securityType;
    /**
     * isin
     */
    private String isinCode;
    /**
     * 上市时间
     */
    private String listingDate;
    /**
     * 发行价格
     */
    private String issuePrice;
    /**
     * 板块
     */
    private String board;
    /**
     * 年结日
     */
    private String yearSettleDay;
    /**
     * 发行量
     */
    private String issuedCommonShares;
    /**
     * 每手股数
     */
    private String tradeUnit;
    /**
     * 每股面值
     */
    private String parValuePerShare;
    /**
     * 公司名称
     */
    private String orgName;
    /**
     * 英文名称
     */
    private String enName;
    /**
     * 所属行业
     */
    private String belongIndustry;
    /**
     * 港股股份
     */
    private String hongKongStockShares;
    /**
     * 注册资本
     */
    private String registeredCapital;
    /**
     * 主席
     */
    private String chairman;
    /**
     * 公司秘书
     */
    private String secretary;
    /**
     * 成立日期
     */
    private String foundDate;
    /**
     * 员工人数
     */
    private String empNum;
    /**
     * 公司业务
     */
    private String orgProfile;
    /**
     * 注册办事处
     */
    private String address;
    /**
     * 公司总部
     */
    private String companyHeadquarters;
    /**
     * 股份过户登记处
     */
    private String shareRegistrar;
    /**
     * 核数师
     */
    private String accountFirm;
    /**
     * 主要往来银行
     */
    private String mainCorrespondentBank;
    /**
     * 法律顾问
     */
    private String legalAdvisor;
    /**
     * 公司网址
     */
    private String orgWeb;
    /**
     * 电邮地址
     */
    private String orgEmail;
    /**
     * 电话号码
     */
    private String orgTel;
    /**
     * 传真号码
     */
    private String orgFax;
    /**
     * 每股收益
     */
    private String eps;
    /**
     * 每股净资产
     */
    private String navPerShare;
    /**
     * 营业总收入
     */
    private String totalOperatingRevenue;
    /**
     * 总营同比
     */
    private String yoyTotalOperatingRevenue;
    /**
     * 净利润
     */
    private String netProfit;
    /**
     * 净利润同比
     */
    private String yoyNetProfit;
    /**
     * 净资产收益率
     */
    private String roe;
    /**
     * 负债率
     */
    private String debtRatio;
    /**
     * 流通A股
     */
    private String circulatingAShares;
    /**
     * 流通A市值
     */
    private String circulatingAShareMarketCapitalization;
    /**
     * 质押比例
     */
    private String loanToValueRatio;
    /**
     * 商誉规模
     */
    private String goodwillScale;
    /**
     * 所属区域
     */
    private String region;
    /**
     * 所属概念
     */
    private String belongingConcept;
    /**
     * 法人代表
     */
    private String legalRepresentative;
    /**
     * 总经理
     */
    private String managingDirector;
    /**
     * 管理层人数
     */
    private String managementTeamSize;
    /**
     * 审计机构
     */
    private String auditOrganization;
    /**
     * 募资净额
     */
    private String netFundsRaised;
    /**
     * 发行市盈率
     */
    private String peRatioAtIpo;
    /**
     * 网上中签率
     */
    private String onlineDrawingRate;
    /**
     * 收入总额
     */
    private String totalIncome;
    /**
     * 收入总额同比
     */
    private String yoyTotalIncome;
    /**
     * 归母净利润同比
     */
    private String profitParentCompany;
    /**
     * 归母净利润
     */
    private String yoyProfitParentCompany;
    /**
     * 周息率
     */
    private String weeklyInterestRate;
    /**
     * 上市场所
     */
    private String stockExchange;
    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
    /**
     * 备注信息
     */
    private String remarks;


}
