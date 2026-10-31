package x0;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: SupportSQLiteOpenHelper.java */
/* JADX INFO: loaded from: classes.dex */
public interface c extends Closeable {

    /* JADX INFO: compiled from: SupportSQLiteOpenHelper.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f27937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f27938b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f27939c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f27940d;

        /* JADX INFO: compiled from: SupportSQLiteOpenHelper.java */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Context f27941a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            String f27942b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            a f27943c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            boolean f27944d;

            a(Context context) {
                this.f27941a = context;
            }

            public b a() {
                if (this.f27943c == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.f27941a == null) {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                if (this.f27944d && TextUtils.isEmpty(this.f27942b)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.f27941a, this.f27942b, this.f27943c, this.f27944d);
            }

            public a b(a aVar) {
                this.f27943c = aVar;
                return this;
            }

            public a c(String str) {
                this.f27942b = str;
                return this;
            }

            public a d(boolean z10) {
                this.f27944d = z10;
                return this;
            }
        }

        b(Context context, String str, a aVar, boolean z10) {
            this.f27937a = context;
            this.f27938b = str;
            this.f27939c = aVar;
            this.f27940d = z10;
        }

        public static a a(Context context) {
            return new a(context);
        }
    }

    /* JADX INFO: renamed from: x0.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SupportSQLiteOpenHelper.java */
    public interface InterfaceC0464c {
        c a(b bVar);
    }

    x0.b b0();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z10);

    /* JADX INFO: compiled from: SupportSQLiteOpenHelper.java */
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f27936a;

        public a(int i10) {
            this.f27936a = i10;
        }

        private void a(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e10) {
                Log.w("SupportSQLite", "delete failed: ", e10);
            }
        }

        public void c(x0.b bVar) {
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + bVar.getPath());
            if (!bVar.isOpen()) {
                a(bVar.getPath());
                return;
            }
            List<Pair<String, String>> listI = null;
            try {
                try {
                    listI = bVar.i();
                } catch (SQLiteException unused) {
                }
                try {
                    bVar.close();
                } catch (IOException unused2) {
                }
            } finally {
                if (listI != null) {
                    Iterator<Pair<String, String>> it = listI.iterator();
                    while (it.hasNext()) {
                        a((String) it.next().second);
                    }
                } else {
                    a(bVar.getPath());
                }
            }
        }

        public abstract void d(x0.b bVar);

        public abstract void e(x0.b bVar, int i10, int i11);

        public abstract void g(x0.b bVar, int i10, int i11);

        public void b(x0.b bVar) {
        }

        public void f(x0.b bVar) {
        }
    }
}
