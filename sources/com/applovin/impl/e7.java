package com.applovin.impl;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class e7 extends p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.l f6425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f6427c;

    private void a() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", this.f6427c);
        intent.putExtra("android.intent.extra.TITLE", this.f6426b);
        intent.putExtra("android.intent.extra.SUBJECT", this.f6426b);
        startActivity(Intent.createChooser(intent, null));
    }

    @Override // com.applovin.impl.p3
    protected com.applovin.impl.sdk.l getSdk() {
        return this.f6425a;
    }

    public void initialize(String str, String str2, com.applovin.impl.sdk.l lVar) {
        this.f6425a = lVar;
        this.f6426b = str;
        this.f6427c = str2;
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_text_view_activity);
        setTitle(this.f6426b);
        ((TextView) findViewById(R.id.textView)).setText(this.f6427c);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        a();
        return true;
    }
}
