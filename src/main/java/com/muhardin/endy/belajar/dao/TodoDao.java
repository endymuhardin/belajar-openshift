package com.muhardin.endy.belajar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import com.muhardin.endy.belajar.Todo;

public class TodoDao {
    private static final String OPENSHIFT_DB_HOST = "OPENSHIFT_MYSQL_HOST";
    private static final String OPENSHIFT_DB_NAME = "aplikasitodo";
    private static final String OPENSHIFT_DB_USERNAME = "admin3KBMI8e";
    private static final String OPENSHIFT_DB_PASSWORD = "gA_kt6b2LRVM";

    private Connection koneksiDatabase;

    private void connect() throws Exception {
        String host = System.getenv(OPENSHIFT_DB_HOST);
        String url = "jdbc:mysql://"+host+"/"+OPENSHIFT_DB_NAME;
        
        koneksiDatabase = DriverManager.getConnection(url, OPENSHIFT_DB_USERNAME, OPENSHIFT_DB_PASSWORD);
    }
    
    private void disconnect() throws Exception {
        if(koneksiDatabase != null){
            koneksiDatabase.close();
        }
    }
    
    public List<Todo> semuaTodo(){
        List<Todo> hasil = new ArrayList<Todo>();
            
        try {
            connect();
            String sql = "select * from todo order by keterangan";
            ResultSet rs = koneksiDatabase.createStatement().executeQuery(sql);
            
            while(rs.next()){
                Todo t = new Todo();
                t.setId(rs.getInt("id"));
                t.setKeterangan(rs.getString("keterangan"));
                t.setSelesai(rs.getBoolean("selesai"));
                hasil.add(t);
            }
            
            rs.close();
            disconnect();
        } catch (Exception err) {
            err.printStackTrace();
        }
        
        return hasil;
    }
}   
