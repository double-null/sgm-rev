package io.bidmachine.analytics.internal.D;

import android.database.sqlite.SQLiteDatabase;
import java.util.Date;
import kotlin.jvm.internal.u;
import wc.k;
import wc.m;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements io.bidmachine.analytics.internal.D.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SQLiteDatabase f16813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f16814b = m.a(new a());

    static final class a extends u implements id.a {
        a() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.analytics.internal.B.a invoke() {
            return new io.bidmachine.analytics.internal.B.a(b.this.f16813a);
        }
    }

    public b(SQLiteDatabase sQLiteDatabase) {
        this.f16813a = sQLiteDatabase;
    }

    private final io.bidmachine.analytics.internal.B.a a() {
        return (io.bidmachine.analytics.internal.B.a) this.f16814b.getValue();
    }

    @Override // io.bidmachine.analytics.internal.D.a
    public Object a(io.bidmachine.analytics.internal.g.c cVar) {
        return a().a(io.bidmachine.analytics.internal.C.b.b(cVar));
    }

    @Override // io.bidmachine.analytics.internal.D.a
    public Object a(String str) {
        return a().b(str);
    }

    @Override // io.bidmachine.analytics.internal.D.a
    public Object a(long j10) {
        return a().a(io.bidmachine.analytics.internal.E.e.a(new Date(System.currentTimeMillis() - sd.a.p(j10))));
    }
}
