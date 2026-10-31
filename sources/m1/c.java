package m1;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: DependencyDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.room.h f22047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t0.a<m1.a> f22048b;

    /* JADX INFO: compiled from: DependencyDao_Impl.java */
    class a extends t0.a<m1.a> {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // t0.d
        public String d() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // t0.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(x0.f fVar, m1.a aVar) {
            String str = aVar.f22045a;
            if (str == null) {
                fVar.f0(1);
            } else {
                fVar.S(1, str);
            }
            String str2 = aVar.f22046b;
            if (str2 == null) {
                fVar.f0(2);
            } else {
                fVar.S(2, str2);
            }
        }
    }

    public c(androidx.room.h hVar) {
        this.f22047a = hVar;
        this.f22048b = new a(hVar);
    }

    @Override // m1.b
    public List<String> a(String str) {
        t0.c cVarE = t0.c.e("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            cVarE.f0(1);
        } else {
            cVarE.S(1, str);
        }
        this.f22047a.b();
        Cursor cursorB = v0.c.b(this.f22047a, cVarE, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.getString(0));
            }
            cursorB.close();
            cVarE.release();
            return arrayList;
        } catch (Throwable th) {
            cursorB.close();
            cVarE.release();
            throw th;
        }
    }

    @Override // m1.b
    public boolean b(String str) {
        t0.c cVarE = t0.c.e("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            cVarE.f0(1);
        } else {
            cVarE.S(1, str);
        }
        this.f22047a.b();
        boolean z10 = false;
        Cursor cursorB = v0.c.b(this.f22047a, cVarE, false, null);
        try {
            if (cursorB.moveToFirst()) {
                z10 = cursorB.getInt(0) != 0;
            }
            return z10;
        } finally {
            cursorB.close();
            cVarE.release();
        }
    }

    @Override // m1.b
    public void c(m1.a aVar) {
        this.f22047a.b();
        this.f22047a.c();
        try {
            this.f22048b.h(aVar);
            this.f22047a.r();
        } finally {
            this.f22047a.g();
        }
    }

    @Override // m1.b
    public boolean d(String str) {
        t0.c cVarE = t0.c.e("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            cVarE.f0(1);
        } else {
            cVarE.S(1, str);
        }
        this.f22047a.b();
        boolean z10 = false;
        Cursor cursorB = v0.c.b(this.f22047a, cVarE, false, null);
        try {
            if (cursorB.moveToFirst()) {
                z10 = cursorB.getInt(0) != 0;
            }
            return z10;
        } finally {
            cursorB.close();
            cVarE.release();
        }
    }
}
