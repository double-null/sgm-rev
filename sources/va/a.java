package va;

import android.content.Context;
import android.view.View;
import fb.b;
import kotlin.jvm.internal.t;
import la.g;
import mb.c;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends qa.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final c f27468s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, Object assetsHolder, g repository, pb.a adElementParams, qa.c adFormListener, b eventCallback, db.a aVar) {
        super(context, assetsHolder, repository, adElementParams, adFormListener, eventCallback, aVar);
        t.f(context, "context");
        t.f(assetsHolder, "assetsHolder");
        t.f(repository, "repository");
        t.f(adElementParams, "adElementParams");
        t.f(adFormListener, "adFormListener");
        t.f(eventCallback, "eventCallback");
        this.f27468s = new c(context);
    }

    @Override // qa.a
    public View J() {
        return this.f27468s;
    }

    @Override // pa.d0, pa.x
    public void a(long j10, long j11, float f10) {
        this.f27468s.a(j10, j11, f10);
    }

    @Override // pa.d
    public void b() {
        E().e(this);
    }
}
