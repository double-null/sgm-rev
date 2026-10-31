package com.vungle.ads.internal.presenter;

import android.content.Context;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.platform.Platform;
import kotlin.jvm.internal.u;

/* JADX INFO: renamed from: com.vungle.ads.internal.presenter.WebViewManager$preloadWebView$1$1$invoke$lambda-3$$inlined$inject$2, reason: invalid class name */
/* JADX INFO: compiled from: ServiceLocator.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class WebViewManager$preloadWebView$1$1$invoke$lambda3$$inlined$inject$2 extends u implements id.a<Platform> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewManager$preloadWebView$1$1$invoke$lambda3$$inlined$inject$2(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.platform.Platform, java.lang.Object] */
    @Override // id.a
    public final Platform invoke() {
        return ServiceLocator.Companion.getInstance(this.$context).getService(Platform.class);
    }
}
