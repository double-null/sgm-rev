package td;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: UuidJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
final class e implements Externalizable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f25793c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f25794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f25795b;

    /* JADX INFO: compiled from: UuidJVM.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    public e(long j10, long j11) {
        this.f25794a = j10;
        this.f25795b = j11;
    }

    private final Object readResolve() {
        return b.f25788c.a(this.f25794a, this.f25795b);
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) {
        t.f(input, "input");
        this.f25794a = input.readLong();
        this.f25795b = input.readLong();
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) throws IOException {
        t.f(output, "output");
        output.writeLong(this.f25794a);
        output.writeLong(this.f25795b);
    }

    public e() {
        this(0L, 0L);
    }
}
