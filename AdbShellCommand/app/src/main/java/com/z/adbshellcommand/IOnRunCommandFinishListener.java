package com.z.adbshellcommand;

/**
 * Created by Administrator on 15-4-20.
 */
public interface IOnRunCommandFinishListener {

    /**
     * ���������ʾ
     * @param errorMsg ��ʾ��Ϣ
     */
    public void OnInputError(String errorMsg);

    /**
     * �����������
     * @param commandResult ��������ת���ַ�������
     */
    public void OnRunComplete(String commandResult);
}
