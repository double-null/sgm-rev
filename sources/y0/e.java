package y0;

import android.database.sqlite.SQLiteStatement;
import x0.f;

/* JADX INFO: compiled from: FrameworkSQLiteStatement.java */
/* JADX INFO: loaded from: classes.dex */
class e extends d implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SQLiteStatement f28625b;

    e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f28625b = sQLiteStatement;
    }

    @Override // x0.f
    public long P() {
        return this.f28625b.executeInsert();
    }

    @Override // x0.f
    public int l() {
        return this.f28625b.executeUpdateDelete();
    }
}
