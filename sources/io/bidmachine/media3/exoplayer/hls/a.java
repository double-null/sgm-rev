package io.bidmachine.media3.exoplayer.hls;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import z7.o;

/* JADX INFO: compiled from: Aes128DataSource.java */
/* JADX INFO: loaded from: classes4.dex */
class a implements z7.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z7.d f18712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f18713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f18714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CipherInputStream f18715d;

    public a(z7.d dVar, byte[] bArr, byte[] bArr2) {
        this.f18712a = dVar;
        this.f18713b = bArr;
        this.f18714c = bArr2;
    }

    @Override // z7.d
    public final void a(o oVar) {
        x7.a.e(oVar);
        this.f18712a.a(oVar);
    }

    @Override // z7.d
    public final Map<String, List<String>> c() {
        return this.f18712a.c();
    }

    @Override // z7.d
    public void close() throws IOException {
        if (this.f18715d != null) {
            this.f18715d = null;
            this.f18712a.close();
        }
    }

    @Override // z7.d
    public final long i(z7.g gVar) throws IOException {
        try {
            Cipher cipherO = o();
            try {
                cipherO.init(2, new SecretKeySpec(this.f18713b, "AES"), new IvParameterSpec(this.f18714c));
                z7.e eVar = new z7.e(this.f18712a, gVar);
                this.f18715d = new CipherInputStream(eVar, cipherO);
                eVar.c();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // z7.d
    public final Uri m() {
        return this.f18712a.m();
    }

    protected Cipher o() throws NoSuchPaddingException, NoSuchAlgorithmException {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // u7.h
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        x7.a.e(this.f18715d);
        int i12 = this.f18715d.read(bArr, i10, i11);
        if (i12 < 0) {
            return -1;
        }
        return i12;
    }
}
