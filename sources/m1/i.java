package m1;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: SystemIdInfoDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.room.h f22057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t0.a<g> f22058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t0.d f22059c;

    /* JADX INFO: compiled from: SystemIdInfoDao_Impl.java */
    class a extends t0.a<g> {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // t0.d
        public String d() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // t0.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(x0.f fVar, g gVar) {
            String str = gVar.f22055a;
            if (str == null) {
                fVar.f0(1);
            } else {
                fVar.S(1, str);
            }
            fVar.X(2, gVar.f22056b);
        }
    }

    /* JADX INFO: compiled from: SystemIdInfoDao_Impl.java */
    class b extends t0.d {
        b(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // t0.d
        public String d() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public i(androidx.room.h hVar) {
        this.f22057a = hVar;
        this.f22058b = new a(hVar);
        this.f22059c = new b(hVar);
    }

    @Override // m1.h
    public g a(String str) {
        t0.c cVarE = t0.c.e("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            cVarE.f0(1);
        } else {
            cVarE.S(1, str);
        }
        this.f22057a.b();
        Cursor cursorB = v0.c.b(this.f22057a, cVarE, false, null);
        try {
            return cursorB.moveToFirst() ? new g(cursorB.getString(v0.b.b(cursorB, "work_spec_id")), cursorB.getInt(v0.b.b(cursorB, "system_id"))) : null;
        } finally {
            cursorB.close();
            cVarE.release();
        }
    }

    @Override // m1.h
    public List<String> b() {
        t0.c cVarE = t0.c.e("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f22057a.b();
        Cursor cursorB = v0.c.b(this.f22057a, cVarE, false, null);
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

    @Override // m1.h
    public void c(String str) {
        this.f22057a.b();
        x0.f fVarA = this.f22059c.a();
        if (str == null) {
            fVarA.f0(1);
        } else {
            fVarA.S(1, str);
        }
        this.f22057a.c();
        try {
            fVarA.l();
            this.f22057a.r();
        } finally {
            this.f22057a.g();
            this.f22059c.f(fVarA);
        }
    }

    @Override // m1.h
    public void d(g gVar) {
        this.f22057a.b();
        this.f22057a.c();
        try {
            this.f22058b.h(gVar);
            this.f22057a.r();
        } finally {
            this.f22057a.g();
        }
    }
}
