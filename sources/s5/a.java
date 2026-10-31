package s5;

import android.content.Context;
import java.util.Date;
import java.util.Iterator;
import o5.o;

/* JADX INFO: loaded from: classes4.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f25237f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected w5.f f25238a = new w5.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f25239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f25241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f25242e;

    private a(d dVar) {
        this.f25241d = dVar;
    }

    public static a a() {
        return f25237f;
    }

    private void d() {
        if (!this.f25240c || this.f25239b == null) {
            return;
        }
        Iterator<o> it = c.e().a().iterator();
        while (it.hasNext()) {
            it.next().l().j(c());
        }
    }

    public void b(Context context) {
        if (this.f25240c) {
            return;
        }
        this.f25241d.a(context);
        this.f25241d.b(this);
        this.f25241d.i();
        this.f25242e = this.f25241d.g();
        this.f25240c = true;
    }

    public Date c() {
        Date date = this.f25239b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void e() {
        Date dateA = this.f25238a.a();
        Date date = this.f25239b;
        if (date == null || dateA.after(date)) {
            this.f25239b = dateA;
            d();
        }
    }

    @Override // s5.d.a
    public void a(boolean z10) {
        if (!this.f25242e && z10) {
            e();
        }
        this.f25242e = z10;
    }
}
