package com.example.hoossenlenovo.assignment6.designPatterns.domain;

/**
 * Created by Toshiba on 2016/04/07.
 */
import java.io.Serializable;

public class Login implements Serializable{

<<<<<<< HEAD
    private Long id;
=======
>>>>>>> 18bfb1b06a979e4bb45b2817432811f956a8b05d
    private String userName;
    private String password;


    private static final long serialVersionUID = 1L;


<<<<<<< HEAD
    public Login(Long id,String userName, String password) {
        this.id = id;
=======
    public Login(String userName, String password) {
>>>>>>> 18bfb1b06a979e4bb45b2817432811f956a8b05d
        this.userName = userName;
        this.password = password;
    }

<<<<<<< HEAD
    public Long getId() {
        return id;
    }
=======

>>>>>>> 18bfb1b06a979e4bb45b2817432811f956a8b05d
    public String getUserName() { return userName;    }
    public String getPassword() {
        return password;
    }


    public Login(Builder builder)
    {
        this.userName = builder.userName;
        this.password = builder.password;
<<<<<<< HEAD
        this.id = builder.id;
=======
>>>>>>> 18bfb1b06a979e4bb45b2817432811f956a8b05d
    }

    public static class Builder
    {
<<<<<<< HEAD
        private Long id;
        private String userName;
        private String password;

        public Builder id(Long value){
            this.id = value;
            return this;
        }
=======
        private String userName;
        private String password;


>>>>>>> 18bfb1b06a979e4bb45b2817432811f956a8b05d
        public Builder userName(String value){
            this.userName = value;
            return this;
        }
        public Builder password(String value){
            this.password = value;
            return this;
        }

        public Builder copy(Login value) {
<<<<<<< HEAD
            this.id = value.id;
=======
>>>>>>> 18bfb1b06a979e4bb45b2817432811f956a8b05d
            this.userName = value.userName;
            this.password = value.password;
            return this;
        }

        public Login build() {
            return new Login(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Login)) return false;

        Login login = (Login) o;

<<<<<<< HEAD
        if (getId() != null ? !getId().equals(login.getId()) : login.getId() != null) return false;
        if (getUserName() != null ? !getUserName().equals(login.getUserName()) : login.getUserName() != null)
            return false;
        return getPassword() != null ? getPassword().equals(login.getPassword()) : login.getPassword() == null;
=======
        if (getUserName() != null ? !getUserName().equals(login.getUserName()) : login.getUserName() != null)
            return false;
        return !(getPassword() != null ? !getPassword().equals(login.getPassword()) : login.getPassword() != null);
>>>>>>> 18bfb1b06a979e4bb45b2817432811f956a8b05d

    }

    @Override
    public int hashCode() {
<<<<<<< HEAD
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getUserName() != null ? getUserName().hashCode() : 0);
=======
        int result = getUserName() != null ? getUserName().hashCode() : 0;
>>>>>>> 18bfb1b06a979e4bb45b2817432811f956a8b05d
        result = 31 * result + (getPassword() != null ? getPassword().hashCode() : 0);
        return result;
    }
}
