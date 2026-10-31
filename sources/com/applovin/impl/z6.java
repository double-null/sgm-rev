package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class z6 extends p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.l f9412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u2 f9413b;

    class a extends u2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f9414e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f9415f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f9416g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, ArrayList arrayList, ArrayList arrayList2, boolean z10) {
            super(context);
            this.f9414e = arrayList;
            this.f9415f = arrayList2;
            this.f9416g = z10;
        }

        @Override // com.applovin.impl.u2
        protected int b() {
            return b.values().length;
        }

        @Override // com.applovin.impl.u2
        protected List c(int i10) {
            return i10 == b.TC_NETWORKS.ordinal() ? this.f9414e : this.f9415f;
        }

        @Override // com.applovin.impl.u2
        protected int d(int i10) {
            return i10 == b.TC_NETWORKS.ordinal() ? this.f9414e.size() : this.f9415f.size();
        }

        @Override // com.applovin.impl.u2
        protected t2 e(int i10) {
            if (i10 == b.TC_NETWORKS.ordinal()) {
                return new x4("TCF VENDORS (TC STRING)");
            }
            return new x4(this.f9416g ? "ATP NETWORKS (AC STRING)" : "APPLOVIN PRIVACY SETTING");
        }
    }

    private enum b {
        TC_NETWORKS,
        AC_NETWORKS
    }

    private t2 a(String str, String str2) {
        return t2.a().d(str).c(str2).a();
    }

    @Override // com.applovin.impl.p3
    protected com.applovin.impl.sdk.l getSdk() {
        return this.f9412a;
    }

    public void initialize(List<d7> list, com.applovin.impl.sdk.l lVar) {
        this.f9412a = lVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strA = q0.b().a(this);
        boolean zB = lVar.t0().b();
        if (!zB) {
            arrayList2.add(a("Has User Consent", strA));
        }
        for (d7 d7Var : list) {
            Boolean boolA = d7Var.a();
            if (boolA != null) {
                if (d7Var.f() == d7.a.TCF_VENDOR) {
                    arrayList.add(a(d7Var.b(), String.valueOf(boolA)));
                } else if (d7Var.f() == d7.a.ATP_NETWORK) {
                    arrayList2.add(a(d7Var.b(), String.valueOf(boolA)));
                }
            } else if (zB && d7Var.f() == d7.a.ATP_NETWORK) {
                arrayList2.add(a(d7Var.b(), strA));
            }
        }
        a aVar = new a(this, arrayList, arrayList2, zB);
        this.f9413b = aVar;
        aVar.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Network Consent Statuses");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f9413b);
    }
}
