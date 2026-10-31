package io.bidmachine.analytics.internal.p005d;

import io.bidmachine.analytics.internal.p006e.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.List;
import javax.crypto.KeyAgreement;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.t;
import kotlin.collections.x;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f16872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f16874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f16875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f16876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Key f16877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f16878g;

    public a(byte[] bArr, String str, byte[] bArr2, boolean z10) {
        this.f16872a = bArr;
        this.f16873b = str;
        this.f16874c = bArr2;
        this.f16875d = z10;
        KeyPair keyPairA = new io.bidmachine.analytics.internal.f.a().a();
        this.f16876e = keyPairA.getPublic().getEncoded();
        this.f16877f = keyPairA.getPrivate();
        this.f16878g = new io.bidmachine.analytics.internal.p006e.a();
    }

    public final Key a() {
        return a(this.f16877f, this.f16876e, this.f16872a);
    }

    public final byte[] b() {
        return this.f16876e;
    }

    public final Key a(Key key, byte[] bArr, byte[] bArr2) {
        return new SecretKeySpec(this.f16878g.a(a(key, bArr2), this.f16875d ? a(bArr, bArr2) : null, this.f16874c), this.f16873b);
    }

    private final byte[] a(Key key, byte[] bArr) throws InvalidKeySpecException, NoSuchAlgorithmException, InvalidKeyException {
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(bArr));
        KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
        keyAgreement.init(key);
        keyAgreement.doPhase(publicKeyGeneratePublic, true);
        return keyAgreement.generateSecret();
    }

    public /* synthetic */ a(byte[] bArr, String str, byte[] bArr2, boolean z10, int i10, k kVar) {
        this(bArr, str, (i10 & 4) != 0 ? null : bArr2, (i10 & 8) != 0 ? false : z10);
    }

    private final byte[] a(byte[] bArr, byte[] bArr2) throws IOException {
        List listP = t.p(ByteBuffer.wrap(bArr), ByteBuffer.wrap(bArr2));
        x.x(listP);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(((ByteBuffer) listP.get(0)).array());
        byteArrayOutputStream.write(((ByteBuffer) listP.get(1)).array());
        return byteArrayOutputStream.toByteArray();
    }
}
