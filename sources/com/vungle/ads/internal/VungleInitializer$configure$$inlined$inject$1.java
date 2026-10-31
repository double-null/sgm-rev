package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.persistence.FilePreferences;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ServiceLocator.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class VungleInitializer$configure$$inlined$inject$1 extends u implements id.a<FilePreferences> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VungleInitializer$configure$$inlined$inject$1(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.persistence.FilePreferences, java.lang.Object] */
    @Override // id.a
    public final FilePreferences invoke() {
        return ServiceLocator.Companion.getInstance(this.$context).getService(FilePreferences.class);
    }
}
