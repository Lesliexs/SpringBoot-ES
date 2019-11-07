package cn.itcast.elasticsearch.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
@Document(indexName = "mysql_test",type = "for_my_test", shards = 5, replicas = 1)
public class Test {
    /**
     * meid
     */
    @Id
    private String meid;
    /**
     * 注册城市
     */
    @Field(type= FieldType.Text)
    private String city;
    /**
     * 机型品牌
     */
    @Field(type= FieldType.Text)
    private String brand_name;
    @Field(type= FieldType.Text)
    private String row_id;
    @Field(type= FieldType.Float)
    private Float price;

    public Test() {
    }

    public Test(String meid, String city, String brand_name, String row_id, Float price) {
        this.meid = meid;
        this.city = city;
        this.brand_name = brand_name;
        this.row_id = row_id;
        this.price = price;
    }

    public String getMeid() {
        return meid;
    }

    public void setMeid(String meid) {
        this.meid = meid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getRow_id() {
        return row_id;
    }

    public void setRow_id(String row_id) {
        this.row_id = row_id;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Test{" +
                "meid='" + meid + '\'' +
                ", city='" + city + '\'' +
                ", brand_name='" + brand_name + '\'' +
                ", row_id='" + row_id + '\'' +
                ", price=" + price +
                '}';
    }
}
