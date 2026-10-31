package com.unity3d.player;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes4.dex */
final class P extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Button f12773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected EditText f12774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Context f12775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Rect f12776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected Rect f12777e;

    public P(Context context, EditText editText) {
        super(context);
        this.f12774b = editText;
        this.f12775c = context;
        this.f12776d = new Rect(16, 16, 16, 16);
        this.f12777e = new Rect(0, 0, 0, 0);
        createUI();
        setBackgroundColor(-1);
    }

    protected void createUI() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        Button button = new Button(this.f12775c);
        this.f12773a = button;
        button.setId(View.generateViewId());
        this.f12773a.setText(this.f12775c.getResources().getIdentifier("ok", "string", "android"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        layoutParams.addRule(11);
        this.f12773a.setLayoutParams(layoutParams);
        this.f12773a.setBackgroundColor(0);
        addView(this.f12773a);
        this.f12774b.setId(View.generateViewId());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(15);
        layoutParams2.addRule(0, this.f12773a.getId());
        this.f12774b.setLayoutParams(layoutParams2);
        addView(this.f12774b);
        Rect rect = this.f12776d;
        setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f12773a.setOnClickListener(onClickListener);
    }
}
