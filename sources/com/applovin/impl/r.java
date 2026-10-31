package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes.dex */
public class r extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewGroup f8027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AppLovinSdkUtils.Size f8028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f8029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RelativeLayout f8030d;

    public r(ViewGroup viewGroup, AppLovinSdkUtils.Size size, Activity activity) {
        super(activity, R.style.Theme.Translucent.NoTitleBar);
        this.f8027a = viewGroup;
        this.f8028b = size;
        this.f8029c = activity;
        requestWindowFeature(1);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f8030d.removeView(this.f8027a);
        super.dismiss();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this.f8029c, this.f8028b.getWidth()), AppLovinSdkUtils.dpToPx(this.f8029c, this.f8028b.getHeight()));
        layoutParams.addRule(13);
        this.f8027a.setLayoutParams(layoutParams);
        int iDpToPx = AppLovinSdkUtils.dpToPx(this.f8029c, 60);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        ImageButton imageButton = new ImageButton(this.f8029c);
        imageButton.setLayoutParams(layoutParams2);
        imageButton.setImageDrawable(this.f8029c.getResources().getDrawable(com.applovin.sdk.R.drawable.applovin_ic_x_mark));
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setColorFilter(-1);
        imageButton.setBackground(null);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.ee
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6441a.a(view);
            }
        });
        RelativeLayout relativeLayout = new RelativeLayout(this.f8029c);
        this.f8030d = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f8030d.setBackgroundColor(Integer.MIN_VALUE);
        this.f8030d.addView(imageButton);
        this.f8030d.addView(this.f8027a);
        this.f8030d.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.fe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6598a.b(view);
            }
        });
        setContentView(this.f8030d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        dismiss();
    }
}
