package com.applovin.impl;

import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.sdk.R;
import com.pairip.VMRunner;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d1 extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e1 f6311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FrameLayout f6312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ListView f6313c;

    /* JADX INFO: loaded from: classes.dex */
    class a implements u2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f6314a;

        /* JADX INFO: renamed from: com.applovin.impl.d1$a$a, reason: collision with other inner class name */
        class C0107a implements d.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ l2 f6316a;

            C0107a(l2 l2Var) {
                this.f6316a = l2Var;
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
                maxCreativeDebuggerDisplayedAdActivity.a((r1) d1.this.f6311a.d().get(this.f6316a.a()), d1.this.f6311a.e());
            }
        }

        a(c cVar) {
            this.f6314a = cVar;
        }

        @Override // com.applovin.impl.u2.a
        public void a(l2 l2Var, t2 t2Var) {
            if (l2Var.b() != e1.a.f6405a.ordinal()) {
                return;
            }
            d.a(d1.this, MaxCreativeDebuggerDisplayedAdActivity.class, this.f6314a, new C0107a(l2Var));
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Creative Debugger");
        setContentView(R.layout.mediation_debugger_list_view);
        this.f6312b = (FrameLayout) findViewById(android.R.id.content);
        this.f6313c = (ListView) findViewById(R.id.listView);
        g8.a(this.f6312b, com.applovin.impl.sdk.l.E0);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        e1 e1Var = this.f6311a;
        if (e1Var != null) {
            e1Var.a((u2.a) null);
            this.f6311a.g();
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        VMRunner.invoke("dtaj8OTF5olAJ2qX", new Object[]{this});
    }

    public void a(e1 e1Var, c cVar) {
        this.f6311a = e1Var;
        e1Var.a(new a(cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        TextView textView = new TextView(this);
        textView.setGravity(17);
        textView.setTextSize(18.0f);
        textView.setText(i10);
        this.f6312b.addView(textView, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f6312b.bringChildToFront(textView);
    }
}
