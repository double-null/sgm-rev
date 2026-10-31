package s5;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;
import o5.o;

/* JADX INFO: loaded from: classes4.dex */
public class i implements d.a, r5.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f25262f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f25263a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r5.e f25264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r5.b f25265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private r5.d f25266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f25267e;

    public i(r5.e eVar, r5.b bVar) {
        this.f25264b = eVar;
        this.f25265c = bVar;
    }

    private c a() {
        if (this.f25267e == null) {
            this.f25267e = c.e();
        }
        return this.f25267e;
    }

    public static i d() {
        if (f25262f == null) {
            f25262f = new i(new r5.e(), new r5.b());
        }
        return f25262f;
    }

    public void b(Context context) {
        this.f25266d = this.f25264b.a(new Handler(), context, this.f25265c.a(), this);
    }

    public float c() {
        return this.f25263a;
    }

    public void e() {
        b.k().b(this);
        b.k().i();
        x5.a.p().q();
        this.f25266d.d();
    }

    public void f() {
        x5.a.p().s();
        b.k().j();
        this.f25266d.f();
    }

    @Override // r5.c
    public void a(float f10) {
        this.f25263a = f10;
        Iterator<o> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().l().e(f10);
        }
    }

    @Override // s5.d.a
    public void a(boolean z10) {
        if (z10) {
            x5.a.p().q();
        } else {
            x5.a.p().o();
        }
    }
}
