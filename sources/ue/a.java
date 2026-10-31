package ue;

/* JADX INFO: compiled from: ErrorCode.kt */
/* JADX INFO: loaded from: classes5.dex */
public enum a {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0443a f26842b = new C0443a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26858a;

    /* JADX INFO: renamed from: ue.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ErrorCode.kt */
    public static final class C0443a {
        private C0443a() {
        }

        public /* synthetic */ C0443a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final a a(int i10) {
            for (a aVar : a.values()) {
                if (aVar.c() == i10) {
                    return aVar;
                }
            }
            return null;
        }
    }

    a(int i10) {
        this.f26858a = i10;
    }

    public final int c() {
        return this.f26858a;
    }
}
