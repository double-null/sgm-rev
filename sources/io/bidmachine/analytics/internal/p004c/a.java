package io.bidmachine.analytics.internal.p004c;

import io.bidmachine.analytics.internal.p003b.c;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.collections.m;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0279a f16870b = new C0279a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16871a = "AES";

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.c.a$a, reason: collision with other inner class name */
    public static final class C0279a {
        public /* synthetic */ C0279a(k kVar) {
            this();
        }

        private C0279a() {
        }
    }

    @Override // io.bidmachine.analytics.internal.p004c.b
    public byte[] a(Key key, byte[] bArr) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArrA = c.f16868a.a(12);
        byte[] bArrDoFinal = a(1, key, bArrA).doFinal(bArr);
        byte[] bArr2 = new byte[bArrDoFinal.length + 12];
        m.d(bArrA, bArr2, 0, 0, 12);
        m.d(bArrDoFinal, bArr2, 12, 0, bArrDoFinal.length);
        return bArr2;
    }

    @Override // io.bidmachine.analytics.internal.p004c.b
    public String getName() {
        return this.f16871a;
    }

    private final Cipher a(int i10, Key key, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(i10, key, gCMParameterSpec);
        return cipher;
    }
}
