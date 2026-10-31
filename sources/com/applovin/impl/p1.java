package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class p1 extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r1 f7816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.applovin.impl.sdk.l f7817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f7818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Button f7819d;

    private void b() {
        x2 x2Var = new x2();
        x2Var.a(this.f7817b.z().a(this.f7816a));
        String strB = this.f7817b.z().b(this.f7816a);
        if (strB != null) {
            x2Var.a("\nBid Response Preview:\n");
            x2Var.a(strB);
        }
        TextView textView = (TextView) findViewById(R.id.email_report_tv);
        this.f7818c = textView;
        textView.setText(x2Var.toString());
        this.f7818c.setTextColor(-16777216);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!a()) {
            finish();
            return;
        }
        setTitle(this.f7816a.d() + " - " + this.f7816a.f());
        setContentView(R.layout.creative_debugger_displayed_ad_detail_activity);
        b();
        g8.a(findViewById(android.R.id.content), this.f7817b);
        Button button = (Button) findViewById(R.id.report_ad_button);
        this.f7819d = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.id
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6860a.a(view);
            }
        });
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.creative_debugger_displayed_ad_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!a()) {
            finish();
            return false;
        }
        if (R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.f7817b.z().a(this.f7816a, (Context) this, false);
        return true;
    }

    public void a(r1 r1Var, com.applovin.impl.sdk.l lVar) {
        this.f7816a = r1Var;
        this.f7817b = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.f7817b.z().a(this.f7816a, (Context) this, true);
    }

    private boolean a() {
        return (this.f7816a == null || this.f7817b == null) ? false : true;
    }
}
