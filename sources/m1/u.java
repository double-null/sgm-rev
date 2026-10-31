package m1;

import android.database.Cursor;
import com.applovin.shadow.okio.internal.MoA.edUJlCZxhVnO;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: WorkTagDao_Impl.java */
/* JADX INFO: loaded from: classes2.dex */
public final class u implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.room.h f22125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t0.a<s> f22126b;

    /* JADX INFO: compiled from: WorkTagDao_Impl.java */
    /* JADX INFO: loaded from: classes.dex */
    class a extends t0.a<s> {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // t0.d
        public String d() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // t0.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(x0.f fVar, s sVar) {
            String str = sVar.f22123a;
            if (str == null) {
                fVar.f0(1);
            } else {
                fVar.S(1, str);
            }
            String str2 = sVar.f22124b;
            if (str2 == null) {
                fVar.f0(2);
            } else {
                fVar.S(2, str2);
            }
        }
    }

    public u(androidx.room.h hVar) {
        this.f22125a = hVar;
        this.f22126b = new a(hVar);
    }

    @Override // m1.t
    public void a(s sVar) {
        this.f22125a.b();
        this.f22125a.c();
        try {
            this.f22126b.h(sVar);
            this.f22125a.r();
        } finally {
            this.f22125a.g();
        }
    }

    @Override // m1.t
    public List<String> b(String str) {
        t0.c cVarE = t0.c.e(edUJlCZxhVnO.rbWKnsHiAFgqtDh, 1);
        if (str == null) {
            cVarE.f0(1);
        } else {
            cVarE.S(1, str);
        }
        this.f22125a.b();
        Cursor cursorB = v0.c.b(this.f22125a, cVarE, false, null);
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
