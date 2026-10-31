package androidx.privacysandbox.ads.adservices.topics;

import java.util.Arrays;
import java.util.Objects;
import kotlin.jvm.internal.t;
import rd.c0;

/* JADX INFO: compiled from: EncryptedTopic.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f3019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f3021c;

    public a(byte[] encryptedTopic, String keyIdentifier, byte[] encapsulatedKey) {
        t.f(encryptedTopic, "encryptedTopic");
        t.f(keyIdentifier, "keyIdentifier");
        t.f(encapsulatedKey, "encapsulatedKey");
        this.f3019a = encryptedTopic;
        this.f3020b = keyIdentifier;
        this.f3021c = encapsulatedKey;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Arrays.equals(this.f3019a, aVar.f3019a) && this.f3020b.contentEquals(aVar.f3020b) && Arrays.equals(this.f3021c, aVar.f3021c);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(Arrays.hashCode(this.f3019a)), this.f3020b, Integer.valueOf(Arrays.hashCode(this.f3021c)));
    }

    public String toString() {
        return "EncryptedTopic { " + ("EncryptedTopic=" + c0.x(this.f3019a) + ", KeyIdentifier=" + this.f3020b + ", EncapsulatedKey=" + c0.x(this.f3021c) + " }");
    }
}
