package com.welling.kinghacker.oxygenbean;

import android.content.Context;

/**
 * Created by li on 2016/5/7.
 */
public class OxygenMedicineBean extends OxygenMTBean {
    public String medicineName ;//ҩ��
    public String way;   //���÷�ʽ
    public float number;
    public String unit;
    public String count;
    public String time;
    public String constituent; //�ɷ�
    public String adaptation_disease; //��Ӧ֢
    public String adverse_reaction; //������Ӧ
    public String taboo; //��ҩ����
    public String attentions; //ע������
    public String direction; //ҩƷ˵��

    public OxygenMedicineBean(Context context){
        super(context);
    }
    @Override
    public void insert() {

    }

    @Override
    protected void createTable() {

    }
    @Override
    public int getRecentlyOneData(){
        return 0;
    }
    @Override
    public int[] getRecentlySevenData(){
        int[] data={};
        return data;
    }
}
