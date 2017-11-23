package com.nuts.sample.push;

import java.util.List;

import android.content.Context;
import com.baidu.android.pushservice.PushMessageReceiver;

// TODO: zhangxue
public class PushManagerReceiver extends PushMessageReceiver {

    public static final String TAG = PushMessageReceiver.class.getSimpleName();

    /**
     * 用于处理startWork返回值
     * @param context BroadcastReceiver的执行Context
     * @param i 绑定接口返回值，0 - 成功
     * @param s 应用id，errorCode非0时为null
     * @param s1 应用user id，errorCode非0时为null
     * @param s2 应用channel id，errorCode非0时为null
     * @param s3 向服务端发起的请求id，在追查问题时有用
     */
    @Override
    public void onBind(Context context, int i, String s, String s1, String s2, String s3) {

        pushBind();
    }

    /**
     * stopWork的回调函数
     * @param context  上下文
     * @param i 错误码，0表示从云推送解绑定成功，非0表示失败
     * @param s 分配给对云推送的请求的id
     */

    @Override
    public void onUnbind(Context context, int i, String s) {
        System.out.println("onUnbind");
    }

    /**
     * 是tag相关操作的回调
     * @param context  上下文
     * @param i 错误码，0表示某些tag已经设置成功，非0表示所有tag的设置均失败
     * @param list 设置成功的tag
     * @param list1 设置失败的tag
     * @param s 分配给对云推送的请求的id
     */
    @Override
    public void onSetTags(Context context, int i, List<String> list, List<String> list1, String s) {
    }

    /**
     * @param context 上下文
     * @param i  错误码。0表示某些tag已经删除成功；非0表示所有tag均删除失败
     * @param list 成功删除的tag
     * @param list1 删除失败的tag
     * @param s 分配给对云推送的请求的id
     */
    @Override
    public void onDelTags(Context context, int i, List<String> list, List<String> list1, String s) {
    }

    /**
     * @param context 上下文
     * @param i 错误码。0表示列举tag成功；非0表示失败
     * @param list 当前应用设置的所有tag
     * @param s 分配给对云推送的请求的id
     */
    @Override
    public void onListTags(Context context, int i, List<String> list, String s) {
    }

    /**
     * 用于接收透传消息：
     * @param context 上下文
     * @param s 推送的消息
     * @param s1 自定义内容，为空或者json字符串
     */
    @Override
    public void onMessage(Context context, String s, String s1) {
    }

    /**
     * 接收通知点击的函数
     * @param context  上下文
     * @param s 推送的通知的标题
     * @param s1 推送的通知的描述
     * @param s2 自定义内容，为空或者json字符串
     */
    @Override
    public void onNotificationClicked(Context context, String s, String s1, String s2) {


    }

    /**
     * 接收通知到达的函数
     * @param context  上下文
     * @param s 推送的通知的标题
     * @param s1 推送的通知的描述
     * @param s2 自定义内容，为空或者json字符串
     */
    @Override
    public void onNotificationArrived(Context context, String s, String s1, String s2) {
    }

    /**
     * 绑定推送请求
     */
    public void pushBind() {
    }
}
