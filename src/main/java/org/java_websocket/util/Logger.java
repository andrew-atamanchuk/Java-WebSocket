package org.java_websocket.util;

public class Logger {

    public void trace(String msg){
        trace(msg, null);
    }

    public void trace(String msg, Object obj){
        System.out.println(msg + " : " + obj);
    }

    public void trace(String msg, Object... objs){
        String  aaa = "ddd {} dddd";
        for(Object obj : objs) {
            msg = msg.replaceFirst(aaa, obj.toString());
        }
        System.out.println(msg);
    }

    public void trace(String msg, int count, String msg2){
        System.out.println(msg + " : " + count + " : " + msg2);
    }

    public void error(String msg){
        error(msg, null);
    }

    public void error(String msg, Object obj){
        System.out.println(msg + " : " + obj);
    }

    public boolean isTraceEnabled(){
        return true;
    }
}
