package com.example.hoossenlenovo.assignment6.designPatterns.domain;

import java.io.Serializable;

/**
 * Created by hoossenLenovo on 2016-04-17.
 */
public class DateOfBirth implements Serializable {

<<<<<<< HEAD
    private Long id;
=======
>>>>>>> 18bfb1b06a979e4bb45b2817432811f956a8b05d
    private int day;
    private String month;
    private int year;

    private static final long serialVersionUID = 1L;

    public DateOfBirth() {
    }

<<<<<<< HEAD
    public DateOfBirth(Long id,int day, String month, int year) {
        this.id = id;
=======
    public DateOfBirth(int day, String month, int year) {
>>>>>>> 18bfb1b06a979e4bb45b2817432811f956a8b05d
        this.day = day;
        this.month = month;
        this.year = year;
    }

<<<<<<< HEAD
    public Long getId() {
        return id;
    }
=======
>>>>>>> 18bfb1b06a979e4bb45b2817432811f956a8b05d
    public int getDay() {
        return day;
    }
    public String getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }


    public DateOfBirth(Builder builder)
    {
<<<<<<< HEAD
        this.id = builder.id;
=======
>>>>>>> 18bfb1b06a979e4bb45b2817432811f956a8b05d
        this.day = builder.day;
        this.month = builder.month;
        this.year = builder.year;
    }

    public static class Builder
    {
<<<<<<< HEAD
        private Long id;
=======
>>>>>>> 18bfb1b06a979e4bb45b2817432811f956a8b05d
        private int day;
        private String month;
        private int year;


<<<<<<< HEAD
        public Builder id(Long value){
            this.id = value;
            return this;
        }
=======
>>>>>>> 18bfb1b06a979e4bb45b2817432811f956a8b05d
        public Builder day(int value){
            this.day = value;
            return this;
        }
        public Builder month(String value){
            this.month = value;
            return this;
        }
        public Builder year(int value){
            this.year = value;
            return this;
        }

        public Builder copy(DateOfBirth value) {
<<<<<<< HEAD
            this.id = value.id;
=======
>>>>>>> 18bfb1b06a979e4bb45b2817432811f956a8b05d
            this.day = value.day;
            this.month = value.month;
            this.year = value.year;

            return this;
        }

        public DateOfBirth build() {
            return new DateOfBirth(this);
        }
    }

<<<<<<< HEAD

=======
>>>>>>> 18bfb1b06a979e4bb45b2817432811f956a8b05d
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DateOfBirth)) return false;

        DateOfBirth that = (DateOfBirth) o;

        if (getDay() != that.getDay()) return false;
        if (getYear() != that.getYear()) return false;
<<<<<<< HEAD
        if (getId() != null ? !getId().equals(that.getId()) : that.getId() != null) return false;
        return getMonth() != null ? getMonth().equals(that.getMonth()) : that.getMonth() == null;
=======
        return !(getMonth() != null ? !getMonth().equals(that.getMonth()) : that.getMonth() != null);
>>>>>>> 18bfb1b06a979e4bb45b2817432811f956a8b05d

    }

    @Override
    public int hashCode() {
<<<<<<< HEAD
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + getDay();
=======
        int result = getDay();
>>>>>>> 18bfb1b06a979e4bb45b2817432811f956a8b05d
        result = 31 * result + (getMonth() != null ? getMonth().hashCode() : 0);
        result = 31 * result + getYear();
        return result;
    }
}
