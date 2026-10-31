package x;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: AccessibilityClickableSpanCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f27899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f27900c;

    public a(int i10, p pVar, int i11) {
        this.f27898a = i10;
        this.f27899b = pVar;
        this.f27900c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f27898a);
        this.f27899b.T(this.f27900c, bundle);
    }
}
