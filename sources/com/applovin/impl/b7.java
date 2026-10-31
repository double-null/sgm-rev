package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerCmpNetworksListActivity;
import com.applovin.mediation.MaxDebuggerTcfStringActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class b7 extends p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.l f6159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u2 f6160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f6161c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f6162d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f6163e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f6164f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f6165g = new ArrayList();

    class a extends u2 {
        a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.u2
        protected int b() {
            return e.values().length;
        }

        @Override // com.applovin.impl.u2
        protected List c(int i10) {
            return i10 == e.IAB_TCF_PARAMETERS.ordinal() ? b7.this.c() : b7.this.a();
        }

        @Override // com.applovin.impl.u2
        protected int d(int i10) {
            return i10 == e.IAB_TCF_PARAMETERS.ordinal() ? d.values().length : c.values().length;
        }

        @Override // com.applovin.impl.u2
        protected t2 e(int i10) {
            return i10 == e.IAB_TCF_PARAMETERS.ordinal() ? new x4("IAB TCF Parameters") : new x4("CMP CONFIGURATION");
        }
    }

    class b implements u2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c7 f6167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.l f6168b;

        class a implements com.applovin.impl.d.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f6170a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f6171b;

            a(String str, String str2) {
                this.f6170a = str;
                this.f6171b = str2;
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTcfStringActivity maxDebuggerTcfStringActivity) {
                maxDebuggerTcfStringActivity.initialize(this.f6170a, this.f6171b, b.this.f6168b);
            }
        }

        /* JADX INFO: renamed from: com.applovin.impl.b7$b$b, reason: collision with other inner class name */
        class C0106b implements com.applovin.impl.d.b {
            C0106b() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerCmpNetworksListActivity maxDebuggerCmpNetworksListActivity) {
                maxDebuggerCmpNetworksListActivity.initialize(b7.this.f6163e, b7.this.f6164f, b7.this.f6161c, b7.this.f6162d, b7.this.f6165g, b.this.f6168b);
            }
        }

        b(c7 c7Var, com.applovin.impl.sdk.l lVar) {
            this.f6167a = c7Var;
            this.f6168b = lVar;
        }

        @Override // com.applovin.impl.u2.a
        public void a(l2 l2Var, t2 t2Var) {
            String strA;
            String strC;
            if (l2Var.b() != e.IAB_TCF_PARAMETERS.ordinal()) {
                if (l2Var.a() == c.CONFIGURED_NETWORKS.ordinal()) {
                    com.applovin.impl.d.a(b7.this, MaxDebuggerCmpNetworksListActivity.class, this.f6168b.e(), new C0106b());
                    return;
                } else {
                    q7.a(t2Var.c(), t2Var.b(), b7.this);
                    return;
                }
            }
            if (l2Var.a() == d.TC_STRING.ordinal()) {
                strA = b5.f6153x.a();
                strC = this.f6167a.j();
            } else {
                strA = b5.f6154y.a();
                strC = this.f6167a.c();
            }
            com.applovin.impl.d.a(b7.this, MaxDebuggerTcfStringActivity.class, this.f6168b.e(), new a(strA, strC));
        }
    }

    private enum c {
        CMP_SDK_ID,
        CMP_SDK_VERSION,
        INSTRUCTIONS,
        CONFIGURED_NETWORKS
    }

    private enum d {
        GDPR_APPLIES,
        TC_STRING,
        AC_STRING
    }

    private enum e {
        IAB_TCF_PARAMETERS,
        CMP_CONFIGURATION
    }

    @Override // com.applovin.impl.p3
    protected com.applovin.impl.sdk.l getSdk() {
        return this.f6159a;
    }

    public void initialize(List<d7> list, com.applovin.impl.sdk.l lVar) {
        this.f6159a = lVar;
        c7 c7VarT0 = lVar.t0();
        a(list);
        a aVar = new a(this);
        this.f6160b = aVar;
        aVar.a(new b(c7VarT0, lVar));
        this.f6160b.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.p3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("CMP (Consent Management Platform)");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f6160b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.p3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        u2 u2Var = this.f6160b;
        if (u2Var != null) {
            u2Var.a((u2.a) null);
        }
    }

    private void a(List list) {
        boolean zB = this.f6159a.t0().b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d7 d7Var = (d7) it.next();
            if (d7Var.f() == d7.a.TCF_VENDOR) {
                if (Boolean.TRUE.equals(d7Var.a())) {
                    a(d7Var, this.f6161c);
                } else {
                    a(d7Var, this.f6163e);
                }
            } else if (d7Var.f() != d7.a.ATP_NETWORK) {
                this.f6165g.add(d7Var);
            } else if (!zB) {
                this.f6165g.add(d7Var);
            } else if (Boolean.TRUE.equals(d7Var.a())) {
                a(d7Var, this.f6162d);
            } else {
                a(d7Var, this.f6164f);
            }
        }
    }

    private t2 b() {
        t2.b bVarA;
        String strA = b5.f6150u.a();
        Integer numE = this.f6159a.t0().e();
        if (StringUtils.isValidString(this.f6159a.t0().d())) {
            bVarA = t2.a(t2.c.RIGHT_DETAIL);
        } else {
            t2.b bVarB = t2.a(t2.c.DETAIL).b("Unknown CMP SDK ID");
            bVarA = bVarB.a("Your integrated CMP might not be Google-certified. " + ("SharedPreferences value for key " + strA + " is " + numE + ".") + "\n\nIf you use Google AdMob or Google Ad Manager, make sure that the integrated CMP is included in the list of Google-certified CMPs at: https://support.google.com/admob/answer/13554116").a(R.drawable.applovin_ic_warning).b(getColor(R.color.applovin_sdk_warningColor)).a(true);
        }
        bVarA.d(strA);
        bVarA.c(numE != null ? numE.toString() : "No value set");
        bVarA.c(numE != null ? -16777216 : -65536);
        return bVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List c() {
        ArrayList arrayList = new ArrayList(d.values().length);
        Integer numG = this.f6159a.t0().g();
        String strJ = this.f6159a.t0().j();
        String strC = this.f6159a.t0().c();
        arrayList.add(a(b5.f6152w.a(), numG));
        arrayList.add(a(b5.f6153x.a(), strJ, !f7.b(strJ)));
        arrayList.add(a(b5.f6154y.a(), strC, false));
        return arrayList;
    }

    private void a(d7 d7Var, List list) {
        if (d7Var.d() != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (d7Var.d().equals(((d7) it.next()).d())) {
                    return;
                }
            }
        }
        list.add(d7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a() {
        String str;
        ArrayList arrayList = new ArrayList(c.values().length);
        int size = this.f6163e.size() + this.f6164f.size();
        arrayList.add(b());
        arrayList.add(a(b5.f6151v.a(), this.f6159a.t0().f()));
        arrayList.add(t2.a(t2.c.DETAIL).d("To check which networks are missing from your CMP, first make sure that you have granted consent to all networks through your CMP flow. Then add the following networks to your CMP network list.").a());
        t2.b bVarD = t2.a(t2.c.RIGHT_DETAIL).d("Configured CMP Networks");
        if (size > 0) {
            str = "Missing " + size + " network(s)";
        } else {
            str = "";
        }
        arrayList.add(bVarD.c(str).c(size > 0 ? -65536 : -16777216).a(this).a(true).a());
        return arrayList;
    }

    private t2 a(String str, Integer num) {
        return t2.a(t2.c.RIGHT_DETAIL).d(str).c(num != null ? num.toString() : "No value set").c(num != null ? -16777216 : -65536).a();
    }

    private t2 a(String str, String str2, boolean z10) {
        boolean zIsValidString = StringUtils.isValidString(str2);
        if (zIsValidString && str2.length() > 35) {
            str2 = str2.substring(0, 35) + "...";
        }
        t2.b bVarD = t2.a(t2.c.DETAIL).d(str);
        if (!zIsValidString) {
            str2 = "No value set";
        }
        t2.b bVarA = bVarD.c(str2).c(z10 ? -65536 : -16777216).a(zIsValidString);
        if (zIsValidString) {
            bVarA.a(this);
        }
        return bVarA.a();
    }
}
