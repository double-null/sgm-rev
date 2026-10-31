package m1;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: WorkNameDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.room.h f22064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t0.a<j> f22065b;

    /* JADX INFO: compiled from: WorkNameDao_Impl.java */
    class a extends t0.a<j> {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // t0.d
        public String d() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // t0.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(x0.f fVar, j jVar) {
            String str = jVar.f22062a;
            if (str == null) {
                fVar.f0(1);
            } else {
                fVar.S(1, str);
            }
            String str2 = jVar.f22063b;
            if (str2 == null) {
                fVar.f0(2);
            } else {
                fVar.S(2, str2);
            }
        }
    }

    public l(androidx.room.h hVar) {
        this.f22064a = hVar;
        this.f22065b = new a(hVar);
    }

    @Override // m1.k
    public void a(j jVar) {
        this.f22064a.b();
        this.f22064a.c();
        try {
            this.f22065b.h(jVar);
            this.f22064a.r();
        } finally {
            this.f22064a.g();
        }
    }

    @Override // m1.k
    public List<String> b(String str) {
        t0.c cVarE = t0.c.e("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            cVarE.f0(1);
        } else {
            cVarE.S(1, str);
        }
        this.f22064a.b();
        Cursor cursorB = v0.c.b(this.f22064a, cVarE, false, null);
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
}
