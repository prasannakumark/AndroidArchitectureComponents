package com.latestnew.anew.latestnewsinformation.utility;

import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@StringDef ({UserColumns.TABLE_NAME,UserColumns.FIRST_NAME,UserColumns.PHONE,UserColumns.DOB,UserColumns.DOB,
UserColumns.EMAIL,UserColumns.PASSWORD})
@Retention(RetentionPolicy.SOURCE)
public @interface UserColumns {
    String TABLE_NAME = "user";
    String FIRST_NAME = "first_name";
    String LASR_NAME = "last_name";
    String PHONE = "phone";
    String DOB = "dob";
    String EMAIL = "email_id";
    String PASSWORD = "password";
}
