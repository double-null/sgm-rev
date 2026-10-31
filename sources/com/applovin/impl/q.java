package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerAdUnitWaterfallsListActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class q extends p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.l f7926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u2 f7927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f7928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f7929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ListView f7930e;

    class a extends u2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f7931e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, List list) {
            super(context);
            this.f7931e = list;
        }

        @Override // com.applovin.impl.u2
        protected int b() {
            return 1;
        }

        @Override // com.applovin.impl.u2
        protected List c(int i10) {
            return q.this.f7928c;
        }

        @Override // com.applovin.impl.u2
        protected int d(int i10) {
            return this.f7931e.size();
        }

        @Override // com.applovin.impl.u2
        protected t2 e(int i10) {
            return new x4("");
        }
    }

    @Override // com.applovin.impl.p3
    protected com.applovin.impl.sdk.l getSdk() {
        return this.f7926a;
    }

    public void initialize(final List<n> list, boolean z10, final com.applovin.impl.sdk.l lVar) {
        this.f7929d = z10;
        this.f7926a = lVar;
        this.f7928c = a(list);
        a aVar = new a(this, list);
        this.f7927b = aVar;
        aVar.a(new u2.a() { // from class: com.applovin.impl.wd
            @Override // com.applovin.impl.u2.a
            public final void a(l2 l2Var, t2 t2Var) {
                this.f9038a.a(list, lVar, l2Var, t2Var);
            }
        });
        this.f7927b.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.p3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f7929d ? "Selective Init " : "");
        sb2.append("Ad Units");
        setTitle(sb2.toString());
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f7930e = listView;
        listView.setAdapter((ListAdapter) this.f7927b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, final com.applovin.impl.sdk.l lVar, l2 l2Var, t2 t2Var) {
        final n nVar = (n) list.get(l2Var.a());
        if (nVar.g().size() == 1) {
            d.a(this, MaxDebuggerAdUnitDetailActivity.class, lVar.e(), new d.b() { // from class: com.applovin.impl.ud
                @Override // com.applovin.impl.d.b
                public final void a(Activity activity) {
                    ((MaxDebuggerAdUnitDetailActivity) activity).initialize(nVar, null, null, lVar);
                }
            });
        } else {
            d.a(this, MaxDebuggerAdUnitWaterfallsListActivity.class, lVar.e(), new d.b() { // from class: com.applovin.impl.vd
                @Override // com.applovin.impl.d.b
                public final void a(Activity activity) {
                    ((MaxDebuggerAdUnitWaterfallsListActivity) activity).initialize(nVar, lVar);
                }
            });
        }
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ID\t\t\t\t\t\t", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(nVar.c(), -16777216));
            spannableStringBuilder.append((CharSequence) new SpannedString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("FORMAT  ", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(nVar.b(), -16777216));
            arrayList.add(t2.a(t2.c.DETAIL).b(StringUtils.createSpannedString(nVar.d(), -16777216, 18, 1)).a(new SpannedString(spannableStringBuilder)).a(this).a(true).a());
        }
        return arrayList;
    }
}
