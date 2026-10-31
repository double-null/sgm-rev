package e5;

import a5.p;
import android.content.Context;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f14457f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected i5.f f14458a = new i5.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f14459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f14460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f14461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f14462e;

    private a(d dVar) {
        this.f14461d = dVar;
    }

    public static a a() {
        return f14457f;
    }

    private void d() {
        if (!this.f14460c || this.f14459b == null) {
            return;
        }
        Iterator<p> it = c.e().a().iterator();
        while (it.hasNext()) {
            it.next().m().p(c());
        }
    }

    public void b(Context context) {
        if (this.f14460c) {
            return;
        }
        this.f14461d.a(context);
        this.f14461d.b(this);
        this.f14461d.i();
        this.f14462e = this.f14461d.g();
        this.f14460c = true;
    }

    public Date c() {
        Date date = this.f14459b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void e() {
        Date dateA = this.f14458a.a();
        Date date = this.f14459b;
        if (date == null || dateA.after(date)) {
            this.f14459b = dateA;
            d();
        }
    }

    @Override // e5.d.a
    public void a(boolean z10) {
        if (!this.f14462e && z10) {
            e();
        }
        this.f14462e = z10;
    }
}
