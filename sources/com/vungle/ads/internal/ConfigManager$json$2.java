package com.vungle.ads.internal;

import id.l;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import kotlinx.serialization.json.v;
import wc.g0;

/* JADX INFO: compiled from: ConfigManager.kt */
/* JADX INFO: loaded from: classes4.dex */
final class ConfigManager$json$2 extends u implements id.a<kotlinx.serialization.json.b> {
    public static final ConfigManager$json$2 INSTANCE = new ConfigManager$json$2();

    /* JADX INFO: renamed from: com.vungle.ads.internal.ConfigManager$json$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: ConfigManager.kt */
    static final class AnonymousClass1 extends u implements l<kotlinx.serialization.json.e, g0> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ g0 invoke(kotlinx.serialization.json.e eVar) {
            invoke2(eVar);
            return g0.f27756a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(kotlinx.serialization.json.e Json) {
            t.f(Json, "$this$Json");
            Json.f(true);
            Json.d(true);
            Json.e(false);
        }
    }

    ConfigManager$json$2() {
        super(0);
    }

    @Override // id.a
    public final kotlinx.serialization.json.b invoke() {
        return v.b(null, AnonymousClass1.INSTANCE, 1, null);
    }
}
