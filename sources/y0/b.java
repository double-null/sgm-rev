package y0;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;

/* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.java */
/* JADX INFO: loaded from: classes.dex */
class b implements x0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f28612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x0.c.a f28614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f28615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f28616e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f28617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f28618g;

    /* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.java */
    static class a extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final y0.a[] f28619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final x0.c.a f28620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f28621c;

        /* JADX INFO: renamed from: y0.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.java */
        class C0484a implements DatabaseErrorHandler {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ x0.c.a f28622a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ y0.a[] f28623b;

            C0484a(x0.c.a aVar, y0.a[] aVarArr) {
                this.f28622a = aVar;
                this.f28623b = aVarArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f28622a.c(a.c(this.f28623b, sQLiteDatabase));
            }
        }

        a(Context context, String str, y0.a[] aVarArr, x0.c.a aVar) {
            super(context, str, null, aVar.f27936a, new C0484a(aVar, aVarArr));
            this.f28620b = aVar;
            this.f28619a = aVarArr;
        }

        static y0.a c(y0.a[] aVarArr, SQLiteDatabase sQLiteDatabase) {
            y0.a aVar = aVarArr[0];
            if (aVar == null || !aVar.b(sQLiteDatabase)) {
                aVarArr[0] = new y0.a(sQLiteDatabase);
            }
            return aVarArr[0];
        }

        y0.a b(SQLiteDatabase sQLiteDatabase) {
            return c(this.f28619a, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.f28619a[0] = null;
        }

        synchronized x0.b e() {
            this.f28621c = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (!this.f28621c) {
                return b(writableDatabase);
            }
            close();
            return e();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f28620b.b(b(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f28620b.d(b(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f28621c = true;
            this.f28620b.e(b(sQLiteDatabase), i10, i11);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.f28621c) {
                return;
            }
            this.f28620b.f(b(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f28621c = true;
            this.f28620b.g(b(sQLiteDatabase), i10, i11);
        }
    }

    b(Context context, String str, x0.c.a aVar, boolean z10) {
        this.f28612a = context;
        this.f28613b = str;
        this.f28614c = aVar;
        this.f28615d = z10;
    }

    private a b() {
        a aVar;
        synchronized (this.f28616e) {
            if (this.f28617f == null) {
                y0.a[] aVarArr = new y0.a[1];
                if (this.f28613b == null || !this.f28615d) {
                    this.f28617f = new a(this.f28612a, this.f28613b, aVarArr, this.f28614c);
                } else {
                    this.f28617f = new a(this.f28612a, new File(this.f28612a.getNoBackupFilesDir(), this.f28613b).getAbsolutePath(), aVarArr, this.f28614c);
                }
                this.f28617f.setWriteAheadLoggingEnabled(this.f28618g);
            }
            aVar = this.f28617f;
        }
        return aVar;
    }

    @Override // x0.c
    public x0.b b0() {
        return b().e();
    }

    @Override // x0.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b().close();
    }

    @Override // x0.c
    public String getDatabaseName() {
        return this.f28613b;
    }

    @Override // x0.c
    public void setWriteAheadLoggingEnabled(boolean z10) {
        synchronized (this.f28616e) {
            a aVar = this.f28617f;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z10);
            }
            this.f28618g = z10;
        }
    }
}
