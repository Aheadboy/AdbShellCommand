package com.z.adbshellcommand.service;

import com.z.adbshellcommand.IOnRunCommandFinishListener;

/**
 * Created by Administrator on 15-4-20.
 */
public interface IMainService {
    /**
     * ��������
     * @param strCommand �����ַ�
     * @param listener ����������{@link com.z.adbshellcommand.IOnRunCommandFinishListener}
     */
    public void dealAdbShellCommand(String strCommand, IOnRunCommandFinishListener listener);
}
