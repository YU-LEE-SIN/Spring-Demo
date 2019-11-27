package com.homework;

public class SqlSessionFactory {
    private Properties Properties;

    @Override
    public String toString() {
        return "SqlSessionFactory{" +
                "Properties=" + Properties +
                '}';
    }

    public SqlSessionFactory(com.homework.Properties properties) {
        Properties = properties;
    }
}