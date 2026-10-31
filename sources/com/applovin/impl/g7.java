package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class g7 extends p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.l f6682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f6683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f6684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private u2 f6685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f6686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f6687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ListView f6688g;

    class a extends u2 {
        a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.u2
        protected t2 a() {
            return new t2.b(t2.c.SECTION_CENTERED).d("Select a network to load ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
        }

        @Override // com.applovin.impl.u2
        protected int b() {
            return c.COUNT.ordinal();
        }

        @Override // com.applovin.impl.u2
        protected List c(int i10) {
            return i10 == c.BIDDERS.ordinal() ? g7.this.f6686e : g7.this.f6687f;
        }

        @Override // com.applovin.impl.u2
        protected int d(int i10) {
            return i10 == c.BIDDERS.ordinal() ? g7.this.f6686e.size() : g7.this.f6687f.size();
        }

        @Override // com.applovin.impl.u2
        protected t2 e(int i10) {
            return i10 == c.BIDDERS.ordinal() ? new x4("BIDDERS") : new x4("WATERFALL");
        }
    }

    class b extends b4 {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ w2 f6690p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(g3 g3Var, Context context, w2 w2Var) {
            super(g3Var, context);
            this.f6690p = w2Var;
        }

        @Override // com.applovin.impl.b4, com.applovin.impl.t2
        public int d() {
            if (g7.this.f6682a.u0().b() == null || !g7.this.f6682a.u0().b().equals(this.f6690p.b())) {
                return 0;
            }
            return R.drawable.applovin_ic_check_mark_borderless;
        }

        @Override // com.applovin.impl.b4, com.applovin.impl.t2
        public int e() {
            if (g7.this.f6682a.u0().b() == null || !g7.this.f6682a.u0().b().equals(this.f6690p.b())) {
                return super.e();
            }
            return -16776961;
        }

        @Override // com.applovin.impl.t2
        public SpannedString k() {
            return StringUtils.createSpannedString(this.f6690p.a(), o() ? -16777216 : -7829368, 18, 1);
        }
    }

    enum c {
        BIDDERS,
        WATERFALL,
        COUNT
    }

    public g7() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.p3
    protected com.applovin.impl.sdk.l getSdk() {
        return this.f6682a;
    }

    public void initialize(List<w2> list, List<w2> list2, final com.applovin.impl.sdk.l lVar) {
        this.f6682a = lVar;
        this.f6683b = list;
        this.f6684c = list2;
        this.f6686e = a(list);
        this.f6687f = a(list2);
        a aVar = new a(this);
        this.f6685d = aVar;
        aVar.a(new u2.a() { // from class: com.applovin.impl.oa
            @Override // com.applovin.impl.u2.a
            public final void a(l2 l2Var, t2 t2Var) {
                this.f7779a.a(lVar, l2Var, t2Var);
            }
        });
        this.f6685d.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Live Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f6688g = listView;
        listView.setAdapter((ListAdapter) this.f6685d);
    }

    @Override // com.applovin.impl.p3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f6686e = a(this.f6683b);
        this.f6687f = a(this.f6684c);
        this.f6685d.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.l lVar, l2 l2Var, t2 t2Var) {
        List listB = a(l2Var).b();
        if (listB.equals(lVar.u0().b())) {
            lVar.u0().a((List) null);
        } else {
            lVar.u0().a(listB);
        }
        this.f6685d.notifyDataSetChanged();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w2 w2Var = (w2) it.next();
            arrayList.add(new b(w2Var.d(), this, w2Var));
        }
        return arrayList;
    }

    private w2 a(l2 l2Var) {
        if (l2Var.b() == c.BIDDERS.ordinal()) {
            return (w2) this.f6683b.get(l2Var.a());
        }
        return (w2) this.f6684c.get(l2Var.a());
    }
}
