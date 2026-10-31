package e5;

import a5.p;
import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class i implements d.a, d5.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f14482f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f14483a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d5.e f14484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d5.b f14485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d5.d f14486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f14487e;

    public i(d5.e eVar, d5.b bVar) {
        this.f14484b = eVar;
        this.f14485c = bVar;
    }

    private c a() {
        if (this.f14487e == null) {
            this.f14487e = c.e();
        }
        return this.f14487e;
    }

    public static i d() {
        if (f14482f == null) {
            f14482f = new i(new d5.e(), new d5.b());
        }
        return f14482f;
    }

    public void b(Context context) {
        this.f14486d = this.f14484b.a(new Handler(), context, this.f14485c.a(), this);
    }

    public float c() {
        return this.f14483a;
    }

    public void e() {
        b.k().b(this);
        b.k().i();
        j5.a.p().q();
        this.f14486d.d();
    }

    public void f() {
        j5.a.p().s();
        b.k().j();
        this.f14486d.f();
    }

    @Override // d5.c
    public void a(float f10) {
        this.f14483a = f10;
        Iterator<p> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().m().e(f10);
        }
    }

    @Override // e5.d.a
    public void a(boolean z10) {
        if (z10) {
            j5.a.p().q();
        } else {
            j5.a.p().o();
        }
    }
}
