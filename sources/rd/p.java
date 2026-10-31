package rd;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class p {
    /* JADX INFO: Access modifiers changed from: private */
    public static final l c(Matcher matcher, int i10, CharSequence charSequence) {
        if (matcher.find(i10)) {
            return new m(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final od.h d(MatchResult matchResult, int i10) {
        return od.k.n(matchResult.start(i10), matchResult.end(i10));
    }
}
