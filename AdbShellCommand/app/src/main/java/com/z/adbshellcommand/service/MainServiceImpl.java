package com.z.adbshellcommand.service;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

import com.z.adbshellcommand.IOnRunCommandFinishListener;
import com.z.adbshellcommand.util.CommandResult;
import com.z.adbshellcommand.util.ShellUtils;

/**
 * Created by Administrator on 15-4-20.
 */
public class MainServiceImpl implements IMainService {
    private static final String COMMAND_RESULT_FORMAT="resultCode:%s,successMsg:%s,errorMsg:%s\n";
    @Override
    public void dealAdbShellCommand(final String strCommand, final IOnRunCommandFinishListener listener) {
        if (TextUtils.isEmpty(strCommand)){
            //�������Ϊ�գ��򷵻�����Ϊ�յĴ�����ʾ
            listener.OnInputError("command can not be Empty");
            return;
        }
        new Thread(){
            @Override
            public void run(){
                //ִ��adb����
                CommandResult result= ShellUtils.execCommand(strCommand, true, true);
                //�������ʽ��ת��
               final String strResult= String.format(COMMAND_RESULT_FORMAT, result.result, result.successMsg, result.errorMsg);

                //��ȡ���̵߳�handler
                Handler handler=new Handler(Looper.getMainLooper());
                //�����߳��д�����
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        listener.OnRunComplete(strResult);
                    }
                });
            }
        }.start();
    }
}
