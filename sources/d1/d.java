package d1;

import com.facebook.internal.AnalyticsEvents;
import java.util.Objects;

/* JADX INFO: compiled from: WebMessageCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e[] f13144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f13145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f13146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f13147d;

    public d(String str, e[] eVarArr) {
        this.f13145b = str;
        this.f13146c = null;
        this.f13144a = eVarArr;
        this.f13147d = 0;
    }

    private void a(int i10) {
        if (i10 == this.f13147d) {
            return;
        }
        throw new IllegalStateException("Wrong data accessor type detected. " + c(this.f13147d) + " expected, but got " + c(i10));
    }

    private String c(int i10) {
        if (i10 != 0) {
            return i10 != 1 ? AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN : "ArrayBuffer";
        }
        return "String";
    }

    public String b() {
        a(0);
        return this.f13145b;
    }

    public d(byte[] bArr, e[] eVarArr) {
        Objects.requireNonNull(bArr);
        this.f13146c = bArr;
        this.f13145b = null;
        this.f13144a = eVarArr;
        this.f13147d = 1;
    }
}
