package com.facebook.ads.redexgen.core;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class SurfaceHolderCallbackC2204nI implements InterfaceC0894Fo, C8D, InterfaceC0844Dq, B3, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public static String[] A01 = {"mdkndyL3N", "34XFwDl9WvKoMHQUixXhMeiNQCyC6vNP", "5uafIaN5", "lxzaK8fg5Pf0nzPouXyzPKk1aT8cB3T1", "DTIJ", "0UAV", "B5vkeIjqEzHsmqRbylQSobdgrKqNmXUo", "pkzfV8UoB1KOSL3E8gfET47OMeTC19My"};
    public final /* synthetic */ C9V A00;

    @Override // com.facebook.ads.redexgen.core.C8D
    public final /* synthetic */ void ACT(C2298or c2298or, C06455j c06455j) {
    }

    @Override // com.facebook.ads.redexgen.core.C8D
    public final /* synthetic */ void ACU(long j10) {
    }

    @Override // com.facebook.ads.redexgen.core.C8D
    public final /* synthetic */ void ACV(Exception exc) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0894Fo
    public final /* synthetic */ void ACr(int i10, long j10) {
    }

    @Override // com.facebook.ads.redexgen.core.C8D
    public final /* synthetic */ void AFF(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0894Fo
    public final /* synthetic */ void AFl(C2298or c2298or, C06455j c06455j) {
    }

    public SurfaceHolderCallbackC2204nI(C9V c9v) {
        this.A00 = c9v;
    }

    @Override // com.facebook.ads.redexgen.core.C8D
    public final void ACP(String str, long j10, long j11) {
        Iterator it = this.A00.A0H.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A01[1].charAt(3) != 'F') {
                throw new RuntimeException();
            }
            A01[3] = "1hpUDXdDopjYnxDN8fIPsNGSxN8OzRvU";
            if (zHasNext) {
                ((C8D) it.next()).ACP(str, j10, j11);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.C8D
    public final void ACQ(C06425g c06425g) {
        Iterator it = this.A00.A0H.iterator();
        while (it.hasNext()) {
            ((C8D) it.next()).ACQ(c06425g);
        }
        this.A00.A07 = null;
        this.A00.A09 = null;
        this.A00.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.core.C8D
    public final void ACR(C06425g c06425g) {
        this.A00.A09 = c06425g;
        Iterator it = this.A00.A0H.iterator();
        while (it.hasNext()) {
            ((C8D) it.next()).ACR(c06425g);
        }
    }

    @Override // com.facebook.ads.redexgen.core.C8D
    public final void ACS(C2298or c2298or) {
        this.A00.A07 = c2298or;
        Iterator it = this.A00.A0H.iterator();
        while (it.hasNext()) {
            ((C8D) it.next()).ACS(c2298or);
        }
    }

    @Override // com.facebook.ads.redexgen.core.C8D
    public final void ACY(int i10, long j10, long j11) {
        Iterator it = this.A00.A0H.iterator();
        while (it.hasNext()) {
            ((C8D) it.next()).ACY(i10, j10, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0844Dq
    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Required until we deprecate and move ComponentListener to ExoPlayerImpl.")
    public final void ACv(C2247o0 c2247o0) {
        Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((InterfaceC05762s) it.next()).ACv(c2247o0);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0844Dq
    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Required until we deprecate and move ComponentListener to ExoPlayerImpl.")
    public final void ACw(List<C2249o2> list) {
        Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((InterfaceC05762s) it.next()).ACw(list);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0894Fo
    public final void AD7(int i10, long j10) {
        Iterator it = this.A00.A0K.iterator();
        while (it.hasNext()) {
            ((InterfaceC0894Fo) it.next()).AD7(i10, j10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.B3
    public final void AEE(Metadata metadata, long j10) {
        Iterator it = this.A00.A0J.iterator();
        while (it.hasNext()) {
            ((B3) it.next()).AEE(metadata, j10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0894Fo
    public final void AEx(Object obj, long j10) {
        if (this.A00.A03 == obj) {
            Iterator it = this.A00.A0L.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        Iterator it2 = this.A00.A0K.iterator();
        while (it2.hasNext()) {
            ((InterfaceC0894Fo) it2.next()).AEx(obj, j10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0894Fo
    public final void AFd(String str, long j10, long j11) {
        Iterator it = this.A00.A0K.iterator();
        while (it.hasNext()) {
            ((InterfaceC0894Fo) it.next()).AFd(str, j10, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0894Fo
    public final void AFe(C06425g c06425g) {
        Iterator it = this.A00.A0K.iterator();
        while (it.hasNext()) {
            ((InterfaceC0894Fo) it.next()).AFe(c06425g);
        }
        this.A00.A08 = null;
        this.A00.A0A = null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0894Fo
    public final void AFf(C06425g c06425g) {
        this.A00.A0A = c06425g;
        Iterator it = this.A00.A0K.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A01[0].length() != 9) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[7] = "MKCckBbCZrSSu6G06Z7NkbaNocq2WvpN";
            strArr[6] = "V8qjKHPFdvtphjyj0wrcUTYdTARdRgua";
            if (zHasNext) {
                ((InterfaceC0894Fo) it.next()).AFf(c06425g);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0894Fo
    public final void AFk(C2298or c2298or) {
        this.A00.A08 = c2298or;
        Iterator it = this.A00.A0K.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A01[1].charAt(3) != 'F') {
                throw new RuntimeException();
            }
            A01[3] = "2z1T7IcDfmpzuxqypnwVKmOXmU8bKGPo";
            if (zHasNext) {
                ((InterfaceC0894Fo) it.next()).AFk(c2298or);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0894Fo
    public final void AFr(C2251o4 c2251o4) {
        Iterator it = this.A00.A0L.iterator();
        while (it.hasNext()) {
            ((InterfaceC06194j) it.next()).AFq(c2251o4.A03, c2251o4.A01, c2251o4.A02, c2251o4.A00);
        }
        for (InterfaceC0894Fo interfaceC0894Fo : this.A00.A0K) {
            String[] strArr = A01;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[1] = "q7eFcMKXm9CoB0iVpo1HKrbod3G9GfaY";
            interfaceC0894Fo.AFr(c2251o4);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.A00.A0F(new Surface(surfaceTexture), true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.A00.A0F(null, true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.A00.A0F(surfaceHolder.getSurface(), false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.A00.A0F(null, false);
    }
}
