package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: MessageLite.java */
/* JADX INFO: loaded from: classes.dex */
public interface p0 extends q0 {

    /* JADX INFO: compiled from: MessageLite.java */
    public interface a extends q0, Cloneable {
        p0 build();

        p0 buildPartial();

        a c(p0 p0Var);

        a e(h hVar, n nVar) throws IOException;
    }

    void a(CodedOutputStream codedOutputStream) throws IOException;

    x0<? extends p0> getParserForType();

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();

    g toByteString();
}
