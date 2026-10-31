package io.bidmachine.media3.common;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class ParserException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17919b;

    protected ParserException(String str, Throwable th, boolean z10, int i10) {
        super(str, th);
        this.f17918a = z10;
        this.f17919b = i10;
    }

    public static ParserException b(String str, Throwable th) {
        return new ParserException(str, th, true, 1);
    }

    public static ParserException c(String str, Throwable th) {
        return new ParserException(str, th, true, 0);
    }

    public static ParserException e(String str, Throwable th) {
        return new ParserException(str, th, true, 4);
    }

    public static ParserException f(String str) {
        return new ParserException(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        String message = super.getMessage();
        StringBuilder sb2 = new StringBuilder();
        if (message != null) {
            str = message + " ";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append("{contentIsMalformed=");
        sb2.append(this.f17918a);
        sb2.append(", dataType=");
        sb2.append(this.f17919b);
        sb2.append("}");
        return sb2.toString();
    }
}
