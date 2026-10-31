package j7;

import android.os.Bundle;
import android.text.TextUtils;
import h7.j;
import h7.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f20670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j f20671c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f20669a = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f20672d = true;

    List a() {
        return this.f20669a;
    }

    void b(j jVar) {
        this.f20671c = jVar;
    }

    void c(b bVar) {
        this.f20670b = bVar;
    }

    void d(l7.a aVar, j jVar) {
        b(jVar);
        Bundle bundle = new Bundle();
        bundle.putInt("params_error_code", jVar.a());
        List<String> listA0 = aVar.A0();
        if (listA0 == null || listA0.isEmpty()) {
            return;
        }
        Iterator<String> it = listA0.iterator();
        while (it.hasNext()) {
            String strA = k.a(it.next(), bundle);
            if (!TextUtils.isEmpty(strA)) {
                this.f20669a.add(strA);
            }
        }
    }

    void e(boolean z10) {
        this.f20672d = z10;
    }

    boolean f() {
        return this.f20672d;
    }

    public b g() {
        return this.f20670b;
    }

    public j h() {
        return this.f20671c;
    }

    public boolean i() {
        return this.f20670b != null;
    }
}
