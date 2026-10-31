package io.bidmachine.analytics.internal.g;

import io.bidmachine.analytics.ReaderConfig;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f {
    public static final e.a a(ReaderConfig.Rule rule) {
        if (rule instanceof ReaderConfig.Rule.GeneralRule) {
            ReaderConfig.Rule.GeneralRule generalRule = (ReaderConfig.Rule.GeneralRule) rule;
            return new e.a.C0280a(generalRule.getTag(), generalRule.getPath());
        }
        if (!(rule instanceof ReaderConfig.Rule.PurRule)) {
            throw new NoWhenBranchMatchedException();
        }
        ReaderConfig.Rule.PurRule purRule = (ReaderConfig.Rule.PurRule) rule;
        return new e.a.b(purRule.getTag(), purRule.getPath(), purRule.getQuery(), purRule.getShouldReport());
    }
}
