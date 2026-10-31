package androidx.room;

import android.database.Cursor;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: RoomOpenHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class i extends x0.c.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.room.a f3545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f3546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f3547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f3548e;

    /* JADX INFO: compiled from: RoomOpenHelper.java */
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3549a;

        public a(int i10) {
            this.f3549a = i10;
        }

        protected abstract void a(x0.b bVar);

        protected abstract void b(x0.b bVar);

        protected abstract void c(x0.b bVar);

        protected abstract void d(x0.b bVar);

        protected abstract void e(x0.b bVar);

        protected abstract void f(x0.b bVar);

        protected abstract b g(x0.b bVar);
    }

    /* JADX INFO: compiled from: RoomOpenHelper.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f3550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f3551b;

        public b(boolean z10, String str) {
            this.f3550a = z10;
            this.f3551b = str;
        }
    }

    public i(androidx.room.a aVar, a aVar2, String str, String str2) {
        super(aVar2.f3549a);
        this.f3545b = aVar;
        this.f3546c = aVar2;
        this.f3547d = str;
        this.f3548e = str2;
    }

    private void h(x0.b bVar) {
        if (!k(bVar)) {
            b bVarG = this.f3546c.g(bVar);
            if (bVarG.f3550a) {
                this.f3546c.e(bVar);
                l(bVar);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + bVarG.f3551b);
            }
        }
        Cursor cursorR = bVar.R(new x0.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = cursorR.moveToFirst() ? cursorR.getString(0) : null;
            cursorR.close();
            if (!this.f3547d.equals(string) && !this.f3548e.equals(string)) {
                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
            }
        } catch (Throwable th) {
            cursorR.close();
            throw th;
        }
    }

    private void i(x0.b bVar) {
        bVar.j("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private static boolean j(x0.b bVar) {
        Cursor cursorC0 = bVar.c0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z10 = false;
            if (cursorC0.moveToFirst() && cursorC0.getInt(0) == 0) {
                z10 = true;
            }
            return z10;
        } finally {
            cursorC0.close();
        }
    }

    private static boolean k(x0.b bVar) {
        Cursor cursorC0 = bVar.c0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z10 = false;
            if (cursorC0.moveToFirst() && cursorC0.getInt(0) != 0) {
                z10 = true;
            }
            return z10;
        } finally {
            cursorC0.close();
        }
    }

    private void l(x0.b bVar) {
        i(bVar);
        bVar.j(t0.b.a(this.f3547d));
    }

    @Override // x0.c.a
    public void b(x0.b bVar) {
        super.b(bVar);
    }

    @Override // x0.c.a
    public void d(x0.b bVar) {
        boolean zJ = j(bVar);
        this.f3546c.a(bVar);
        if (!zJ) {
            b bVarG = this.f3546c.g(bVar);
            if (!bVarG.f3550a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + bVarG.f3551b);
            }
        }
        l(bVar);
        this.f3546c.c(bVar);
    }

    @Override // x0.c.a
    public void e(x0.b bVar, int i10, int i11) {
        g(bVar, i10, i11);
    }

    @Override // x0.c.a
    public void f(x0.b bVar) {
        super.f(bVar);
        h(bVar);
        this.f3546c.d(bVar);
        this.f3545b = null;
    }

    @Override // x0.c.a
    public void g(x0.b bVar, int i10, int i11) {
        boolean z10;
        List<u0.a> listC;
        androidx.room.a aVar = this.f3545b;
        if (aVar == null || (listC = aVar.f3451d.c(i10, i11)) == null) {
            z10 = false;
        } else {
            this.f3546c.f(bVar);
            Iterator<u0.a> it = listC.iterator();
            while (it.hasNext()) {
                it.next().a(bVar);
            }
            b bVarG = this.f3546c.g(bVar);
            if (!bVarG.f3550a) {
                throw new IllegalStateException("Migration didn't properly handle: " + bVarG.f3551b);
            }
            this.f3546c.e(bVar);
            l(bVar);
            z10 = true;
        }
        if (z10) {
            return;
        }
        androidx.room.a aVar2 = this.f3545b;
        if (aVar2 != null && !aVar2.a(i10, i11)) {
            this.f3546c.b(bVar);
            this.f3546c.a(bVar);
            return;
        }
        throw new IllegalStateException("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }
}
