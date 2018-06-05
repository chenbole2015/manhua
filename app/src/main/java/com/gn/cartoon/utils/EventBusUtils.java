package com.gn.cartoon.utils;

import org.greenrobot.eventbus.EventBus;

public class EventBusUtils {

    public static void register(Object subscriber) {
        if (!EventBus.getDefault().isRegistered(subscriber))
            EventBus.getDefault().register(subscriber);
    }

    public static void unRegister(Object subscriber) {
        if (EventBus.getDefault().isRegistered(subscriber))
            EventBus.getDefault().unregister(subscriber);
    }

    public static void postSticky(Object data) {
        EventBus.getDefault().postSticky(data);
    }

    public static void post(Object data) {
        EventBus.getDefault().post(data);
    }

}
