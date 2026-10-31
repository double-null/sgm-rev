package io.bidmachine.media3.exoplayer.source;

import android.net.Uri;
import io.bidmachine.media3.common.ParserException;
import java.util.List;
import v8.n0;

/* JADX INFO: loaded from: classes4.dex */
public class UnrecognizedInputFormatException extends ParserException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f19416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.common.collect.u<n0> f19417d;

    public UnrecognizedInputFormatException(String str, Uri uri, List<? extends n0> list) {
        super(str, null, false, 1);
        this.f19416c = uri;
        this.f19417d = com.google.common.collect.u.B(list);
    }
}
