package com.applovin.impl;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f8156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f8157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f8158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f8159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private t2 f8160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f8161f;

    public void a(int i10) {
        this.f8161f = i10;
    }

    public t2 b() {
        return this.f8160e;
    }

    public int a() {
        return this.f8161f;
    }

    public void a(t2 t2Var) {
        this.f8160e = t2Var;
        this.f8156a.setText(t2Var.k());
        this.f8156a.setTextColor(t2Var.l());
        if (this.f8157b != null) {
            if (!TextUtils.isEmpty(t2Var.f())) {
                this.f8157b.setTypeface(null, 0);
                this.f8157b.setVisibility(0);
                this.f8157b.setText(t2Var.f());
                this.f8157b.setTextColor(t2Var.g());
                if (t2Var.p()) {
                    this.f8157b.setTypeface(null, 1);
                }
            } else {
                this.f8157b.setVisibility(8);
            }
        }
        if (this.f8158c != null) {
            if (t2Var.h() > 0) {
                this.f8158c.setImageResource(t2Var.h());
                this.f8158c.setColorFilter(t2Var.i());
                this.f8158c.setVisibility(0);
            } else {
                this.f8158c.setVisibility(8);
            }
        }
        if (this.f8159d != null) {
            if (t2Var.d() > 0) {
                this.f8159d.setImageResource(t2Var.d());
                this.f8159d.setColorFilter(t2Var.e());
                this.f8159d.setVisibility(0);
                return;
            }
            this.f8159d.setVisibility(8);
        }
    }
}
