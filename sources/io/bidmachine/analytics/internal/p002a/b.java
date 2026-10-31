package io.bidmachine.analytics.internal.p002a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import io.bidmachine.analytics.internal.D.f;
import kotlin.jvm.internal.u;
import wc.k;
import wc.m;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f16846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f16847b = m.a(new a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f16848c = m.a(new d());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f16849d = m.a(new e());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f16850e = m.a(new c());

    static final class a extends u implements id.a {
        a() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SQLiteDatabase invoke() {
            return b.this.b().getWritableDatabase();
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.a.b$b, reason: collision with other inner class name */
    static final class C0277b extends u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f16852a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0277b(Context context) {
            super(0);
            this.f16852a = context;
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.analytics.internal.A.a invoke() {
            return new io.bidmachine.analytics.internal.A.a(this.f16852a.getApplicationContext());
        }
    }

    static final class c extends u implements id.a {
        c() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.analytics.internal.D.b invoke() {
            return new io.bidmachine.analytics.internal.D.b(b.this.a());
        }
    }

    static final class d extends u implements id.a {
        d() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.analytics.internal.D.d invoke() {
            io.bidmachine.analytics.internal.D.d dVar = new io.bidmachine.analytics.internal.D.d(b.this.a());
            dVar.b();
            return dVar;
        }
    }

    static final class e extends u implements id.a {
        e() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f invoke() {
            f fVar = new f(b.this.a());
            fVar.b();
            return fVar;
        }
    }

    public b(Context context) {
        this.f16846a = m.a(new C0277b(context));
    }

    public final io.bidmachine.analytics.internal.D.a c() {
        return (io.bidmachine.analytics.internal.D.a) this.f16850e.getValue();
    }

    public final io.bidmachine.analytics.internal.D.c d() {
        return (io.bidmachine.analytics.internal.D.c) this.f16848c.getValue();
    }

    public final io.bidmachine.analytics.internal.D.e e() {
        return (io.bidmachine.analytics.internal.D.e) this.f16849d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SQLiteDatabase a() {
        return (SQLiteDatabase) this.f16847b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final io.bidmachine.analytics.internal.A.a b() {
        return (io.bidmachine.analytics.internal.A.a) this.f16846a.getValue();
    }
}
