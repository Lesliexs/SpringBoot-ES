package cn.itcast.elasticsearch.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;
@Document(indexName = "mysql_test",type = "jt_self_register_day", shards = 5, replicas = 1)
public class JtSelfRegisterDay {
    /**
     * meid
     */
    @Id
    private String meid;

    /**
     * 是否智能机
     */
    @Field(type= FieldType.Text)
    private String is_smart_desc;
    /**
     * 注册城市
     */
    @Field(type= FieldType.Text)
    private String city;

    /**
     * 年
     */
    @Field(type= FieldType.Text)
    private String year;

    /**
     * 注册日期
     */
    @Field(type=FieldType.Long)
    private Long gather_day;

    /**
     * 同步文件日期
     */
    @Field(type = FieldType.Date)
    private Date synchro_date;

    /**
     * 注册日期(Date日期)
     */
    @Field(type=FieldType.Date)
    private Date register_day;

    /**
     * 终端类型
     */
    @Field(type= FieldType.Text)
    private String catalog_name;

    /**
     * 产品编码
     */
    @Field(type= FieldType.Text)
    private String pro_code;

    /**
     * 注册省分
     */
    @Field(type= FieldType.Text)
    private String prov_desc;

    /**
     * 机型品牌
     */
    @Field(type= FieldType.Text)
    private String brand_name;

    /**
     * 机型ID
     * elasticsearch对应的是String
     * 实际应该不是
     */
    @Field(type= FieldType.Text)
    private String zd_model_id;

    /**
     * 月
     */
    @Field(type= FieldType.Text)
    private String month;
    @Field(type= FieldType.Text)
    private String name;
    @Field(type= FieldType.Text)
    private String row_id;

    public String getMeid() {
        return meid;
    }

    public String getIs_smart_desc() {
        return is_smart_desc;
    }

    public String getCity() {
        return city;
    }

    public String getYear() {
        return year;
    }

    public Long getGather_day() {
        return gather_day;
    }

    public Date getSynchro_date() {
        return synchro_date;
    }

    public Date getRegister_day() {
        return register_day;
    }

    public String getCatalog_name() {
        return catalog_name;
    }

    public String getPro_code() {
        return pro_code;
    }

    public String getProv_desc() {
        return prov_desc;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public String getZd_model_id() {
        return zd_model_id;
    }

    public String getMonth() {
        return month;
    }

    public String getName() {
        return name;
    }

    public String getRow_id() {
        return row_id;
    }

    public void setMeid(String meid) {
        this.meid = meid;
    }

    public void setIs_smart_desc(String is_smart_desc) {
        this.is_smart_desc = is_smart_desc;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setGather_day(Long gather_day) {
        this.gather_day = gather_day;
    }

    public void setSynchro_date(Date synchro_date) {
        this.synchro_date = synchro_date;
    }

    public void setRegister_day(Date register_day) {
        this.register_day = register_day;
    }

    public void setCatalog_name(String catalog_name) {
        this.catalog_name = catalog_name;
    }

    public void setPro_code(String pro_code) {
        this.pro_code = pro_code;
    }

    public void setProv_desc(String prov_desc) {
        this.prov_desc = prov_desc;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public void setZd_model_id(String zd_model_id) {
        this.zd_model_id = zd_model_id;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRow_id(String row_id) {
        this.row_id = row_id;
    }

    @Override
    public String toString() {
        return "Register{" +
                "meid='" + meid + '\'' +
                ", is_smart_desc='" + is_smart_desc + '\'' +
                ", city='" + city + '\'' +
                ", year='" + year + '\'' +
                ", gather_day=" + gather_day +
                ", synchro_date=" + synchro_date +
                ", register_day=" + register_day +
                ", catalog_name='" + catalog_name + '\'' +
                ", pro_code='" + pro_code + '\'' +
                ", prov_desc='" + prov_desc + '\'' +
                ", brand_name='" + brand_name + '\'' +
                ", zd_model_id='" + zd_model_id + '\'' +
                ", month='" + month + '\'' +
                ", name='" + name + '\'' +
                ", row_id='" + row_id + '\'' +
                '}';
    }

    public JtSelfRegisterDay(String meid, String is_smart_desc, String city, String year, Long gather_day, Date synchro_date, Date register_day, String catalog_name, String pro_code, String prov_desc, String brand_name, String zd_model_id, String month, String name, String row_id) {
        this.meid = meid;
        this.is_smart_desc = is_smart_desc;
        this.city = city;
        this.year = year;
        this.gather_day = gather_day;
        this.synchro_date = synchro_date;
        this.register_day = register_day;
        this.catalog_name = catalog_name;
        this.pro_code = pro_code;
        this.prov_desc = prov_desc;
        this.brand_name = brand_name;
        this.zd_model_id = zd_model_id;
        this.month = month;
        this.name = name;
        this.row_id = row_id;
    }

    public JtSelfRegisterDay() {
    }
}
