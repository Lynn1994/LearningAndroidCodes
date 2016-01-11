package com.lynn1994.transferdatainactivities;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Lynn on 2016/1/11.
 */
public class User2 implements Parcelable {
    private String name;
    private int age;
    public static final Creator<User2> CREATOR = new Creator<User2>() {
        @Override
        public User2 createFromParcel(Parcel source) {
            return new User2(source.readString(), source.readInt());
        }

        @Override
        public User2[] newArray(int size) {
            return new User2[size];
        }
    };

    public User2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(getName());
        dest.writeInt(getAge());
    }
}
