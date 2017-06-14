package com.sean;


import org.apache.commons.httpclient.HttpMethod;

/**
 * Created by 203293 on 6/14/2017.
 */
public class MyChildClass extends MyParentClass implements MyInterface{


    public MyChildClass() {
        super(5);
    }

    public void doSomething(String message) {

    }

    public void setMyName(String foo) {

    }

    protected <T extends Object> T sendRequest(String api, HttpMethod method, Object body, String query,
                                               Class<T> responseCls, Object... urlVars) {


        T response = null;
        return response;
    }
}
