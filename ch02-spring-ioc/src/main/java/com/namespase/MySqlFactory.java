package com.namespase;

public class MySqlFactory {
    private MyDataSource myDataSource;

    public MyDataSource getMyDataSource() {
        return myDataSource;
    }

    public void setMyDataSource(MyDataSource myDataSource) {
        this.myDataSource = myDataSource;
    }

    public MySqlFactory(MyDataSource myDataSource) {
        this.myDataSource = myDataSource;
    }
}
