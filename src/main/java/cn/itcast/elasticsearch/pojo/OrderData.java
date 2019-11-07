package cn.itcast.elasticsearch.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

@Document(indexName = "mysql_order_data",type = "zg_all_order_data")
//@Data
public class OrderData {
    @Id
    private String row_id;

    /**
     * 客商名称
     */
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String agent_name;

    /**
     * 结转时间
     */
    @Field(type = FieldType.Date)
    private Date carry_over_time;

    @Field(type = FieldType.Long)
    private Long carry_over_time_long;

    /**
     * 收货地市
     */
    @Field(type =FieldType.Keyword )
    private String city;

    /**
     * 25位编码
     */
    @Field(type = FieldType.Keyword)
    private String code;

    /**
     * 颜色
     */
    @Field(type=FieldType.Text,analyzer = "ik_max_word")
    private String color;

    /**
     * 收货区县
     */
    @Field(type=FieldType.Keyword)
    private String county;

    /**
     * 逻辑删除标识 0:正常 1:删除
     */
    @Field(type = FieldType.Integer)
    private Integer delFlag=0;

    /**
     * 产品优惠金额
     */
    @Field(type=FieldType.Double)
    private Double discountMoney;

    /**
     * 品牌
     */
    @Field(type=FieldType.Keyword)
    private String factory_name;

    /**
     * 型号
     */
    @Field(type=FieldType.Text,analyzer = "ik_max_word")
    private String model_name;

    /**
     * 订单号
     */
    @Field(type=FieldType.Keyword)
    private String order_num;


    /**
     * 订单时间
     */
    @Field(type=FieldType.Date)
    private Date order_time;
    @Field(type=FieldType.Long)
    private Long order_time_long;

    /**
     * 单台优惠金额
     */
    @Field(type=FieldType.Double)
    private Double single_cash_back;

    /**
     * 单台实付金额
     */
    @Field(type=FieldType.Double)
    private Double single_real_price;

    /**
     * 单台实付金额*数量 得到的该订单实付的总金额
     */
    @Field(type=FieldType.Double)
    private Double sum_order_price;

    /**
     * 单台零售价*数量 得到的该订单零售价的总金额
     */
    @Field(type=FieldType.Double)
    private Double sum_retail_price;

    @Field(type=FieldType.Double)
    private Double supply_price;

    /**
     * 地区area对象
     */
    @Field(type=FieldType.Keyword)
    private String zg_area_primary;

    /**
     * 客商对象
     */
    @Field(type=FieldType.Keyword)
    private String zg_customer_primary;

    @Field(type = FieldType.Integer)
    private Integer num;

    public String getRow_id() {
        return row_id;
    }

    public void setRow_id(String row_id) {
        this.row_id = row_id;
    }

    public String getAgent_name() {
        return agent_name;
    }

    public void setAgent_name(String agent_name) {
        this.agent_name = agent_name;
    }

    public Date getCarry_over_time() {
        return carry_over_time;
    }

    public void setCarry_over_time(Date carry_over_time) {
        this.carry_over_time = carry_over_time;
    }

    public Long getCarry_over_time_long() {
        return carry_over_time_long;
    }

