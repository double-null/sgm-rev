package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: CallableReference.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class f implements pd.b, Serializable {
    public static final Object NO_RECEIVER = a.f21510a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient pd.b reflected;
    private final String signature;

    /* JADX INFO: compiled from: CallableReference.java */
    private static class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f21510a = new a();

        private a() {
        }

        private Object readResolve() throws ObjectStreamException {
            return f21510a;
        }
    }

    public f() {
        this(NO_RECEIVER);
    }

    @Override // pd.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // pd.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public pd.b compute() {
        pd.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        pd.b bVarComputeReflected = computeReflected();
        this.reflected = bVarComputeReflected;
        return bVarComputeReflected;
    }

    protected abstract pd.b computeReflected();

    @Override // pd.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public pd.f getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? i0.c(cls) : i0.b(cls);
    }

    @Override // pd.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    protected pd.b getReflected() {
        pd.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute;
        }
        throw new hd.b();
    }

    @Override // pd.b
    public pd.l getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // pd.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // pd.b
    public pd.o getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // pd.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // pd.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // pd.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // pd.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    protected f(Object obj) {
        this(obj, null, null, null, false);
    }

    protected f(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }
}
