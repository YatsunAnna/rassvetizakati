package com.rassvetizakati.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.sql.Blob;

@Entity
@Table(name = "user_table")
public class User{
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @JsonProperty
    private int id;

    @Size (min = 2, message = "введите не менее 2 символов")
    private String name;

    @Size (min = 3, message = "введите не менее 3 символов")
    private String password;
    private String phone;
    //задать шаблон

    //??тип данных
    private Blob photo;

    //Пустой конструктор
    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Blob getPhoto() {
        return photo;
    }

    public void setPhoto(Blob photo) {
        this.photo = photo;
    }

//    public String getName() {
//        return name;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public Blob getPhoto() {
//        return photo;
//    }
//
//    public void setPhoto(Blob photo) {
//        this.photo = photo;
//    }
//
//
////Поле для проверки пароля. не хранится в базе. Требуется только при регистрации
//    @Transient
//    private String passwordConfirm; //подтверждение пароля
//
//
//    //Позволяет указать как выгружать роль юзера из базы. eager - информия о всех ролях подгружается со всеми полями каждый раз.
////    @ManyToMany(fetch = FetchType.EAGER) //Понять что происходит на этих двух строчках
////    private Set <Role> roles = new HashSet<>();
//
//
//    public int getId() {
//        return id;
//   }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return name;
//    }
////выяснить что переопределяем
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//
//
//
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
////    @Override
////    public Collection<? extends GrantedAuthority> getAuthorities() {
////        return getRoles();
////    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getPasswordConfirm() {
//        return passwordConfirm;
//    }
//
//    public void setPasswordConfirm(String passwordConfirm) {
//        this.passwordConfirm = passwordConfirm;
//    }
//
////    public Set<Role> getRoles() {
////        return roles;
////    }
////
////    public void setRoles(Set<Role> roles) {
////        this.roles = roles;
////    }


}

