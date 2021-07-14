package com.example.quanlysinhvienute;

public class Detail {
    String tenmon,gia,chitiet;
    int hinh;

    public Detail(String tenmon, String gia, String chitiet, int hinh) {
        this.tenmon = tenmon;
        this.gia = gia;
        this.chitiet = chitiet;
        this.hinh = hinh;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getChitiet() {
        return chitiet;
    }

    public void setChitiet(String chitiet) {
        this.chitiet = chitiet;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
