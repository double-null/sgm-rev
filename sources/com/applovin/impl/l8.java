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
public abstract class l8 extends p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f7067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.applovin.impl.sdk.l f7068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private u2 f7069c;

    class a extends u2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f7070e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, List list) {
            super(context);
            this.f7070e = list;
        }

        @Override // com.applovin.impl.u2
        protected t2 a() {
            return new t2.b(t2.c.SECTION_CENTERED).d("A plus in front of each segment indicates inclusion and a minus indicates exclusion. The comma in comma-separated values functions as an ∨ (or) operator, and a new row functions as an ∧ (and) operator.").a();
        }

        @Override // com.applovin.impl.u2
        protected int b() {
            return 1;
        }

        @Override // com.applovin.impl.u2
        protected List c(int i10) {
            return this.f7070e;
        }

        @Override // com.applovin.impl.u2
        protected int d(int i10) {
            return this.f7070e.size();
        }

        @Override // com.applovin.impl.u2
        protected t2 e(int i10) {
            return new x4("SEGMENT TARGETING");
        }
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(t2.a(t2.c.DETAIL).d((String) it.next()).a());
        }
        return arrayList;
    }

    @Override // com.applovin.impl.p3
    protected com.applovin.impl.sdk.l getSdk() {
        return this.f7068b;
    }

    public void initialize(String str, List<String> list, com.applovin.impl.sdk.l lVar) {
        this.f7067a = str;
        this.f7068b = lVar;
        a aVar = new a(this, a(list));
        this.f7069c = aVar;
        aVar.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle(this.f7067a);
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f7069c);
    }
}
