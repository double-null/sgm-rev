package y0;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: compiled from: FrameworkSQLiteProgram.java */
/* JADX INFO: loaded from: classes.dex */
class d implements x0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SQLiteProgram f28624a;

    d(SQLiteProgram sQLiteProgram) {
        this.f28624a = sQLiteProgram;
    }

    @Override // x0.d
    public void S(int i10, String str) {
        this.f28624a.bindString(i10, str);
    }

    @Override // x0.d
    public void X(int i10, long j10) {
        this.f28624a.bindLong(i10, j10);
    }

    @Override // x0.d
    public void Z(int i10, byte[] bArr) {
        this.f28624a.bindBlob(i10, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f28624a.close();
    }

    @Override // x0.d
    public void f0(int i10) {
        this.f28624a.bindNull(i10);
    }

    @Override // x0.d
    public void q(int i10, double d10) {
        this.f28624a.bindDouble(i10, d10);
    }
}
