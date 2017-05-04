package com.kangyonggan.app.fortune.model.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "command")
public class Command implements Serializable {
    /**
     * 主键, 自增
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 商户号
     */
    @Column(name = "merch_co")
    private String merchCo;

    /**
     * 协议号
     */
    private String protocol;

    /**
     * 商户流水号
     */
    @Column(name = "merch_serial_no")
    private String merchSerialNo;

    /**
     * 发财付流水号
     */
    @Column(name = "fpay_serial_no")
    private String fpaySerialNo;

    /**
     * 发财付交易日期
     */
    @Column(name = "fpay_date")
    private String fpayDate;

    /**
     * 卡号
     */
    @Column(name = "acct_no")
    private String acctNo;

    /**
     * 户名
     */
    @Column(name = "acct_nm")
    private String acctNm;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 证件类型, 默认身份证：0
     */
    @Column(name = "id_tp")
    private String idTp;

    /**
     * 证件号码
     */
    @Column(name = "id_no")
    private String idNo;

    /**
     * 币种, 默认人民币：00
     */
    @Column(name = "currCo")
    private String currco;

    /**
     * 交易金额
     */
    private BigDecimal amount;

    /**
     * 付款方式账户类型
     */
    @Column(name = "sndr_acct_tp")
    private String sndrAcctTp;

    /**
     * 收款方式账户类型
     */
    @Column(name = "rcvr_acct_tp")
    private String rcvrAcctTp;

    /**
     * 清算日期
     */
    @Column(name = "settle_date")
    private String settleDate;

    /**
     * 备注
     */
    private String remark;

    /**
     * 预留字段1
     */
    private String resv1;

    /**
     * 预留字段2
     */
    private String resv2;

    /**
     * 交易状态
     */
    @Column(name = "tran_st")
    private String tranSt;

    /**
     * 逻辑删除:{0:未删除, 1:已删除}
     */
    @Column(name = "is_deleted")
    private Byte isDeleted;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 更新时间
     */
    @Column(name = "updated_time")
    private Date updatedTime;

    private static final long serialVersionUID = 1L;
}