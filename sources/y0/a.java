package y0;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.IOException;
import java.util.List;
import x0.f;

/* JADX INFO: compiled from: FrameworkSQLiteDatabase.java */
/* JADX INFO: loaded from: classes.dex */
class a implements x0.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f28605b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f28606c = new String[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SQLiteDatabase f28607a;

    /* JADX INFO: renamed from: y0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FrameworkSQLiteDatabase.java */
    class C0483a implements SQLiteDatabase.CursorFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ x0.e f28608a;

        C0483a(x0.e eVar) {
            this.f28608a = eVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f28608a.b(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* JADX INFO: compiled from: FrameworkSQLiteDatabase.java */
    class b implements SQLiteDatabase.CursorFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ x0.e f28610a;

        b(x0.e eVar) {
            this.f28610a = eVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f28610a.b(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    a(SQLiteDatabase sQLiteDatabase) {
        this.f28607a = sQLiteDatabase;
    }

    @Override // x0.b
    public void A() {
        this.f28607a.endTransaction();
    }

    @Override // x0.b
    public Cursor R(x0.e eVar) {
        return this.f28607a.rawQueryWithFactory(new C0483a(eVar), eVar.c(), f28606c, null);
    }

    @Override // x0.b
    public f T(String str) {
        return new e(this.f28607a.compileStatement(str));
    }

    @Override // x0.b
    public void a() {
        this.f28607a.beginTransaction();
    }

    boolean b(SQLiteDatabase sQLiteDatabase) {
        return this.f28607a == sQLiteDatabase;
    }

    @Override // x0.b
    public Cursor c0(String str) {
        return R(new x0.a(str));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f28607a.close();
    }

    @Override // x0.b
    public Cursor g0(x0.e eVar, CancellationSignal cancellationSignal) {
        return this.f28607a.rawQueryWithFactory(new b(eVar), eVar.c(), f28606c, null, cancellationSignal);
    }

    @Override // x0.b
    public String getPath() {
        return this.f28607a.getPath();
    }

    @Override // x0.b
    public boolean h0() {
        return this.f28607a.inTransaction();
    }

    @Override // x0.b
    public List<Pair<String, String>> i() {
        return this.f28607a.getAttachedDbs();
    }

    @Override // x0.b
    public boolean isOpen() {
        return this.f28607a.isOpen();
    }

    @Override // x0.b
    public void j(String str) throws SQLException {
        this.f28607a.execSQL(str);
    }

    @Override // x0.b
    public void w() {
        this.f28607a.setTransactionSuccessful();
    }

    @Override // x0.b
    public void x(String str, Object[] objArr) throws SQLException {
        this.f28607a.execSQL(str, objArr);
    }
}
