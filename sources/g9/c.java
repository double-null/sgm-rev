package g9;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: EventMessageEncoder.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f15542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DataOutputStream f15543b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f15542a = byteArrayOutputStream;
        this.f15543b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(a aVar) {
        this.f15542a.reset();
        try {
            b(this.f15543b, aVar.f15536a);
            String str = aVar.f15537b;
            if (str == null) {
                str = "";
            }
            b(this.f15543b, str);
            this.f15543b.writeLong(aVar.f15538c);
            this.f15543b.writeLong(aVar.f15539d);
            this.f15543b.write(aVar.f15540e);
            this.f15543b.flush();
            return this.f15542a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
