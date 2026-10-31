package io.bidmachine.analytics.internal.s;

import io.bidmachine.analytics.ReaderConfig;
import java.io.File;
import java.io.FileNotFoundException;
import zc.f;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends io.bidmachine.analytics.internal.n.a {
    public abstract File a(ReaderConfig.Rule rule);

    @Override // io.bidmachine.analytics.internal.n.a
    public Object a(ReaderConfig.Rule rule, f fVar) {
        return a(this, rule, fVar);
    }

    static /* synthetic */ Object a(a aVar, ReaderConfig.Rule rule, f fVar) throws FileNotFoundException {
        File fileA = aVar.a(rule);
        if (!fileA.exists()) {
            throw new FileNotFoundException();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(fileA.lastModified());
        sb2.append('_');
        sb2.append(fileA.length());
        return sb2.toString();
    }
}
