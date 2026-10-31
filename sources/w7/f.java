package w7;

import android.os.Bundle;
import x7.l0;

/* JADX INFO: compiled from: RubySpan.java */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f27587c = l0.C0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f27588d = l0.C0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27590b;

    public f(String str, int i10) {
        this.f27589a = str;
        this.f27590b = i10;
    }

    public static f a(Bundle bundle) {
        return new f((String) x7.a.e(bundle.getString(f27587c)), bundle.getInt(f27588d));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(f27587c, this.f27589a);
        bundle.putInt(f27588d, this.f27590b);
        return bundle;
    }
}
