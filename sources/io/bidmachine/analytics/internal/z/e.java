package io.bidmachine.analytics.internal.z;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.BytesValue;
import io.bidmachine.analytics.internal.q.g;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements io.bidmachine.analytics.internal.y.a.InterfaceC0314a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f17483a;

    public e(g gVar) {
        this.f17483a = gVar;
    }

    @Override // io.bidmachine.analytics.internal.y.a.InterfaceC0314a
    public BytesValue a(io.bidmachine.analytics.internal.g.e.a aVar) throws FileNotFoundException {
        io.bidmachine.analytics.internal.q.a aVarA = this.f17483a.a();
        if (aVarA == null) {
            throw new FileNotFoundException("No data received yet");
        }
        if (aVarA.f()) {
            throw new FileNotFoundException("Empty data");
        }
        return BytesValue.newBuilder().setValue(ByteString.readFrom(new ByteArrayInputStream(aVarA.toString().getBytes(rd.d.f24999b)))).build();
    }
}
