package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0 extends p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.l f7657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u2 f7658b;

    class a extends u2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f7659e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f7660f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f7661g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ List f7662h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ List f7663i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, List list, List list2, List list3, List list4, List list5) {
            super(context);
            this.f7659e = list;
            this.f7660f = list2;
            this.f7661g = list3;
            this.f7662h = list4;
            this.f7663i = list5;
        }

        @Override // com.applovin.impl.u2
        protected int b() {
            return c.values().length;
        }

        @Override // com.applovin.impl.u2
        protected List c(int i10) {
            List list;
            boolean z10 = true;
            if (i10 == c.MISSING_TC_NETWORKS.ordinal()) {
                list = this.f7659e;
            } else if (i10 == c.MISSING_AC_NETWORKS.ordinal()) {
                list = this.f7660f;
            } else {
                z10 = false;
                if (i10 == c.LISTED_TC_NETWORKS.ordinal()) {
                    list = this.f7661g;
                } else {
                    list = i10 == c.LISTED_AC_NETWORKS.ordinal() ? this.f7662h : this.f7663i;
                }
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(n0.this.a((d7) it.next(), z10));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.u2
        protected int d(int i10) {
            if (i10 == c.MISSING_TC_NETWORKS.ordinal()) {
                return this.f7659e.size();
            }
            if (i10 == c.MISSING_AC_NETWORKS.ordinal()) {
                return this.f7660f.size();
            }
            if (i10 == c.LISTED_TC_NETWORKS.ordinal()) {
                return this.f7661g.size();
            }
            return i10 == c.LISTED_AC_NETWORKS.ordinal() ? this.f7662h.size() : this.f7663i.size();
        }

        @Override // com.applovin.impl.u2
        protected t2 e(int i10) {
            if (i10 == c.MISSING_TC_NETWORKS.ordinal()) {
                return new x4("MISSING TCF VENDORS (TC STRING)");
            }
            if (i10 == c.MISSING_AC_NETWORKS.ordinal()) {
                return new x4("MISSING ATP NETWORKS (AC STRING)");
            }
            if (i10 == c.LISTED_TC_NETWORKS.ordinal()) {
                return new x4("LISTED TCF VENDORS (TC STRING)");
            }
            return i10 == c.LISTED_AC_NETWORKS.ordinal() ? new x4("LISTED ATP NETWORKS (AC STRING)") : new x4("NON-CONFIGURABLE NETWORKS");
        }
    }

    class b implements u2.a {
        b() {
        }

        @Override // com.applovin.impl.u2.a
        public void a(l2 l2Var, t2 t2Var) {
            q7.a(t2Var.c(), t2Var.b(), n0.this);
        }
    }

    private enum c {
        MISSING_TC_NETWORKS,
        MISSING_AC_NETWORKS,
        LISTED_TC_NETWORKS,
        LISTED_AC_NETWORKS,
        OTHER_NETWORKS
    }

    @Override // com.applovin.impl.p3
    protected com.applovin.impl.sdk.l getSdk() {
        return this.f7657a;
    }

    public void initialize(List<d7> list, List<d7> list2, List<d7> list3, List<d7> list4, List<d7> list5, com.applovin.impl.sdk.l lVar) {
        this.f7657a = lVar;
        a aVar = new a(this, list, list2, list3, list4, list5);
        this.f7658b = aVar;
        aVar.a(new b());
        this.f7658b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Configured CMP Networks");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f7658b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public t2 a(d7 d7Var, boolean z10) {
        t2.b bVarA = t2.a();
        boolean zB = this.f7657a.t0().b();
        d7.a aVarF = d7Var.f();
        d7.a aVar = d7.a.TCF_VENDOR;
        if (aVarF == aVar || (d7Var.f() == d7.a.ATP_NETWORK && zB)) {
            String strC = d7Var.c();
            String str = d7Var.f() == aVar ? "IAB Vendor ID: " : "Google ATP ID: ";
            bVarA.d(strC).d(z10 ? -65536 : -16777216).b(strC).a(str + d7Var.d()).a(true);
        } else {
            bVarA.d(d7Var.b());
        }
        return bVarA.a();
    }
}
