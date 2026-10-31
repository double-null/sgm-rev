package w7;

import android.os.Bundle;
import x7.l0;

/* JADX INFO: compiled from: VoiceSpan.java */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f27597b = l0.C0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27598a;

    public i(String str) {
        this.f27598a = str;
    }

    public static i a(Bundle bundle) {
        return new i((String) x7.a.e(bundle.getString(f27597b)));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(f27597b, this.f27598a);
        return bundle;
    }
}
