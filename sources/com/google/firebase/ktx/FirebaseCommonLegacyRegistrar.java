package com.google.firebase.ktx;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.platforminfo.g;
import java.util.List;
import kotlin.collections.s;
import x2.c;

/* JADX INFO: compiled from: Logging.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        return s.e(g.b("fire-core-ktx", "21.0.0"));
    }
}
