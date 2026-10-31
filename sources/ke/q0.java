package ke;

/* JADX INFO: compiled from: JsonStreams.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class q0 {
    public static final <T> T a(kotlinx.serialization.json.b json, fe.c<? extends T> deserializer, f0 reader) {
        kotlin.jvm.internal.t.f(json, "json");
        kotlin.jvm.internal.t.f(deserializer, "deserializer");
        kotlin.jvm.internal.t.f(reader, "reader");
        b1 b1VarB = c1.b(json, reader, null, 4, null);
        try {
            T t10 = (T) new e1(json, o1.OBJ, b1VarB, deserializer.getDescriptor(), null).C(deserializer);
            b1VarB.v();
            return t10;
        } finally {
            b1VarB.V();
        }
    }

    public static final <T> void b(kotlinx.serialization.json.b json, g0 writer, fe.m<? super T> serializer, T t10) {
        kotlin.jvm.internal.t.f(json, "json");
        kotlin.jvm.internal.t.f(writer, "writer");
        kotlin.jvm.internal.t.f(serializer, "serializer");
        new f1(writer, json, o1.OBJ, new kotlinx.serialization.json.t[o1.c().size()]).q(serializer, t10);
    }
}
