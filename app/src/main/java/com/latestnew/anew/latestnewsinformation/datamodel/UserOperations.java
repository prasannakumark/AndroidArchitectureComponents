package com.latestnew.anew.latestnewsinformation.datamodel;

import android.support.annotation.NonNull;

public interface UserOperations<T> {
    void insert(@NonNull T object);
    void remove(@NonNull T field);
    void update(@NonNull T field);
    void fetchUser(@NonNull T field);
}
