package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import android.view.InputEvent;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: SourceRegistrationRequest.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Uri> f3017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InputEvent f3018b;

    public final InputEvent a() {
        return this.f3018b;
    }

    public final List<Uri> b() {
        return this.f3017a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return t.a(this.f3017a, gVar.f3017a) && t.a(this.f3018b, gVar.f3018b);
    }

    public int hashCode() {
        int iHashCode = this.f3017a.hashCode();
        InputEvent inputEvent = this.f3018b;
        return inputEvent != null ? (iHashCode * 31) + inputEvent.hashCode() : iHashCode;
    }

    public String toString() {
        return "AppSourcesRegistrationRequest { " + ("RegistrationUris=[" + this.f3017a + "], InputEvent=" + this.f3018b) + " }";
    }
}
