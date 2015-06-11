package com.muhardin.endy.belajar;

public class Todo {
    private Integer id;
    private String keterangan;
    private Boolean selesai;
    
    public Integer getId(){
        return id;
    }
    
    public void setId(Integer id){
        this.id = id;
    }
    
    
    public String getKeterangan(){
        return keterangan;
    }
    
    public void setKeterangan(String keterangan){
        this.keterangan = keterangan;
    }
    
    
    public Boolean getSelesai(){
        return selesai;
    }
    
    public void setSelesai(Boolean selesai){
        this.selesai = selesai;
    }
}
