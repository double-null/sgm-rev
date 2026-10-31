package io.bidmachine.iab.mraid;

import android.content.Context;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f17670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f17671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f17672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f17673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f17674e;

    public d0(Context context, String[] strArr) {
        this(context, (List<String>) (strArr != null ? Arrays.asList(strArr) : null));
    }

    private boolean a(String str, List list) {
        return list != null && list.contains(str);
    }

    public boolean b() {
        return this.f17673d;
    }

    public boolean c() {
        return this.f17672c;
    }

    public boolean d() {
        return this.f17670a;
    }

    public boolean e() {
        return this.f17674e;
    }

    public boolean f() {
        return this.f17671b;
    }

    public d0(Context context, List<String> list) {
        g7.w wVar = new g7.w(context);
        this.f17670a = a("sms", list) && wVar.a();
        this.f17671b = a("tel", list) && wVar.a();
        this.f17672c = a("inlineVideo", list);
        this.f17673d = a("calendar", list);
        this.f17674e = a("storePicture", list);
    }
}
