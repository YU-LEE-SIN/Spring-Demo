package com.homework;

public class SqlSessionFactoryCreat {
  private Properties prop;

    public SqlSessionFactoryCreat(Properties prop) {
        this.prop = prop;
    }

    @Override
    public String toString() {
        return "SqlSessionFactorCreator{" +
                "prop=" + prop +
                '}';
    }

    SqlSessionFactory create(){
        return new SqlSessionFactory(prop);
    }
}