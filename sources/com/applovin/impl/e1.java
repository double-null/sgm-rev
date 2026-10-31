package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class e1 extends u2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.l f6401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f6402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f6403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f6404h;

    /* JADX INFO: loaded from: classes2.dex */
    public enum a {
        f6405a,
        COUNT
    }

    public e1(Context context) {
        super(context);
        this.f6403g = new AtomicBoolean();
        this.f6404h = new ArrayList();
    }

    public void a(List list, com.applovin.impl.sdk.l lVar) {
        Activity activityW0;
        this.f6401e = lVar;
        this.f6402f = list;
        if (!(this.f8861a instanceof Activity) && (activityW0 = lVar.w0()) != null) {
            this.f8861a = activityW0;
        }
        if (list != null && this.f6403g.compareAndSet(false, true)) {
            this.f6404h = a(this.f6402f);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.s9
            @Override // java.lang.Runnable
            public final void run() {
                this.f8180a.notifyDataSetChanged();
            }
        });
    }

    @Override // com.applovin.impl.u2
    protected int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.u2
    protected List c(int i10) {
        return this.f6404h;
    }

    public List d() {
        return this.f6402f;
    }

    public com.applovin.impl.sdk.l e() {
        return this.f6401e;
    }

    public boolean f() {
        return this.f6404h.size() == 0;
    }

    public void g() {
        this.f6403g.compareAndSet(true, false);
    }

    public String toString() {
        return "CreativeDebuggerListAdapter{isInitialized=" + this.f6403g.get() + "}";
    }

    @Override // com.applovin.impl.u2
    protected int d(int i10) {
        return this.f6404h.size();
    }

    @Override // com.applovin.impl.u2
    protected t2 e(int i10) {
        return new x4("RECENT ADS");
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new q1((r1) it.next(), this.f8861a));
        }
        return arrayList;
    }
}
