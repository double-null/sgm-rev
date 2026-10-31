package kotlinx.serialization;

import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: SerializationExceptions.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class MissingFieldException extends SerializationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f21544a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(List<String> missingFields, String str, Throwable th) {
        super(str, th);
        t.f(missingFields, "missingFields");
        this.f21544a = missingFields;
    }

    public final List<String> b() {
        return this.f21544a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MissingFieldException(List<String> missingFields, String serialName) {
        String str;
        t.f(missingFields, "missingFields");
        t.f(serialName, "serialName");
        if (missingFields.size() == 1) {
            str = "Field '" + missingFields.get(0) + "' is required for type with serial name '" + serialName + "', but it was missing";
        } else {
            str = "Fields " + missingFields + " are required for type with serial name '" + serialName + "', but they were missing";
        }
        this(missingFields, str, null);
    }
}
