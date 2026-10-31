package g6;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import d6.c;
import e6.d;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f15384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f15386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f15387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f15388e;

    public b(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("channel id is empty");
        }
        this.f15384a = context.getApplicationContext();
        this.f15385b = str;
        this.f15386c = Uri.parse("https://access.line.me/v2");
    }

    public a a() {
        if (!this.f15388e) {
            c.b(this.f15384a);
        }
        h6.b bVar = new h6.b(this.f15385b, new e6.b(this.f15384a, this.f15386c), new d(this.f15384a, this.f15386c), new d6.a(this.f15384a, this.f15385b));
        return this.f15387d ? bVar : (a) Proxy.newProxyInstance(h6.b.class.getClassLoader(), new Class[]{a.class}, new h6.a(bVar, (byte) 0));
    }
}
