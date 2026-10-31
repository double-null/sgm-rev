package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.applovin.impl.e2;

/* JADX INFO: loaded from: classes.dex */
public class k extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e2 f6083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f6084b;

    interface a {
        void a();

        void b();
    }

    public k(e2 e2Var, Context context) {
        super(context);
        this.f6083a = e2Var;
        setClickable(false);
        setFocusable(false);
    }

    public boolean a() {
        return this.f6084b;
    }

    public void b() {
        a(null);
    }

    public String getIdentifier() {
        return this.f6083a.b();
    }

    public void a(a aVar) {
        if (this.f6084b) {
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        Drawable drawableA = this.f6083a.a();
        if (drawableA == null) {
            if (aVar != null) {
                aVar.b();
            }
        } else {
            setBackground(drawableA);
            this.f6084b = true;
            if (aVar != null) {
                aVar.a();
            }
        }
    }
}
