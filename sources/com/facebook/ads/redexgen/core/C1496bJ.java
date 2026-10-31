package com.facebook.ads.redexgen.core;

import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1496bJ extends FrameLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final KE A02;
    public static final int A05 = (int) (AbstractC1324Wl.A02 * 36.0f);
    public static final int A06 = (int) (AbstractC1324Wl.A02 * 36.0f);
    public static final int A03 = (int) (AbstractC1324Wl.A02 * 23.0f);
    public static final int A04 = (int) (AbstractC1324Wl.A02 * 3.0f);
    public static final int A07 = (int) (AbstractC1324Wl.A02 * 4.0f);

    public C1496bJ(C1621dL c1621dL, KE ke2, AbstractC1896hy abstractC1896hy, US us, InterfaceC1352Xn interfaceC1352Xn, C1694eX c1694eX, XH xh, C1084My c1084My, InterfaceC1421a4 interfaceC1421a4) {
        super(c1621dL);
        this.A00 = c1084My.A09(true);
        this.A01 = new RelativeLayout(c1621dL);
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        this.A01.setClickable(false);
        A01(c1621dL, abstractC1896hy.A20().A0J().A04());
        if (ke2 == null) {
            this.A02 = new KE(c1621dL, abstractC1896hy.A0r(), (C1084My) null, us, interfaceC1352Xn, c1694eX, xh, abstractC1896hy.A21());
        } else {
            this.A02 = ke2;
        }
        A03();
        this.A02.setCta(abstractC1896hy.A20().A0J(), abstractC1896hy.A25(), new HashMap(), interfaceC1421a4);
        this.A02.setIsInAppBrowser(true);
        FrameLayout.LayoutParams ctaButtonParams = new FrameLayout.LayoutParams(-1, -1);
        addView(this.A02, ctaButtonParams);
    }

    private void A00(C1621dL c1621dL, View view) {
        ImageView imageView = new ImageView(c1621dL);
        imageView.setImageBitmap(XY.A01(XX.MINIMIZE_ARROW));
        imageView.setRotation(180.0f);
        imageView.setClickable(false);
        imageView.setColorFilter(this.A00);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A03, A03);
        imageView.setPadding(A04, A04, A04, A04);
        layoutParams.addRule(2, view.getId());
        layoutParams.addRule(14);
        this.A01.addView(imageView, layoutParams);
    }

    private void A01(C1621dL c1621dL, String str) {
        Button button = new Button(c1621dL);
        XP.A0I(button);
        button.setPadding(A06, 0, A06, 0);
        button.setText(str.toUpperCase(Locale.getDefault()));
        button.setTextSize(14.0f);
        button.setTypeface(Typeface.defaultFromStyle(1));
        XP.A0M(button, this.A00, A07);
        button.setTextColor(-16777216);
        RelativeLayout.LayoutParams ctaParams = new RelativeLayout.LayoutParams(-2, A05);
        ctaParams.addRule(12);
        ctaParams.addRule(14);
        this.A01.addView(button, ctaParams);
        A00(c1621dL, button);
    }

    public final ME A02(String str) {
        return this.A02.A0E(str);
    }

    public final void A03() {
        this.A02.setBackgroundColor(0);
        this.A02.setTextColor(0);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return this.A02.performClick();
    }

    public void setAutoClickTime(AbstractC1896hy abstractC1896hy, AbstractC1351Xm abstractC1351Xm) {
        this.A02.A0F(abstractC1896hy, abstractC1351Xm);
    }

    public void setCta(C1085Mz c1085Mz, String str, HashMap<String, String> extras, InterfaceC1421a4 interfaceC1421a4) {
        this.A02.setCta(c1085Mz, str, extras, interfaceC1421a4);
    }
}
