package xc;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.collections.n0;
import kotlin.collections.o0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
final class i implements Externalizable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f28470b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<?, ?> f28471a;

    /* JADX INFO: compiled from: MapBuilder.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    public i(Map<?, ?> map) {
        t.f(map, "map");
        this.f28471a = map;
    }

    private final Object readResolve() {
        return this.f28471a;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) throws IOException {
        t.f(input, "input");
        byte b10 = input.readByte();
        if (b10 != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b10));
        }
        int i10 = input.readInt();
        if (i10 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i10 + '.');
        }
        Map mapD = n0.d(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            mapD.put(input.readObject(), input.readObject());
        }
        this.f28471a = n0.b(mapD);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) throws IOException {
        t.f(output, "output");
        output.writeByte(0);
        output.writeInt(this.f28471a.size());
        for (Map.Entry<?, ?> entry : this.f28471a.entrySet()) {
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }

    public i() {
        this(o0.h());
    }
}
