package com.z.adbshellcommand.view;

/**
 * Created by Administrator on 15-4-20.
 */
public interface IMainView {
    /**
     * ��ʾ���ȶԻ���
     */
    public void showProgressDialog();

    /**
     * չʾ����ִ�н��
     * @param commandResult ������
     */
    public void showResult(String commandResult);

    /**
     * �������������Ϣ
     * @param errorMsg ������Ϣ
     */
    public void setInputError(String errorMsg);

    /**
     * ���ؽ��ȶԻ���
     */
    public void dismissProgressDialog();
}
