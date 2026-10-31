package je;

import g7.EinF.ZHgPsTG;
import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: BuiltInSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class q1 implements fe.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q1 f20990a = new q1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final he.f f20991b = p1.f20980a;

    private q1() {
    }

    @Override // fe.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void deserialize(ie.e decoder) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        throw new SerializationException("'kotlin.Nothing' does not have instances");
    }

    @Override // fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return f20991b;
    }

    @Override // fe.m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(ie.f encoder, Void r10) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        kotlin.jvm.internal.t.f(r10, ZHgPsTG.eIucewIdrYgxZyH);
        throw new SerializationException("'kotlin.Nothing' cannot be serialized");
    }
}
