package io.bidmachine.analytics.internal.z;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.BytesValue;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements io.bidmachine.analytics.internal.y.a.InterfaceC0314a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f17480a;

    public c(File file) {
        this.f17480a = file;
    }

    @Override // io.bidmachine.analytics.internal.y.a.InterfaceC0314a
    public BytesValue a(io.bidmachine.analytics.internal.g.e.a aVar) throws IOException {
        if (!(aVar instanceof io.bidmachine.analytics.internal.g.e.a.C0280a)) {
            throw new IllegalStateException("Check failed.");
        }
        BytesValue.Builder builderNewBuilder = BytesValue.newBuilder();
        FileInputStream fileInputStream = new FileInputStream(new File(this.f17480a, io.bidmachine.analytics.internal.E.e.b(((io.bidmachine.analytics.internal.g.e.a.C0280a) aVar).a())));
        try {
            ByteString from = ByteString.readFrom(fileInputStream);
            fd.b.a(fileInputStream, null);
            return builderNewBuilder.setValue(from).build();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fd.b.a(fileInputStream, th);
                throw th2;
            }
        }
    }
}
