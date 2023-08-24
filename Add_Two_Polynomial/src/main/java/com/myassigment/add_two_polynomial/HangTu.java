package com.myassigment.add_two_polynomial;
public class HangTu {
    int heSo;
    int soMu;
    String bien;
    HangTu next;

    public HangTu(){

    }

    public HangTu(int heSo, int soMu, String bien){
        this.heSo = heSo;
        this.soMu = soMu;
        this.next = null;
        this.bien = bien;
    }
}
