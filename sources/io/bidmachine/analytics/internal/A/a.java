package io.bidmachine.analytics.internal.A;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import fd.b;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import wc.g0;
import wc.r;
import wc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0270a f16781a = new C0270a(null);

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.A.a$a, reason: collision with other inner class name */
    public static final class C0270a {
        public /* synthetic */ C0270a(k kVar) {
            this();
        }

        private C0270a() {
        }
    }

    public a(Context context) {
        super(context, "BMAnalytics.db", (SQLiteDatabase.CursorFactory) null, 3);
    }

    private final Object a(SQLiteDatabase sQLiteDatabase) {
        try {
            r.a aVar = r.f27774b;
            Cursor cursorQuery = sQLiteDatabase.query("sqlite_master", new String[]{"name"}, "type = ?", new String[]{"table"}, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    try {
                        r.a aVar2 = r.f27774b;
                        String string = cursorQuery.getString(0);
                        if (!t.a(string, "android_metadata") && !t.a(string, "sqlite_master")) {
                            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + string);
                        }
                        r.c(g0.f27756a);
                    } catch (Throwable th) {
                        r.a aVar3 = r.f27774b;
                        r.c(s.a(th));
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        b.a(cursorQuery, th2);
                        throw th3;
                    }
                }
            }
            g0 g0Var = g0.f27756a;
            b.a(cursorQuery, null);
            return r.c(g0Var);
        } catch (Throwable th4) {
            r.a aVar4 = r.f27774b;
            return r.c(s.a(th4));
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE monitor_record (id TEXT,name TEXT,timestamp INTEGER,session_id TEXT,data BLOB,error BLOB,is_reserved INTEGER DEFAULT 0)");
        sQLiteDatabase.execSQL("CREATE TABLE reader_record (id TEXT,name TEXT,timestamp INTEGER,data_hash TEXT,rule TEXT,error BLOB,is_dirty INTEGER,is_reserved INTEGER DEFAULT 0)");
        sQLiteDatabase.execSQL("CREATE TABLE irec (id TEXT,sid TEXT,itm TEXT,iat INTEGER,irv INTEGER,itp INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        onUpgrade(sQLiteDatabase, i10, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        a(sQLiteDatabase);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS monitor_record");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS reader_record");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS irec");
        onCreate(sQLiteDatabase);
    }
}
