package io.bidmachine.media3.datasource;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import z7.a;
import z7.g;

/* JADX INFO: loaded from: classes4.dex */
public final class UdpDataSource extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f18046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f18047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final DatagramPacket f18048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Uri f18049h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private DatagramSocket f18050i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MulticastSocket f18051j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InetAddress f18052k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f18053l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f18054m;

    public static final class UdpDataSourceException extends DataSourceException {
        public UdpDataSourceException(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public UdpDataSource() {
        this(2000);
    }

    @Override // z7.d
    public void close() {
        this.f18049h = null;
        MulticastSocket multicastSocket = this.f18051j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) x7.a.e(this.f18052k));
            } catch (IOException unused) {
            }
            this.f18051j = null;
        }
        DatagramSocket datagramSocket = this.f18050i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f18050i = null;
        }
        this.f18052k = null;
        this.f18054m = 0;
        if (this.f18053l) {
            this.f18053l = false;
            p();
        }
    }

    @Override // z7.d
    public long i(g gVar) throws UdpDataSourceException {
        Uri uri = gVar.f29009a;
        this.f18049h = uri;
        String str = (String) x7.a.e(uri.getHost());
        int port = this.f18049h.getPort();
        q(gVar);
        try {
            this.f18052k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f18052k, port);
            if (this.f18052k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f18051j = multicastSocket;
                multicastSocket.joinGroup(this.f18052k);
                this.f18050i = this.f18051j;
            } else {
                this.f18050i = new DatagramSocket(inetSocketAddress);
            }
            this.f18050i.setSoTimeout(this.f18046e);
            this.f18053l = true;
            r(gVar);
            return -1L;
        } catch (IOException e10) {
            throw new UdpDataSourceException(e10, 2001);
        } catch (SecurityException e11) {
            throw new UdpDataSourceException(e11, 2006);
        }
    }

    @Override // z7.d
    public Uri m() {
        return this.f18049h;
    }

    @Override // u7.h
    public int read(byte[] bArr, int i10, int i11) throws UdpDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        if (this.f18054m == 0) {
            try {
                ((DatagramSocket) x7.a.e(this.f18050i)).receive(this.f18048g);
                int length = this.f18048g.getLength();
                this.f18054m = length;
                o(length);
            } catch (SocketTimeoutException e10) {
                throw new UdpDataSourceException(e10, 2002);
            } catch (IOException e11) {
                throw new UdpDataSourceException(e11, 2001);
            }
        }
        int length2 = this.f18048g.getLength();
        int i12 = this.f18054m;
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f18047f, length2 - i12, bArr, i10, iMin);
        this.f18054m -= iMin;
        return iMin;
    }

    public UdpDataSource(int i10) {
        this(i10, 8000);
    }

    public UdpDataSource(int i10, int i11) {
        super(true);
        this.f18046e = i11;
        byte[] bArr = new byte[i10];
        this.f18047f = bArr;
        this.f18048g = new DatagramPacket(bArr, 0, i10);
    }
}
