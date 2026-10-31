package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class m extends u2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n f7087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o f7088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k8 f7089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f7090h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f7091i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f7092j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f7093k;

    enum a {
        INFO,
        BIDDERS,
        WATERFALL,
        COUNT
    }

    class b extends b4 {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final k8 f7099p;

        b(k8 k8Var, String str, boolean z10) {
            super(k8Var.b().d(), m.this.f8861a);
            this.f7099p = k8Var;
            this.f8761c = StringUtils.createSpannedString(k8Var.b().a(), -16777216, 18, 1);
            this.f8762d = !TextUtils.isEmpty(str) ? new SpannedString(str) : null;
            this.f8760b = z10;
        }

        @Override // com.applovin.impl.t2
        public int g() {
            return -12303292;
        }

        @Override // com.applovin.impl.b4, com.applovin.impl.t2
        public boolean o() {
            return this.f8760b;
        }

        public k8 v() {
            return this.f7099p;
        }
    }

    m(n nVar, o oVar, k8 k8Var, Context context) {
        super(context);
        this.f7087e = nVar;
        this.f7089g = k8Var;
        this.f7088f = oVar != null ? oVar : nVar.f();
        this.f7090h = oVar != null ? oVar.c() : nVar.d();
        this.f7091i = h();
        this.f7092j = e();
        this.f7093k = l();
        notifyDataSetChanged();
    }

    private t2 f() {
        return t2.a().d("AB Test Experiment Name").c(j().b()).a();
    }

    private t2 g() {
        return t2.a().d("ID").c(this.f7087e.c()).a();
    }

    private List h() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(g());
        arrayList.add(d());
        if (this.f7088f.b() != null) {
            arrayList.add(f());
        }
        if (this.f7089g != null) {
            arrayList.add(i());
        }
        return arrayList;
    }

    private t2 i() {
        return t2.a().d("Selected Network").c(this.f7089g.b().a()).a();
    }

    private List l() {
        k8 k8Var = this.f7089g;
        if (k8Var != null && k8Var.d()) {
            return new ArrayList();
        }
        List<k8> listE = this.f7088f.e();
        ArrayList arrayList = new ArrayList(listE.size());
        for (k8 k8Var2 : listE) {
            k8 k8Var3 = this.f7089g;
            if (k8Var3 == null || k8Var3.b().c().equals(k8Var2.b().c())) {
                arrayList.add(new b(k8Var2, null, this.f7089g == null));
                for (c4 c4Var : k8Var2.c()) {
                    arrayList.add(t2.a().d(c4Var.a()).c(c4Var.b()).b(true).a());
                }
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.u2
    protected int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.u2
    protected List c(int i10) {
        if (i10 == a.INFO.ordinal()) {
            return this.f7091i;
        }
        return i10 == a.BIDDERS.ordinal() ? this.f7092j : this.f7093k;
    }

    @Override // com.applovin.impl.u2
    protected int d(int i10) {
        if (i10 == a.INFO.ordinal()) {
            return this.f7091i.size();
        }
        return i10 == a.BIDDERS.ordinal() ? this.f7092j.size() : this.f7093k.size();
    }

    @Override // com.applovin.impl.u2
    protected t2 e(int i10) {
        if (i10 == a.INFO.ordinal()) {
            return new x4("INFO");
        }
        return i10 == a.BIDDERS.ordinal() ? new x4("BIDDERS") : new x4("WATERFALL");
    }

    public o j() {
        return this.f7088f;
    }

    public String k() {
        return this.f7090h;
    }

    private t2 d() {
        return t2.a().d("Ad Format").c(this.f7087e.b()).a();
    }

    private List e() {
        k8 k8Var = this.f7089g;
        if (k8Var != null && !k8Var.d()) {
            return new ArrayList();
        }
        List<k8> listA = this.f7088f.a();
        ArrayList arrayList = new ArrayList(listA.size());
        for (k8 k8Var2 : listA) {
            k8 k8Var3 = this.f7089g;
            if (k8Var3 == null || k8Var3.b().c().equals(k8Var2.b().c())) {
                arrayList.add(new b(k8Var2, k8Var2.a() != null ? k8Var2.a().a() : "", this.f7089g == null));
            }
        }
        return arrayList;
    }
}