    public void setCarry_over_time_long(Long carry_over_time_long) {
        this.carry_over_time_long = carry_over_time_long;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public Double getDiscountMoney() {
        return discountMoney;
    }

    public void setDiscountMoney(Double discountMoney) {
        this.discountMoney = discountMoney;
    }

    public String getFactory_name() {
        return factory_name;
    }

    public void setFactory_name(String factory_name) {
        this.factory_name = factory_name;
    }

    public String getModel_name() {
        return model_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    public String getOrder_num() {
        return order_num;
    }

    public void setOrder_num(String order_num) {
        this.order_num = order_num;
    }

    public Date getOrder_time() {
        return order_time;
    }

    public void setOrder_time(Date order_time) {
        this.order_time = order_time;
    }

    public Long getOrder_time_long() {
        return order_time_long;
    }

    public void setOrder_time_long(Long order_time_long) {
        this.order_time_long = order_time_long;
    }

    public Double getSingle_cash_back() {
        return single_cash_back;
    }

    public void setSingle_cash_back(Double single_cash_back) {
        this.single_cash_back = single_cash_back;
    }

    public Double getSingle_real_price() {
        return single_real_price;
    }

    public void setSingle_real_price(Double single_real_price) {
        this.single_real_price = single_real_price;
    }

    public Double getSum_order_price() {
        return sum_order_price;
    }

    public void setSum_order_price(Double sum_order_price) {
        this.sum_order_price = sum_order_price;
    }

    public Double getSum_retail_price() {
        return sum_retail_price;
    }

    public void setSum_retail_price(Double sum_retail_price) {
        this.sum_retail_price = sum_retail_price;
    }

    public Double getSupply_price() {
        return supply_price;
    }

    public void setSupply_price(Double supply_price) {
        this.supply_price = supply_price;
    }

    public String getZg_area_primary() {
        return zg_area_primary;
    }

    public void setZg_area_primary(String zg_area_primary) {
        this.zg_area_primary = zg_area_primary;
    }

    public String getZg_customer_primary() {
        return zg_customer_primary;
    }

    public void setZg_customer_primary(String zg_customer_primary) {
        this.zg_customer_primary = zg_customer_primary;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public OrderData(String row_id, String agent_name, Date carry_over_time, Long carry_over_time_long, String city, String code, String color, String county, Integer delFlag, Double discountMoney, String factory_name, String model_name, String order_num, Date order_time, Long order_time_long, Double single_cash_back, Double single_real_price, Double sum_order_price, Double sum_retail_price, Double supply_price, String zg_area_primary, String zg_customer_primary, Integer num) {
        this.row_id = row_id;
        this.agent_name = agent_name;
        this.carry_over_time = carry_over_time;
        this.carry_over_time_long = carry_over_time_long;
        this.city = city;
        this.code = code;
        this.color = color;
        this.county = county;
        this.delFlag = delFlag;
        this.discountMoney = discountMoney;
        this.factory_name = factory_name;
        this.model_name = model_name;
        this.order_num = order_num;
        this.order_time = order_time;
        this.order_time_long = order_time_long;
        this.single_cash_back = single_cash_back;
        this.single_real_price = single_real_price;
        this.sum_order_price = sum_order_price;
        this.sum_retail_price = sum_retail_price;
        this.supply_price = supply_price;
        this.zg_area_primary = zg_area_primary;
        this.zg_customer_primary = zg_customer_primary;
        this.num = num;
    }

    public OrderData() {
    }

    @Override
    public String toString() {
        return "OrderData{" +
                "row_id='" + row_id + '\'' +
                ", agent_name='" + agent_name + '\'' +
                ", carry_over_time=" + carry_over_time +
                ", carry_over_time_long=" + carry_over_time_long +
                ", city='" + city + '\'' +
                ", code='" + code + '\'' +
                ", color='" + color + '\'' +
                ", county='" + county + '\'' +
                ", delFlag=" + delFlag +
                ", discountMoney=" + discountMoney +
                ", factory_name='" + factory_name + '\'' +
                ", model_name='" + model_name + '\'' +
                ", order_num='" + order_num + '\'' +
                ", order_time=" + order_time +
                ", order_time_long=" + order_time_long +
                ", single_cash_back=" + single_cash_back +
                ", single_real_price=" + single_real_price +
                ", sum_order_price=" + sum_order_price +
                ", sum_retail_price=" + sum_retail_price +
                ", supply_price=" + supply_price +
                ", zg_area_primary='" + zg_area_primary + '\'' +
                ", zg_customer_primary='" + zg_customer_primary + '\'' +
                ", num=" + num +
                '}';
    }
}
