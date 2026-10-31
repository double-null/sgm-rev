package io.bidmachine.media3.exoplayer.drm;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.text.TextUtils;
import c8.b2;
import com.facebook.internal.ServerProtocol;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import x7.a0;
import x7.l0;
import x7.r;

/* JADX INFO: compiled from: FrameworkMediaDrm.java */
/* JADX INFO: loaded from: classes4.dex */
public final class n implements m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m.c f18589d = new m.c() { // from class: g8.n
        @Override // io.bidmachine.media3.exoplayer.drm.m.c
        public final io.bidmachine.media3.exoplayer.drm.m a(UUID uuid) {
            return io.bidmachine.media3.exoplayer.drm.n.C(uuid);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UUID f18590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MediaDrm f18591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18592c;

    /* JADX INFO: compiled from: FrameworkMediaDrm.java */
    private static class a {
        public static boolean a(MediaDrm mediaDrm, String str, int i10) {
            return mediaDrm.requiresSecureDecoder(str, i10);
        }

        public static void b(MediaDrm mediaDrm, byte[] bArr, b2 b2Var) {
            LogSessionId logSessionIdA = b2Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            ((MediaDrm.PlaybackComponent) x7.a.e(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(logSessionIdA);
        }
    }

    private n(UUID uuid) throws UnsupportedSchemeException {
        x7.a.e(uuid);
        x7.a.b(!u7.f.f26060b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f18590a = uuid;
        MediaDrm mediaDrm = new MediaDrm(u(uuid));
        this.f18591b = mediaDrm;
        this.f18592c = 1;
        if (u7.f.f26062d.equals(uuid) && D()) {
            x(mediaDrm);
        }
    }

    private boolean A() {
        if (!this.f18590a.equals(u7.f.f26062d)) {
            return this.f18590a.equals(u7.f.f26061c);
        }
        String strY = y(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION);
        return (strY.startsWith("v5.") || strY.startsWith("14.") || strY.startsWith("15.") || strY.startsWith("16.0")) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(m.b bVar, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        bVar.a(this, bArr, i10, i11, bArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ m C(UUID uuid) {
        try {
            return E(uuid);
        } catch (UnsupportedDrmException unused) {
            r.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new k();
        }
    }

    private static boolean D() {
        return "ASUS_Z00AD".equals(Build.MODEL);
    }

    public static n E(UUID uuid) throws UnsupportedDrmException {
        try {
            return new n(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new UnsupportedDrmException(1, e10);
        } catch (Exception e11) {
            throw new UnsupportedDrmException(2, e11);
        }
    }

    private static byte[] p(byte[] bArr) {
        a0 a0Var = new a0(bArr);
        int iU = a0Var.u();
        short sW = a0Var.w();
        short sW2 = a0Var.w();
        if (sW != 1 || sW2 != 1) {
            r.f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        String strF = a0Var.F(a0Var.w(), StandardCharsets.UTF_16LE);
        if (strF.contains("<LA_URL>")) {
            return bArr;
        }
        int iIndexOf = strF.indexOf("</DATA>");
        if (iIndexOf == -1) {
            r.h("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = strF.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strF.substring(iIndexOf);
        int i10 = iU + 52;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i10);
        byteBufferAllocate.putShort(sW);
        byteBufferAllocate.putShort(sW2);
        byteBufferAllocate.putShort((short) (str.length() * 2));
        byteBufferAllocate.put(str.getBytes(StandardCharsets.UTF_16LE));
        return byteBufferAllocate.array();
    }

    private String q(String str) {
        if ("<LA_URL>https://x</LA_URL>".equals(str)) {
            return "";
        }
        if (l0.f28136a >= 33 && "https://default.url".equals(str)) {
            String strY = y(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION);
            if (Objects.equals(strY, "1.2") || Objects.equals(strY, "aidl-1")) {
                return "";
            }
        }
        return str;
    }

    private static byte[] r(UUID uuid, byte[] bArr) {
        return u7.f.f26061c.equals(uuid) ? io.bidmachine.media3.exoplayer.drm.a.a(bArr) : bArr;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0074 A[RETURN] */
    private static byte[] s(UUID uuid, byte[] bArr) {
        byte[] bArrE;
        p9.p.a aVarD;
        UUID uuid2 = u7.f.f26063e;
        if (uuid2.equals(uuid)) {
            byte[] bArrE2 = p9.p.e(bArr, uuid);
            if (bArrE2 != null) {
                bArr = bArrE2;
            }
            bArr = p9.p.a(uuid2, p(bArr));
        }
        if (v(uuid) && (aVarD = p9.p.d(bArr)) != null) {
            bArr = p9.p.b(u7.f.f26060b, aVarD.f23658d, aVarD.f23657c);
        }
        if (l0.f28136a < 23 && u7.f.f26062d.equals(uuid)) {
            bArrE = p9.p.e(bArr, uuid);
            if (bArrE != null) {
                return bArrE;
            }
        } else if (uuid2.equals(uuid) && "Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTB".equals(str) || "AFTS".equals(str) || "AFTM".equals(str) || "AFTT".equals(str)) {
                bArrE = p9.p.e(bArr, uuid);
                if (bArrE != null) {
                    return bArrE;
                }
            }
        }
        return bArr;
    }

    private static String t(UUID uuid, String str) {
        return (l0.f28136a < 26 && u7.f.f26061c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    private static UUID u(UUID uuid) {
        return v(uuid) ? u7.f.f26060b : uuid;
    }

    private static boolean v(UUID uuid) {
        return l0.f28136a < 27 && Objects.equals(uuid, u7.f.f26061c);
    }

    private static void x(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static u7.l.b z(UUID uuid, List<u7.l.b> list) {
        boolean z10;
        if (!u7.f.f26062d.equals(uuid)) {
            return list.get(0);
        }
        if (l0.f28136a >= 28 && list.size() > 1) {
            u7.l.b bVar = list.get(0);
            int i10 = 0;
            int length = 0;
            while (true) {
                if (i10 >= list.size()) {
                    z10 = true;
                    break;
                }
                u7.l.b bVar2 = list.get(i10);
                byte[] bArr = (byte[]) x7.a.e(bVar2.f26201e);
                if (!Objects.equals(bVar2.f26200d, bVar.f26200d) || !Objects.equals(bVar2.f26199c, bVar.f26199c) || !p9.p.c(bArr)) {
                    z10 = false;
                    break;
                }
                length += bArr.length;
                i10++;
            }
            if (z10) {
                byte[] bArr2 = new byte[length];
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    byte[] bArr3 = (byte[]) x7.a.e(list.get(i12).f26201e);
                    int length2 = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i11, length2);
                    i11 += length2;
                }
                return bVar.b(bArr2);
            }
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            u7.l.b bVar3 = list.get(i13);
            int iG = p9.p.g((byte[]) x7.a.e(bVar3.f26201e));
            int i14 = l0.f28136a;
            if (i14 < 23 && iG == 0) {
                return bVar3;
            }
            if (i14 >= 23 && iG == 1) {
                return bVar3;
            }
        }
        return list.get(0);
    }

    @Override // io.bidmachine.media3.exoplayer.drm.m
    public Map<String, String> a(byte[] bArr) {
        return this.f18591b.queryKeyStatus(bArr);
    }

    @Override // io.bidmachine.media3.exoplayer.drm.m
    public m.d b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f18591b.getProvisionRequest();
        return new m.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // io.bidmachine.media3.exoplayer.drm.m
    public byte[] c() throws MediaDrmException {
        return this.f18591b.openSession();
    }

    @Override // io.bidmachine.media3.exoplayer.drm.m
    public void d(byte[] bArr, byte[] bArr2) {
        this.f18591b.restoreKeys(bArr, bArr2);
    }

    @Override // io.bidmachine.media3.exoplayer.drm.m
    public void e(byte[] bArr) throws DeniedByServerException {
        this.f18591b.provideProvisionResponse(bArr);
    }

    @Override // io.bidmachine.media3.exoplayer.drm.m
    public int f() {
        return 2;
    }

    @Override // io.bidmachine.media3.exoplayer.drm.m
    public void g(byte[] bArr, b2 b2Var) {
        if (l0.f28136a >= 31) {
            try {
                a.b(this.f18591b, bArr, b2Var);
            } catch (UnsupportedOperationException unused) {
                r.h("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // io.bidmachine.media3.exoplayer.drm.m
    public boolean i(byte[] bArr, String str) throws Throwable {
        boolean zRequiresSecureDecoderComponent;
        if (l0.f28136a >= 31 && A()) {
            MediaDrm mediaDrm = this.f18591b;
            return a.a(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
        }
        MediaCrypto mediaCrypto = null;
        try {
            try {
                MediaCrypto mediaCrypto2 = new MediaCrypto(u(this.f18590a), bArr);
                try {
                    zRequiresSecureDecoderComponent = mediaCrypto2.requiresSecureDecoderComponent(str);
                    mediaCrypto2.release();
                } catch (MediaCryptoException unused) {
                    mediaCrypto = mediaCrypto2;
                    zRequiresSecureDecoderComponent = !this.f18590a.equals(u7.f.f26061c);
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                } catch (Throwable th) {
                    th = th;
                    mediaCrypto = mediaCrypto2;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (MediaCryptoException unused2) {
        }
        return zRequiresSecureDecoderComponent;
    }

    @Override // io.bidmachine.media3.exoplayer.drm.m
    public void j(byte[] bArr) {
        this.f18591b.closeSession(bArr);
    }

    @Override // io.bidmachine.media3.exoplayer.drm.m
    public void k(final m.b bVar) {
        this.f18591b.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() { // from class: g8.o
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                this.f15532a.B(bVar, mediaDrm, bArr, i10, i11, bArr2);
            }
        });
    }

    @Override // io.bidmachine.media3.exoplayer.drm.m
    public byte[] l(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException {
        if (u7.f.f26061c.equals(this.f18590a)) {
            bArr2 = io.bidmachine.media3.exoplayer.drm.a.b(bArr2);
        }
        return this.f18591b.provideKeyResponse(bArr, bArr2);
    }

    @Override // io.bidmachine.media3.exoplayer.drm.m
    public m.a m(byte[] bArr, List<u7.l.b> list, int i10, HashMap<String, String> map) throws NotProvisionedException {
        u7.l.b bVarZ;
        byte[] bArrS;
        String strT;
        if (list != null) {
            bVarZ = z(this.f18590a, list);
            bArrS = s(this.f18590a, (byte[]) x7.a.e(bVarZ.f26201e));
            strT = t(this.f18590a, bVarZ.f26200d);
        } else {
            bVarZ = null;
            bArrS = null;
            strT = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f18591b.getKeyRequest(bArr, bArrS, strT, i10, map);
        byte[] bArrR = r(this.f18590a, keyRequest.getData());
        String strQ = q(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(strQ) && bVarZ != null && !TextUtils.isEmpty(bVarZ.f26199c)) {
            strQ = bVarZ.f26199c;
        }
        return new m.a(bArrR, strQ, l0.f28136a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // io.bidmachine.media3.exoplayer.drm.m
    public synchronized void release() {
        int i10 = this.f18592c - 1;
        this.f18592c = i10;
        if (i10 == 0) {
            this.f18591b.release();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.drm.m
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public g8.l h(byte[] bArr) throws MediaCryptoException {
        return new g8.l(u(this.f18590a), bArr);
    }

    public String y(String str) {
        return this.f18591b.getPropertyString(str);
    }
}
