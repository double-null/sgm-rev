package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerWaterfallSegmentsActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class p extends p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f7792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.applovin.impl.sdk.l f7793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private u2 f7794c;

    class a extends u2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ n f7795e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, n nVar) {
            super(context);
            this.f7795e = nVar;
        }

        @Override // com.applovin.impl.u2
        protected int b() {
            return this.f7795e.g().size();
        }

        @Override // com.applovin.impl.u2
        protected List c(int i10) {
            ArrayList arrayList = new ArrayList();
            o oVar = (o) this.f7795e.g().get(i10);
            arrayList.add(p.this.c(oVar.c()));
            if (oVar.b() != null) {
                arrayList.add(p.this.a("AB Test Experiment Name", oVar.b()));
            }
            m8 m8VarD = oVar.d();
            p pVar = p.this;
            arrayList.add(pVar.a("Device ID Targeting", pVar.a(m8VarD.a())));
            p pVar2 = p.this;
            arrayList.add(pVar2.a("Device Type Targeting", pVar2.b(m8VarD.b())));
            if (m8VarD.c() != null) {
                arrayList.add(p.this.a(m8VarD.c()));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.u2
        protected int d(int i10) {
            o oVar = (o) this.f7795e.g().get(i10);
            return (oVar.b() != null ? 1 : 0) + 3 + (oVar.d().c() == null ? 0 : 1);
        }

        @Override // com.applovin.impl.u2
        protected t2 e(int i10) {
            if (i10 == b.TARGETED_WATERFALL.ordinal()) {
                return new x4("TARGETED WATERFALL FOR CURRENT DEVICE");
            }
            return i10 == b.OTHER_WATERFALLS.ordinal() ? new x4("OTHER WATERFALLS") : new x4("");
        }
    }

    public enum b {
        TARGETED_WATERFALL,
        OTHER_WATERFALLS
    }

    @Override // com.applovin.impl.p3
    protected com.applovin.impl.sdk.l getSdk() {
        return this.f7793b;
    }

    public void initialize(final n nVar, final com.applovin.impl.sdk.l lVar) {
        this.f7792a = nVar;
        this.f7793b = lVar;
        a aVar = new a(this, nVar);
        this.f7794c = aVar;
        aVar.a(new u2.a() { // from class: com.applovin.impl.ad
            @Override // com.applovin.impl.u2.a
            public final void a(l2 l2Var, t2 t2Var) {
                this.f5972a.a(lVar, nVar, l2Var, t2Var);
            }
        });
        this.f7794c.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.p3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle(this.f7792a.d());
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter((ListAdapter) this.f7794c);
        listView.setDividerHeight(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.p3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        u2 u2Var = this.f7794c;
        if (u2Var != null) {
            u2Var.a((u2.a) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(String str) {
        if (str.equals("phone")) {
            return "Phones";
        }
        return str.equals("tablet") ? "Tablets" : "All";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public t2 c(String str) {
        return t2.a(t2.c.RIGHT_DETAIL).b(StringUtils.createSpannedString(str, -16777216, 18, 1)).a(this).a(true).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final com.applovin.impl.sdk.l lVar, final n nVar, final l2 l2Var, t2 t2Var) {
        if (l2Var.a() == 0) {
            d.a(this, MaxDebuggerAdUnitDetailActivity.class, lVar.e(), new d.b() { // from class: com.applovin.impl.bd
                @Override // com.applovin.impl.d.b
                public final void a(Activity activity) {
                    p.a(nVar, l2Var, lVar, (MaxDebuggerAdUnitDetailActivity) activity);
                }
            });
        } else {
            d.a(this, MaxDebuggerWaterfallSegmentsActivity.class, lVar.e(), new d.b() { // from class: com.applovin.impl.cd
                @Override // com.applovin.impl.d.b
                public final void a(Activity activity) {
                    p.a(nVar, l2Var, lVar, (MaxDebuggerWaterfallSegmentsActivity) activity);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(n nVar, l2 l2Var, com.applovin.impl.sdk.l lVar, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(nVar, (o) nVar.g().get(l2Var.b()), null, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(n nVar, l2 l2Var, com.applovin.impl.sdk.l lVar, MaxDebuggerWaterfallSegmentsActivity maxDebuggerWaterfallSegmentsActivity) {
        o oVar = (o) nVar.g().get(l2Var.b());
        maxDebuggerWaterfallSegmentsActivity.initialize(oVar.c(), oVar.d().c(), lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public t2 a(String str, String str2) {
        return t2.a(t2.c.RIGHT_DETAIL).d(str).c(str2).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public t2 a(List list) {
        return t2.a(t2.c.DETAIL).d("Segment Targeting").a(StringUtils.createSpannedString(list.size() + " segment group(s)", -7829368, 14)).a(this).a(true).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        if (str.equals("idfa")) {
            return "IDFA Only";
        }
        return str.equals("dnt") ? "No IDFA Only" : "All";
    }
}
