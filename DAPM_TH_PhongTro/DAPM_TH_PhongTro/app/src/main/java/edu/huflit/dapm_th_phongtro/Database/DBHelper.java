package edu.huflit.dapm_th_phongtro.Database;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


import java.util.ArrayList;
import java.util.Random;

public class DBHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "PhongTro.db";
    private static final int DATABASE_VERSION = 2;

    // Table ChiTietHoaDon
    public static final String TABLE_CHITIETHOADON = "ChiTietHoaDon";
    public static final String COLUMN_CHITIETID = "chitietid";
    public static final String COLUMN_HOADONID = "hoadonid";
    public static final String COLUMN_PHONGID = "phongid";
    public static final String COLUMN_GIATHUE = "giathue";
    public static final String COLUMN_TIENDIEN = "tiendien";
    public static final String COLUMN_TIENNUOC = "tiennuoc";
    public static final String COLUMN_NGAY = "ngay";
    public static final String COLUMN_TRANGTHAI = "trangthai";

    // Table HoaDon
    public static final String TABLE_HOADON = "HoaDon";
    public static final String COLUMN_HOADON_HOADONID = "hoadonid";
    public static final String COLUMN_NGAYHOADON = "ngayhoadon";
    public static final String COLUMN_TRANGTHAIHOADON = "trangthaihoadon";
    public static final String COLUMN_HOADON_PHONGID = "phongid";

    // Table PhongTro
    public static final String TABLE_PHONGTRO = "PhongTro";
    public static final String COLUMN_PHONGID_PHONG = "phongid";
    public static final String COLUMN_TENPHONG = "tenphong";
    public static final String COLUMN_MOTAPHONG = "motaphong";
    public static final String COLUMN_TIENCOC_PHONG = "tiencoc";
    public static final String COLUMN_DIENTICH_PHONG = "dientich";
    public static final String COLUMN_GIATHUE_PHONG = "giathuephong";
    public static final String COLUMN_TRANGTHAI_PHONG = "trangthaiphong";
    public static final String COLUMN_NGUOITHUEID = "nguoithueid";

    /*// Table ToaNha
    public static final String TABLE_TOANHA = "ToaNha";
    public static final String COLUMN_TOANHAID = "toanhaid";
    public static final String COLUMN_TENTOANHA = "tentoanha";
    public static final String COLUMN_MOTATOANHA = "mota";
    public static final String COLUMN_DIACHITOANHA = "diachi";
    public static final String COLUMN_TOANHA_PHONGID = "phongid";*/

    // Table TaiKhoan
    public static final String TABLE_TAIKHOAN = "TaiKhoan";
    public static final String COLUMN_NGUOIDUNGID = "nguoidungid";
    public static final String COLUMN_TENNGUOIDUNG = "tennguoidung";
    public static final String COLUMN_SDT = "sdt";
    public static final String COLUMN_TENDANGNHAP = "tendangnhap";
    public static final String COLUMN_MATKHAU = "matkhau";
    public static final String COLUMN_PHONGID_TAIKHOAN = "phongid";
    public static final String COLUMN_ROLE = "role";

    // Table SuCo
    public static final String TABLE_SUCO = "SuCo";
    public static final String COLUMN_SUCOID = "sucoid";
    public static final String COLUMN_TENSUCO = "tensuco";
    public static final String COLUMN_MOTASUCO = "motasuco";
    public static final String COLUMN_TRANGTHAISUCO = "trangthaisuco";
    public static final String COLUMN_PHONGID_SUCO = "phongid";
    public static final String COLUMN_NGUOIDUNGID_SUCO = "nguoidungid";

    // Table ThongBaoSuCo
    public static final String TABLE_THONGBAO_SUCO = "ThongBaoSuCo";
    public static final String COLUMN_THONGBAO_SUCOID = "thongbao_sucoid";
    public static final String COLUMN_THONGBAO_SUCOTEN = "thongbao_sucoten";
    public static final String COLUMN_THONGBAO_SUCONGAY = "thongbao_sucongay";
    public static final String COLUMN_PHONGID_THONGBAO_SUCO = "phongid";
    public static final String COLUMN_NGUOIDUNGID_THONGBAO_SUCO = "nguoidungid";


    // Table HopDong
    public static final String TABLE_HOPDONG = "HopDong";
    public static final String COLUMN_HOPDONGID = "hopdong_id";
    public static final String COLUMN_HOPDONGTEN = "hopdong_ten";
    public static final String COLUMN_HOPDONGTIENDIEN = "hopdong_tiendien";
    public static final String COLUMN_HOPDONGTIENNUOC = "hopdong_tiennuoc";
    public static final String COLUMN_HOPDONGTIENPHONG = "hopdong_tienphong";
    public static final String COLUMN_HOPDONGTIENCOC = "hopdong_tiencoc";
    public static final String COLUMN_HOPDONGNOIDUNG = "hopdong_noidung";
    public static final String COLUMN_HOPDONGNGAYBATDAU = "hopdong_ngaybatdau";
    public static final String COLUMN_HOPDONGNGAYKETTHUC = "hopdong_ngayketthuc";
    public static final String COLUMN_HOPDONGTENNGUOITHUE = "hopdong_tennguoithue";
    public static final String COLUMN_HOPDONGCCCDNGUOITHUE = "hopdong_cccdnguoithue";
    public static final String COLUMN_HOPDONGTENCHUTRO = "hopdong_tenchutro";
    public static final String COLUMN_HOPDONGCCCDCHUTRO = "hopdong_cccdchutro";
    public static final String COLUMN_TRANGTHAIHOPDONG = "hopdong_trangthai";
    public static final String COLUMN_PHONGID_HOPDONG = "phongid";
    public static final String COLUMN_NGUOIDUNGID_HOPDONG = "nguoidungid";


    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        String createChiTietHoaDonTable = "CREATE TABLE " + TABLE_CHITIETHOADON + "(" +
                COLUMN_CHITIETID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_HOADONID + " INTEGER, " +
                COLUMN_PHONGID + " INTEGER, " +
                COLUMN_GIATHUE + " INTEGER, " +
                COLUMN_TIENDIEN + " INTEGER, " +
                COLUMN_TIENNUOC + " INTEGER, " +
                COLUMN_NGAY + " TEXT, " +
                COLUMN_TRANGTHAI + " INTEGER, " +
                "FOREIGN KEY(" + COLUMN_HOADONID + ") REFERENCES " + TABLE_HOADON + "(" + COLUMN_HOADON_HOADONID + "), " +
                "FOREIGN KEY(" + COLUMN_PHONGID + ") REFERENCES " + TABLE_PHONGTRO + "(" + COLUMN_PHONGID_PHONG + ")" +
                ")";
        db.execSQL(createChiTietHoaDonTable);

        String createHoaDonTable = "CREATE TABLE " + TABLE_HOADON + "(" +
                COLUMN_HOADON_HOADONID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_NGAYHOADON + " TEXT, " +
                COLUMN_TRANGTHAIHOADON + " INTEGER, " +
                COLUMN_HOADON_PHONGID + " INTEGER, " +
                "FOREIGN KEY(" + COLUMN_HOADON_PHONGID + ") REFERENCES " + TABLE_PHONGTRO + "(" + COLUMN_PHONGID_PHONG + ")" +
                ")";
        db.execSQL(createHoaDonTable);

        String createPhongTroTable = "CREATE TABLE " + TABLE_PHONGTRO + "(" +
                COLUMN_PHONGID_PHONG + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_TENPHONG + " TEXT, " +
                COLUMN_MOTAPHONG + " TEXT, " +
                COLUMN_TIENCOC_PHONG + " INTEGER, " +
                COLUMN_DIENTICH_PHONG + " INTEGER, " +
                COLUMN_GIATHUE_PHONG + " INTEGER, " +
                COLUMN_TRANGTHAI_PHONG + " INTEGER, " +
                COLUMN_NGUOITHUEID + " INTEGER" +
                ")";
        db.execSQL(createPhongTroTable);

        String createTaiKhoanTable = "CREATE TABLE " + TABLE_TAIKHOAN + "(" +
                COLUMN_NGUOIDUNGID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_TENNGUOIDUNG + " TEXT, " +
                COLUMN_SDT + " INT, " +
                COLUMN_TENDANGNHAP + " TEXT, " +
                COLUMN_MATKHAU + " TEXT, " +
                COLUMN_PHONGID_TAIKHOAN + " INTEGER, " +
                COLUMN_ROLE + " INTEGER" +
                ")";
        db.execSQL(createTaiKhoanTable);

        String createSuCoTable = "CREATE TABLE " + TABLE_SUCO + "(" +
                COLUMN_SUCOID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_TENSUCO + " TEXT, " +
                COLUMN_MOTASUCO + " TEXT, " +
                COLUMN_TRANGTHAISUCO + " INTEGER, " +
                COLUMN_PHONGID_SUCO + " INTEGER, " +
                COLUMN_NGUOIDUNGID_SUCO + " INTEGER, " +
                "FOREIGN KEY(" + COLUMN_PHONGID_SUCO + ") REFERENCES " + TABLE_PHONGTRO + "(" + COLUMN_PHONGID_PHONG + "), " +
                "FOREIGN KEY(" + COLUMN_NGUOIDUNGID_SUCO + ") REFERENCES " + TABLE_TAIKHOAN + "(" + COLUMN_NGUOIDUNGID + ")" +
                ")";
        db.execSQL(createSuCoTable);

        String createThongBaoSuCoTable = "CREATE TABLE " + TABLE_THONGBAO_SUCO + "(" +
                COLUMN_THONGBAO_SUCOID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_THONGBAO_SUCOTEN + " TEXT, " +
                COLUMN_THONGBAO_SUCONGAY + " TEXT, " +
                COLUMN_PHONGID_THONGBAO_SUCO + " INTEGER, " +
                COLUMN_NGUOIDUNGID_THONGBAO_SUCO + " INTEGER, " +
                "FOREIGN KEY(" + COLUMN_PHONGID_THONGBAO_SUCO + ") REFERENCES " + TABLE_PHONGTRO + "(" + COLUMN_PHONGID_PHONG + "), " +
                "FOREIGN KEY(" + COLUMN_NGUOIDUNGID_THONGBAO_SUCO + ") REFERENCES " + TABLE_TAIKHOAN + "(" + COLUMN_NGUOIDUNGID + ")" +
                ")";
        db.execSQL(createThongBaoSuCoTable);

        /*String createThongBaoTable = "CREATE TABLE " + TABLE_THONGBAO + "(" +
                COLUMN_THONGBAOID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_THONGBAONOIDUNG + " TEXT, " +
                COLUMN_THONGBAONGAY + " TEXT, " +
                COLUMN_NGUOIDUNGID_THONGBAO + " INTEGER, " +
                "FOREIGN KEY(" + COLUMN_NGUOIDUNGID_THONGBAO + ") REFERENCES " + TABLE_TAIKHOAN + "(" + COLUMN_NGUOIDUNGID + ")" +
                ")";
        db.execSQL(createThongBaoTable);*/

        String createHopDongTable = "CREATE TABLE " + TABLE_HOPDONG + "(" +
                COLUMN_HOPDONGID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_HOPDONGTEN + " TEXT, " +
                COLUMN_HOPDONGTIENDIEN + " INTEGER, " +
                COLUMN_HOPDONGTIENNUOC + " INTEGER, " +
                COLUMN_HOPDONGTIENPHONG + " INTEGER, " +
                COLUMN_HOPDONGTIENCOC + " INTEGER, " +
                COLUMN_HOPDONGNOIDUNG + " TEXT, " +
                COLUMN_HOPDONGNGAYBATDAU + " TEXT, " +
                COLUMN_HOPDONGNGAYKETTHUC + " TEXT, " +
                COLUMN_HOPDONGTENNGUOITHUE + " TEXT, " +
                COLUMN_HOPDONGTENCHUTRO + " TEXT, " +
                COLUMN_HOPDONGCCCDNGUOITHUE + " INTEGER, " +
                COLUMN_HOPDONGCCCDCHUTRO + " INTEGER, " +
                COLUMN_TRANGTHAIHOPDONG + " INTEGER, " +
                COLUMN_PHONGID_HOPDONG + " INTEGER, " +
                COLUMN_NGUOIDUNGID_HOPDONG + " INTEGER, " +
                "FOREIGN KEY(" + COLUMN_PHONGID_HOPDONG + ") REFERENCES " + TABLE_PHONGTRO + "(" + COLUMN_PHONGID_PHONG + "), " +
                "FOREIGN KEY(" + COLUMN_NGUOIDUNGID_HOPDONG + ") REFERENCES " + TABLE_TAIKHOAN + "(" + COLUMN_NGUOIDUNGID + ")" +
                ")";
        db.execSQL(createHopDongTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion < 2) {
            // Nếu phiên bản cũ nhỏ hơn 2, thêm cột "trangthai" vào bảng "PhongTro"
            db.execSQL("ALTER TABLE " + TABLE_PHONGTRO + " ADD COLUMN trangthai INTEGER");
        }
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_CHITIETHOADON);
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_HOADON);
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_PHONGTRO);
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_TAIKHOAN);
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_SUCO);
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_THONGBAO_SUCO);
            /*db.execSQL("DROP TABLE IF EXISTS " + TABLE_THONGBAO);*/
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_HOPDONG);
            onCreate(db);

    }


}
