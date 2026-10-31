package io.bidmachine.analytics.internal.E;

import android.database.sqlite.SQLiteDatabase;
import id.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b0;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.E.a$a, reason: collision with other inner class name */
    static final class C0274a extends u implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0274a f16822a = new C0274a();

        C0274a() {
            super(1);
        }

        @Override // id.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Object obj) {
            return "?";
        }
    }

    public static final String a(List list, String str) {
        if (list == null) {
            return null;
        }
        return str + " (" + b0.V(list, ",", null, null, 0, null, C0274a.f16822a, 30, null) + ')';
    }

    public static /* synthetic */ void a(List list, SQLiteDatabase sQLiteDatabase, int i10, l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 100;
        }
        a(list, sQLiteDatabase, i10, lVar);
    }

    public static final void a(List list, SQLiteDatabase sQLiteDatabase, int i10, l lVar) {
        if (list == null) {
            lVar.invoke(null);
            return;
        }
        sQLiteDatabase.beginTransaction();
        try {
            Iterator it = b0.F(list, i10).iterator();
            while (it.hasNext()) {
                lVar.invoke((List) it.next());
            }
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public static final String[] a(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(kotlin.collections.u.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
