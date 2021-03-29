package top.xywu.student.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author xywu
 * @date 2021/03/06
 */
@Entity
public class Student {
    @Id
    @GeneratedValue
    private Integer id;

    private String username;
    private String phone;

    // 第三：自动加入空构造方法，加入get，set方法
    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
