package androidx.lifecycle;

/* JADX INFO: compiled from: DefaultLifecycleObserverAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f2843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f2844b;

    /* JADX INFO: compiled from: DefaultLifecycleObserverAdapter.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[f.a.values().length];
            try {
                iArr[f.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[f.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[f.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[f.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(c defaultLifecycleObserver, h hVar) {
        kotlin.jvm.internal.t.f(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f2843a = defaultLifecycleObserver;
        this.f2844b = hVar;
    }

    @Override // androidx.lifecycle.h
    public void b(j source, f.a event) {
        kotlin.jvm.internal.t.f(source, "source");
        kotlin.jvm.internal.t.f(event, "event");
        switch (a.$EnumSwitchMapping$0[event.ordinal()]) {
            case 1:
                this.f2843a.a(source);
                break;
            case 2:
                this.f2843a.g(source);
                break;
            case 3:
                this.f2843a.c(source);
                break;
            case 4:
                this.f2843a.d(source);
                break;
            case 5:
                this.f2843a.e(source);
                break;
            case 6:
                this.f2843a.f(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        h hVar = this.f2844b;
        if (hVar != null) {
            hVar.b(source, event);
        }
    }
}
