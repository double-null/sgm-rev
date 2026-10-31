package b4;

import java.util.UUID;

/* JADX INFO: compiled from: UuidGenerator.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class b1 implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1 f3885a = new b1();

    private b1() {
    }

    @Override // b4.a1
    public UUID next() {
        UUID uuidRandomUUID = UUID.randomUUID();
        kotlin.jvm.internal.t.e(uuidRandomUUID, "randomUUID(...)");
        return uuidRandomUUID;
    }
}
