package cn.itcast.elasticsearch.pojo;


import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;
@Document(indexName = "zgallorderimes", type = "zgallorderimes")
public class OrderImes {
    /**
     * 直供网所有订单串码表
     * @author
     *
     */

        /**
         * ROW_ID 手机的唯一标识
         */
        @Id
        private String row_id;

        /**
         * 激活时间
         */
        @Field(type = FieldType.Date)
        private Date active_date;


        /**
         * 结转时间
         */
        @Field(type = FieldType.Date)
        private Date carry_over_time;

        /**
         * 结转时间(Long类型)
         */
        @Field(type = FieldType.Long)
        private Long carry_over_time_long;

        /**
         * 首次省内激活时间
         * @return
         */
        @Field(type = FieldType.Date)
        private Date first_inneractivedate;

        /**
         * 首次省内激活地市
         * @return
         */
        @Field(type = FieldType.Keyword)
        private String first_innercity;


        /**
         * 首次省外激活时间
         * @return
         */
        @Field(type = FieldType.Date)
        private Date first_outactivedate;


        /**
         * 首次省外激活地市
         * @return
         */
        @Field(type = FieldType.Keyword)
        private String first_outcity;


        /**
         * 首次省外激活省份
         * @return
         */
        @Field(type = FieldType.Keyword)
        private String first_outprovince;

        /**
         * 串码
         */
        @Field(type = FieldType.Keyword)
        private String imes;

        /**
         * 末次省内激活时间
         * @return
         */
        @Field(type = FieldType.Date)
        private Date last_inneractivedate;

        /**
         * 末次省内激活地市
         * @return
         */
        @Field(type = FieldType.Keyword)
        private String last_innercity;

        /**
         * 末次省外激活时间
         * @return
         */
        @Field(type = FieldType.Date)
        private Date last_outactivedate;

        /**
         * 末次省外激活地市
         * @return
         */
        @Field(type = FieldType.Keyword)
        private String last_outcity;

        /**
         * 末次省外激活省份
         * @return
         */
        @Field(type = FieldType.Keyword)
        private String last_outprovince;

        /**
         * 直供网订单号
         */
        @Field(type = FieldType.Keyword)
        private String order_num;

        /**
         * 订单同步时间
         */
        @Field(type = FieldType.Date)
        private Date order_syn_date;

        /**
         * 订单时间
         */
        @Field(type = FieldType.Date)
        private Date order_time;

        /**
         * 订单时间(Long类型)
         */
        @Field(type = FieldType.Long)
        private Long order_time_long;

        /**
         * 退货标识  0:正常   1:退货
         */
        @Field(type = FieldType.Keyword)
        private Integer returnflag;

        /**
         * 集团自注册表对象
         */
        @Field(type = FieldType.Keyword)
        //private JtSelfRegisterDay jtSelfRegisterDay;
        private String jt_self_register_day;

        /**
         * 直供网订单表
         */
        @Field(type = FieldType.Keyword)
        //private ZgAllOrderDataExtend zgOrderDataExtend;
        private String zg_order_data_extend_id;





        /**
         * 退货标识:退货
         */

        //@Field(type = FieldType.Keyword)
        public static final Integer RETURN_FLAG_OK = 1;

        /**
         * 退货标识:没有退货
         */
        //@Field(type = FieldType.Keyword)
        public static final Integer RETURN_FLAG_NO = 0;

    @Override
    public String toString() {
        return "OrderImes{" +
                "row_id='" + row_id + '\'' +
                ", active_date=" + active_date +
                ", carry_over_time=" + carry_over_time +
                ", carry_over_time_long=" + carry_over_time_long +
                ", first_inneractivedate=" + first_inneractivedate +
                ", first_innercity='" + first_innercity + '\'' +
                ", first_outactivedate=" + first_outactivedate +
                ", first_outcity='" + first_outcity + '\'' +
                ", first_outprovince='" + first_outprovince + '\'' +
                ", imes='" + imes + '\'' +
                ", last_inneractivedate=" + last_inneractivedate +
                ", last_innercity='" + last_innercity + '\'' +
                ", last_outactivedate=" + last_outactivedate +
                ", last_outcity='" + last_outcity + '\'' +
                ", last_outprovince='" + last_outprovince + '\'' +
                ", order_num='" + order_num + '\'' +
                ", order_syn_date=" + order_syn_date +
                ", order_time=" + order_time +
                ", order_time_long=" + order_time_long +
                ", returnflag=" + returnflag +
                ", jt_self_register_day='" + jt_self_register_day + '\'' +
                ", zg_order_data_extend_id='" + zg_order_data_extend_id + '\'' +
                '}';
    }

    public String getRow_id() {
        return row_id;
    }

