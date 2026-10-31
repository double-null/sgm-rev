package com.applovin.impl;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: classes.dex */
public class q1 extends t2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final r1 f7938n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Context f7939o;

    public q1(r1 r1Var, Context context) {
        super(t2.c.DETAIL);
        this.f7938n = r1Var;
        this.f7939o = context;
        this.f8761c = r();
        this.f8762d = q();
    }

    private SpannedString q() {
        return new SpannedString("Displayed " + q7.a(this.f7938n.b(), true));
    }

    private SpannedString r() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f7938n.d());
        spannableStringBuilder.append((CharSequence) " - ");
        spannableStringBuilder.append((CharSequence) this.f7938n.f());
        return new SpannedString(spannableStringBuilder);
    }

    @Override // com.applovin.impl.t2
    public int d() {
        return o() ? R.drawable.applovin_ic_disclosure_arrow : super.h();
    }

    @Override // com.applovin.impl.t2
    public int e() {
        return this.f7939o.getColor(R.color.applovin_sdk_disclosureButtonColor);
    }

    @Override // com.applovin.impl.t2
    public boolean o() {
        return true;
    }
}
