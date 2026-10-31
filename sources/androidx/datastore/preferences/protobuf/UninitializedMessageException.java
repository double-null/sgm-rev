package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class UninitializedMessageException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f2097a;

    public UninitializedMessageException(p0 p0Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f2097a = null;
    }

    public InvalidProtocolBufferException b() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
