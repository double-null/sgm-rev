package io.bidmachine.analytics.internal.z;

import com.explorestack.protobuf.BytesValue;
import fd.l;
import io.bidmachine.protobuf.sdk.OSLog;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import wc.g0;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements io.bidmachine.analytics.internal.y.a.InterfaceC0314a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.bidmachine.analytics.internal.p.e f17481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.bidmachine.analytics.internal.p.a f17482b = new io.bidmachine.analytics.internal.p.a();

    public d(io.bidmachine.analytics.internal.p.e eVar) {
        this.f17481a = eVar;
    }

    @Override // io.bidmachine.analytics.internal.y.a.InterfaceC0314a
    public BytesValue a(io.bidmachine.analytics.internal.g.e.a aVar) throws IOException {
        if (!(aVar instanceof io.bidmachine.analytics.internal.g.e.a.C0280a)) {
            throw new IllegalStateException("Check failed.");
        }
        ArrayList arrayList = new ArrayList();
        InputStream inputStreamA = this.f17481a.a(((io.bidmachine.analytics.internal.g.e.a.C0280a) aVar).a());
        if (inputStreamA != null) {
            Reader inputStreamReader = new InputStreamReader(inputStreamA, rd.d.f24999b);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                Iterator<String> it = l.c(bufferedReader).iterator();
                while (it.hasNext()) {
                    io.bidmachine.analytics.internal.p.a.b bVarA = this.f17482b.a(it.next());
                    if (bVarA != null) {
                        arrayList.add(OSLog.Record.newBuilder().setTimestamp(io.bidmachine.analytics.internal.E.c.a(bVarA.d())).setTag(bVarA.c()).setLevel(bVarA.a()).setMessage(bVarA.b()).setSource("").build());
                    }
                }
                g0 g0Var = g0.f27756a;
                fd.b.a(bufferedReader, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    fd.b.a(bufferedReader, th);
                    throw th2;
                }
            }
        }
        if (arrayList.isEmpty()) {
            throw new FileNotFoundException("No records found");
        }
        return BytesValue.newBuilder().setValue(OSLog.newBuilder().addAllRecords(arrayList).build().toByteString()).build();
    }
}
