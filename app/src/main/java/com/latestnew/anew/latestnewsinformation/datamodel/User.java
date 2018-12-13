package com.latestnew.anew.latestnewsinformation.datamodel;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.latestnew.anew.latestnewsinformation.utility.UserColumns;

import java.sql.Date;

@Entity(tableName = UserColumns.TABLE_NAME)
public class User {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = UserColumns.FIRST_NAME)
    private String firstName;
    @ColumnInfo(name = UserColumns.LASR_NAME)
    private String lastLast;
    @ColumnInfo(name = UserColumns.EMAIL)
    private String emailId;
    @ColumnInfo(name = UserColumns.PHONE)
    private String phone;
    @ColumnInfo(name = UserColumns.DOB)
    private Date dob;
    @ColumnInfo(name = UserColumns.PASSWORD)
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastLast() {
        return lastLast;
    }

    public void setLastLast(String lastLast) {
        this.lastLast = lastLast;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
