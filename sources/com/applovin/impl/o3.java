package com.applovin.impl;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitsListActivity;
import com.applovin.mediation.MaxDebuggerAxonEventsListActivity;
import com.applovin.mediation.MaxDebuggerDetailActivity;
import com.applovin.mediation.MaxDebuggerTcfConsentStatusesListActivity;
import com.applovin.mediation.MaxDebuggerTcfInfoListActivity;
import com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity;
import com.applovin.mediation.MaxDebuggerTestModeNetworkActivity;
import com.applovin.mediation.MaxDebuggerUnifiedFlowActivity;

/* JADX INFO: loaded from: classes.dex */
public abstract class o3 extends p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private q3 f7737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DataSetObserver f7738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FrameLayout f7739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ListView f7740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.applovin.impl.a f7741e;

    class a extends DataSetObserver {
        a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            o3.this.a();
            o3 o3Var = o3.this;
            o3Var.b((Context) o3Var);
        }
    }

    class b implements u2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.c f7743a;

        class a implements com.applovin.impl.d.b {
            a() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerUnifiedFlowActivity maxDebuggerUnifiedFlowActivity) {
                maxDebuggerUnifiedFlowActivity.initialize(o3.this.f7737a.u());
            }
        }

        /* JADX INFO: renamed from: com.applovin.impl.o3$b$b, reason: collision with other inner class name */
        class C0114b implements com.applovin.impl.d.b {
            C0114b() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTcfInfoListActivity maxDebuggerTcfInfoListActivity) {
                maxDebuggerTcfInfoListActivity.initialize(o3.this.f7737a.d(), o3.this.f7737a.u());
            }
        }

        class c implements com.applovin.impl.d.b {
            c() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTcfConsentStatusesListActivity maxDebuggerTcfConsentStatusesListActivity) {
                maxDebuggerTcfConsentStatusesListActivity.initialize(o3.this.f7737a.d(), o3.this.f7737a.u());
            }
        }

        class d implements com.applovin.impl.d.b {
            d() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(o3.this.f7737a.f(), false, o3.this.f7737a.u());
            }
        }

        class e implements com.applovin.impl.d.b {
            e() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTestLiveNetworkActivity maxDebuggerTestLiveNetworkActivity) {
                maxDebuggerTestLiveNetworkActivity.initialize(o3.this.f7737a.k(), o3.this.f7737a.x(), o3.this.f7737a.u());
            }
        }

        class f implements com.applovin.impl.d.b {
            f() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTestModeNetworkActivity maxDebuggerTestModeNetworkActivity) {
                maxDebuggerTestModeNetworkActivity.initialize(o3.this.f7737a.w(), o3.this.f7737a.u());
            }
        }

        class g implements com.applovin.impl.d.b {
            g() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(o3.this.f7737a.p(), true, o3.this.f7737a.u());
            }
        }

        class h implements com.applovin.impl.d.b {
            h() {
            }

            @Override // com.applovin.impl.d.b
            public void a(g0 g0Var) {
                g0Var.initialize(o3.this.f7737a.u().G().getTrackedAxonEvents(), o3.this.f7737a.u());
            }
        }

        class i implements com.applovin.impl.d.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ t2 f7753a;

            i(t2 t2Var) {
                this.f7753a = t2Var;
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerDetailActivity maxDebuggerDetailActivity) {
                maxDebuggerDetailActivity.initialize(((b4) this.f7753a).r());
            }
        }

        b(com.applovin.impl.c cVar) {
            this.f7743a = cVar;
        }

        @Override // com.applovin.impl.u2.a
        public void a(l2 l2Var, t2 t2Var) {
            int iB = l2Var.b();
            if (iB == q3.e.APP_INFO.ordinal()) {
                q7.a(t2Var.c(), t2Var.b(), o3.this);
                return;
            }
            if (iB == q3.e.MAX.ordinal()) {
                if (o3.this.f7737a.a(t2Var)) {
                    com.applovin.impl.d.a(o3.this, MaxDebuggerUnifiedFlowActivity.class, this.f7743a, new a());
                    return;
                } else {
                    q7.a(t2Var.c(), t2Var.b(), o3.this);
                    return;
                }
            }
            if (iB == q3.e.PRIVACY.ordinal()) {
                if (l2Var.a() != q3.d.CMP.ordinal()) {
                    if (l2Var.a() == q3.d.NETWORK_CONSENT_STATUSES.ordinal()) {
                        com.applovin.impl.d.a(o3.this, MaxDebuggerTcfConsentStatusesListActivity.class, this.f7743a, new c());
                        return;
                    }
                    return;
                } else if (StringUtils.isValidString(o3.this.f7737a.u().t0().j())) {
                    com.applovin.impl.d.a(o3.this, MaxDebuggerTcfInfoListActivity.class, this.f7743a, new C0114b());
                    return;
                } else {
                    q7.a(t2Var.c(), t2Var.b(), o3.this);
                    return;
                }
            }
            if (iB != q3.e.ADS.ordinal()) {
                if (iB == q3.e.EVENTS.ordinal()) {
                    com.applovin.impl.d.a(o3.this, MaxDebuggerAxonEventsListActivity.class, this.f7743a, new h());
                    return;
                } else {
                    if ((iB == q3.e.INCOMPLETE_NETWORKS.ordinal() || iB == q3.e.COMPLETED_NETWORKS.ordinal()) && (t2Var instanceof b4)) {
                        com.applovin.impl.d.a(o3.this, MaxDebuggerDetailActivity.class, this.f7743a, new i(t2Var));
                        return;
                    }
                    return;
                }
            }
            if (l2Var.a() == q3.b.AD_UNITS.ordinal()) {
                if (o3.this.f7737a.f().size() > 0) {
                    com.applovin.impl.d.a(o3.this, MaxDebuggerAdUnitsListActivity.class, this.f7743a, new d());
                    return;
                } else {
                    q7.a("No live ad units", "Please setup or enable your MAX ad units on https://applovin.com.", o3.this);
                    return;
                }
            }
            if (l2Var.a() == q3.b.SELECT_LIVE_NETWORKS.ordinal()) {
                if (o3.this.f7737a.k().size() <= 0 && o3.this.f7737a.x().size() <= 0) {
                    q7.a("Complete Integrations", "Please complete integrations in order to access this.", o3.this);
                    return;
                } else if (o3.this.f7737a.u().u0().c()) {
                    q7.a("Restart Required", t2Var.b(), o3.this);
                    return;
                } else {
                    com.applovin.impl.d.a(o3.this, MaxDebuggerTestLiveNetworkActivity.class, this.f7743a, new e());
                    return;
                }
            }
            if (l2Var.a() != q3.b.SELECT_TEST_MODE_NETWORKS.ordinal()) {
                if (l2Var.a() == q3.b.INITIALIZATION_AD_UNITS.ordinal()) {
                    com.applovin.impl.d.a(o3.this, MaxDebuggerAdUnitsListActivity.class, this.f7743a, new g());
                }
            } else if (!o3.this.f7737a.u().u0().c()) {
                o3.this.getSdk().u0().a();
                q7.a("Restart Required", t2Var.b(), o3.this);
            } else if (o3.this.f7737a.w().size() > 0) {
                com.applovin.impl.d.a(o3.this, MaxDebuggerTestModeNetworkActivity.class, this.f7743a, new f());
            } else {
                q7.a("Complete Integrations", "Please complete integrations in order to access this.", o3.this);
            }
        }
    }

    private void c() {
        a();
        com.applovin.impl.a aVar = new com.applovin.impl.a(this, 50, R.attr.progressBarStyleLarge);
        this.f7741e = aVar;
        aVar.setColor(-3355444);
        this.f7739c.addView(this.f7741e, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f7739c.bringChildToFront(this.f7741e);
        this.f7741e.a();
    }

    @Override // com.applovin.impl.p3
    protected com.applovin.impl.sdk.l getSdk() {
        q3 q3Var = this.f7737a;
        if (q3Var != null) {
            return q3Var.u();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.p3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Mediation Debugger");
        setContentView(com.applovin.sdk.R.layout.mediation_debugger_list_view);
        this.f7739c = (FrameLayout) findViewById(R.id.content);
        ListView listView = (ListView) findViewById(com.applovin.sdk.R.id.listView);
        this.f7740d = listView;
        listView.setAdapter((ListAdapter) this.f7737a);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(com.applovin.sdk.R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.p3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        q3 q3Var = this.f7737a;
        if (q3Var != null) {
            q3Var.unregisterDataSetObserver(this.f7738b);
            this.f7737a.a((u2.a) null);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (com.applovin.sdk.R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        b();
        return true;
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        q3 q3Var = this.f7737a;
        if (q3Var == null || !q3Var.z()) {
            return;
        }
        this.f7737a.c();
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        q3 q3Var = this.f7737a;
        if (q3Var == null || q3Var.z()) {
            return;
        }
        c();
    }

    public void setListAdapter(q3 q3Var, c cVar) {
        DataSetObserver dataSetObserver;
        q3 q3Var2 = this.f7737a;
        if (q3Var2 != null && (dataSetObserver = this.f7738b) != null) {
            q3Var2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f7737a = q3Var;
        this.f7738b = new a();
        b((Context) this);
        this.f7737a.registerDataSetObserver(this.f7738b);
        this.f7737a.a(new b(cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        com.applovin.impl.a aVar = this.f7741e;
        if (aVar != null) {
            aVar.b();
            this.f7739c.removeView(this.f7741e);
            this.f7741e = null;
        }
    }

    private void b() {
        q3 q3Var = this.f7737a;
        if (q3Var == null) {
            return;
        }
        String strQ = q3Var.q();
        if (TextUtils.isEmpty(strQ)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", strQ);
        intent.putExtra("android.intent.extra.TITLE", "Mediation Debugger logs");
        intent.putExtra("android.intent.extra.SUBJECT", "MAX Mediation Debugger logs");
        startActivity(Intent.createChooser(intent, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context) {
        q7.a(this.f7737a.i(), this.f7737a.h(), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final Context context) {
        if (!StringUtils.isValidString(this.f7737a.h()) || this.f7737a.y()) {
            return;
        }
        this.f7737a.b(true);
        runOnUiThread(new Runnable() { // from class: com.applovin.impl.xc
            @Override // java.lang.Runnable
            public final void run() {
                this.f9075a.a(context);
            }
        });
    }
}
