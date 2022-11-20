package com.example.ejercicio2_1.configuraciones;

public class BDTransacciones {
    public static final String NameDataBase = "GrabarVideos";
    public static final String tablaGVideo = "tblGrabVideo";
    public static final String id = "id";
    public static final String video = "video";
    public static final String CreateTableGVideo = "CREATE TABLE tblGrabVideo (id INTEGER PRIMARY KEY AUTOINCREMENT,video BLOB)";
    public static final String DropTableGVideo = "DROP TABLE IF EXISTS tblGrabVideo";
    public static final String test1 = "select * from tblGrabVideo";
}
