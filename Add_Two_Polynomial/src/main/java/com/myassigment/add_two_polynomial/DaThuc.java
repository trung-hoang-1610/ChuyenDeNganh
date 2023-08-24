package com.myassigment.add_two_polynomial;

public class DaThuc {
    HangTu head  = new HangTu();

    public DaThuc(){
        head = null;
    }

    public void themHangTu(int heSo, int soMu, String bien){


        HangTu hangTuMoi = new HangTu(heSo, soMu, bien);

        if(head == null || soMu > head.soMu ){
            hangTuMoi.next = head;
            head = hangTuMoi;
        } else{
            HangTu hangTuHienTai = new HangTu();
            hangTuHienTai = head;
            while(hangTuHienTai.next != null && hangTuHienTai.next.soMu >= soMu){
                hangTuHienTai = hangTuHienTai.next;
            }
            hangTuMoi.next = hangTuHienTai.next;
            hangTuHienTai.next = hangTuMoi;
        }
    }

    public DaThuc congHaiDaThuc(DaThuc other){

        DaThuc TongHaiDaThuc = new DaThuc();
        HangTu DaThuc1 = this.head;
        HangTu DaThuc2 = other.head;

        while(DaThuc1 != null && DaThuc2!= null){

            if((DaThuc1.soMu == DaThuc2.soMu) && DaThuc1.bien.equals(DaThuc2.bien) == true){
                TongHaiDaThuc.themHangTu(DaThuc1.heSo + DaThuc2.heSo, DaThuc1.soMu, DaThuc1.bien);
                DaThuc1 = DaThuc1.next;
                DaThuc2 = DaThuc2.next;
            } else if(DaThuc1.soMu > DaThuc2.soMu){
                TongHaiDaThuc.themHangTu(DaThuc1.heSo, DaThuc1.soMu, DaThuc1.bien);
                DaThuc1 = DaThuc1.next;
            }else{
                TongHaiDaThuc.themHangTu(DaThuc2.heSo, DaThuc2.soMu, DaThuc2.bien);
                DaThuc2 = DaThuc2.next;
            }
        }

        while(DaThuc1 != null){
            TongHaiDaThuc.themHangTu(DaThuc1.heSo, DaThuc1.soMu, DaThuc1.bien);
            DaThuc1 = DaThuc1.next;
        }

        while(DaThuc2 != null){
            TongHaiDaThuc.themHangTu(DaThuc2.heSo, DaThuc2.soMu, DaThuc2.bien);
            DaThuc2 = DaThuc2.next;
        }
        return TongHaiDaThuc;
    }
    
        public DaThuc truHaiDaThuc(DaThuc other){

        DaThuc TongHaiDaThuc = new DaThuc();
        HangTu DaThuc1 = this.head;
        HangTu DaThuc2 = other.head;

        while(DaThuc1 != null && DaThuc2!= null){

            if((DaThuc1.soMu == DaThuc2.soMu) && DaThuc1.bien.equals(DaThuc2.bien) == true){
                TongHaiDaThuc.themHangTu(DaThuc1.heSo - DaThuc2.heSo, DaThuc1.soMu, DaThuc1.bien);
                DaThuc1 = DaThuc1.next;
                DaThuc2 = DaThuc2.next;
            } else if(DaThuc1.soMu > DaThuc2.soMu){
                TongHaiDaThuc.themHangTu(DaThuc1.heSo, DaThuc1.soMu, DaThuc1.bien);
                DaThuc1 = DaThuc1.next;
            }else{
                TongHaiDaThuc.themHangTu(DaThuc2.heSo, DaThuc2.soMu, DaThuc2.bien);
                DaThuc2 = DaThuc2.next;
            }
        }

        while(DaThuc1 != null){
            TongHaiDaThuc.themHangTu(DaThuc1.heSo, DaThuc1.soMu, DaThuc1.bien);
            DaThuc1 = DaThuc1.next;
        }

        while(DaThuc2 != null){
            TongHaiDaThuc.themHangTu(DaThuc2.heSo, DaThuc2.soMu, DaThuc2.bien);
            DaThuc2 = DaThuc2.next;
        }
        return TongHaiDaThuc;
    }


    public String show(){
        String tongHaiDaThuc = "";
        HangTu newNode = new HangTu();
        newNode  = head;

        while(newNode != null){
            if(newNode.soMu == 0){
                tongHaiDaThuc += newNode.heSo;
            }else if(newNode.soMu == 1){
                
                    tongHaiDaThuc += (newNode.heSo + newNode.bien);
                
                
            }else{
                tongHaiDaThuc+=(newNode.heSo + newNode.bien + "^" + newNode.soMu);
            }

            if(newNode.next != null){
                if(newNode.next.heSo >=0){
                    tongHaiDaThuc+=(" + ");
                }else{
                    tongHaiDaThuc+=(" ");
                }
            }
            newNode = newNode.next;
        }
        
        return tongHaiDaThuc;

        //System.out.println();
    }
}
