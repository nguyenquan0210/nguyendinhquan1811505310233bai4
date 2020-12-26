package com.example.tab_layout_gridview;

public class sanpham {
    private int hinh;
    private String ten;

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public sanpham(int hinh, String ten) {
        this.hinh = hinh;
        this.ten = ten;
    }
}
