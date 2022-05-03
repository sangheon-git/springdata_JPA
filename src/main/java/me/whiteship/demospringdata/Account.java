package me.whiteship.demospringdata;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Account {

    @Id @GeneratedValue
    private Long id;
    @Column(nullable = false, unique = true)
    private String username;
    private String password;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created = new Date();

    private String yes;

    @Transient
    private String no;

//    2022.05.03
//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(name = "street", column = @Column(name = "home_street"))
//    })
//    private Address address;

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