    public void setRow_id(String row_id) {
        this.row_id = row_id;
    }

    public Date getActive_date() {
        return active_date;
    }

    public void setActive_date(Date active_date) {
        this.active_date = active_date;
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

    public Date getFirst_inneractivedate() {
        return first_inneractivedate;
    }

    public void setFirst_inneractivedate(Date first_inneractivedate) {
        this.first_inneractivedate = first_inneractivedate;
    }

    public String getFirst_innercity() {
        return first_innercity;
    }

    public void setFirst_innercity(String first_innercity) {
        this.first_innercity = first_innercity;
    }

    public Date getFirst_outactivedate() {
        return first_outactivedate;
    }

    public void setFirst_outactivedate(Date first_outactivedate) {
        this.first_outactivedate = first_outactivedate;
    }

    public String getFirst_outcity() {
        return first_outcity;
    }

    public void setFirst_outcity(String first_outcity) {
        this.first_outcity = first_outcity;
    }

    public String getFirst_outprovince() {
        return first_outprovince;
    }

    public void setFirst_outprovince(String first_outprovince) {
        this.first_outprovince = first_outprovince;
    }

    public String getImes() {
        return imes;
    }

    public void setImes(String imes) {
        this.imes = imes;
    }

    public Date getLast_inneractivedate() {
        return last_inneractivedate;
    }

    public void setLast_inneractivedate(Date last_inneractivedate) {
        this.last_inneractivedate = last_inneractivedate;
    }

    public String getLast_innercity() {
        return last_innercity;
    }

    public void setLast_innercity(String last_innercity) {
        this.last_innercity = last_innercity;
    }

    public Date getLast_outactivedate() {
        return last_outactivedate;
    }

    public void setLast_outactivedate(Date last_outactivedate) {
        this.last_outactivedate = last_outactivedate;
    }

    public String getLast_outcity() {
        return last_outcity;
    }

    public void setLast_outcity(String last_outcity) {
        this.last_outcity = last_outcity;
    }

    public String getLast_outprovince() {
        return last_outprovince;
    }

    public void setLast_outprovince(String last_outprovince) {
        this.last_outprovince = last_outprovince;
    }

    public String getOrder_num() {
        return order_num;
    }

    public void setOrder_num(String order_num) {
        this.order_num = order_num;
    }

    public Date getOrder_syn_date() {
        return order_syn_date;
    }

    public void setOrder_syn_date(Date order_syn_date) {
        this.order_syn_date = order_syn_date;
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

    public Integer getReturnflag() {
        return returnflag;
    }

    public void setReturnflag(Integer returnflag) {
        this.returnflag = returnflag;
    }

    public String getJt_self_register_day() {
        return jt_self_register_day;
    }

    public void setJt_self_register_day(String jt_self_register_day) {
        this.jt_self_register_day = jt_self_register_day;
    }

    public String getZg_order_data_extend_id() {
        return zg_order_data_extend_id;
    }

    public void setZg_order_data_extend_id(String zg_order_data_extend_id) {
        this.zg_order_data_extend_id = zg_order_data_extend_id;
    }

    public static Integer getReturnFlagOk() {
        return RETURN_FLAG_OK;
    }

    public static Integer getReturnFlagNo() {
        return RETURN_FLAG_NO;
    }

    public OrderImes() {
    }

    public OrderImes(String row_id, Date active_date, Date carry_over_time, Long carry_over_time_long, Date first_inneractivedate, String first_innercity, Date first_outactivedate, String first_outcity, String first_outprovince, String imes, Date last_inneractivedate, String last_innercity, Date last_outactivedate, String last_outcity, String last_outprovince, String order_num, Date order_syn_date, Date order_time, Long order_time_long, Integer returnflag, String jt_self_register_day, String zg_order_data_extend_id) {
        this.row_id = row_id;
        this.active_date = active_date;
        this.carry_over_time = carry_over_time;
        this.carry_over_time_long = carry_over_time_long;
        this.first_inneractivedate = first_inneractivedate;
        this.first_innercity = first_innercity;
        this.first_outactivedate = first_outactivedate;
        this.first_outcity = first_outcity;
        this.first_outprovince = first_outprovince;
        this.imes = imes;
        this.last_inneractivedate = last_inneractivedate;
        this.last_innercity = last_innercity;
        this.last_outactivedate = last_outactivedate;
        this.last_outcity = last_outcity;
        this.last_outprovince = last_outprovince;
        this.order_num = order_num;
        this.order_syn_date = order_syn_date;
        this.order_time = order_time;
        this.order_time_long = order_time_long;
        this.returnflag = returnflag;
        this.jt_self_register_day = jt_self_register_day;
        this.zg_order_data_extend_id = zg_order_data_extend_id;
    }
}
