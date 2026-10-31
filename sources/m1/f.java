package m1;

import android.database.Cursor;

/* JADX INFO: compiled from: PreferenceDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.room.h f22052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t0.a<d> f22053b;

    /* JADX INFO: compiled from: PreferenceDao_Impl.java */
    class a extends t0.a<d> {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // t0.d
        public String d() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // t0.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(x0.f fVar, d dVar) {
            String str = dVar.f22050a;
            if (str == null) {
                fVar.f0(1);
            } else {
                fVar.S(1, str);
            }
            Long l10 = dVar.f22051b;
            if (l10 == null) {
                fVar.f0(2);
            } else {
                fVar.X(2, l10.longValue());
            }
        }
    }

    public f(androidx.room.h hVar) {
        this.f22052a = hVar;
        this.f22053b = new a(hVar);
    }

    @Override // m1.e
    public void a(d dVar) {
        this.f22052a.b();
        this.f22052a.c();
        try {
            this.f22053b.h(dVar);
            this.f22052a.r();
        } finally {
            this.f22052a.g();
        }
    }

    @Override // m1.e
    public Long b(String str) {
        t0.c cVarE = t0.c.e("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            cVarE.f0(1);
        } else {
            cVarE.S(1, str);
        }
        this.f22052a.b();
        Long lValueOf = null;
        Cursor cursorB = v0.c.b(this.f22052a, cVarE, false, null);
        try {
            if (cursorB.moveToFirst() && !cursorB.isNull(0)) {
                lValueOf = Long.valueOf(cursorB.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorB.close();
            cVarE.release();
        }
    }
}
