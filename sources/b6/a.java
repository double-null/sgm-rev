package b6;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import com.adjust.sdk.Constants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4107b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SecureRandom f4109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SecretKeyFactory f4110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Cipher f4111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Mac f4112g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C0083a f4113h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f4106a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f4108c = Sdk.SDKError.Reason.MEDIATION_ERROR_VALUE;

    /* JADX INFO: renamed from: b6.a$a, reason: collision with other inner class name */
    private static class C0083a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final SecretKey f4114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final SecretKey f4115b;

        C0083a(SecretKey secretKey, SecretKey secretKey2) {
            this.f4114a = secretKey;
            this.f4115b = secretKey2;
        }
    }

    public a(String str) {
        this.f4107b = str;
        try {
            this.f4109d = new SecureRandom();
            this.f4110e = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            this.f4111f = Cipher.getInstance("AES/CBC/PKCS5Padding");
            this.f4112g = Mac.getInstance("HmacSHA256");
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e10) {
            throw new RuntimeException(e10);
        }
    }

    private C0083a c(Context context) {
        byte[] bArrDecode;
        String str = Build.MODEL + Build.MANUFACTURER + Build.SERIAL + Settings.Secure.getString(context.getContentResolver(), "android_id") + context.getPackageName();
        SharedPreferences sharedPreferences = context.getSharedPreferences(this.f4107b, 0);
        String string = sharedPreferences.getString("salt", null);
        if (TextUtils.isEmpty(string)) {
            byte[] bArr = new byte[16];
            this.f4109d.nextBytes(bArr);
            sharedPreferences.edit().putString("salt", Base64.encodeToString(bArr, 0)).apply();
            bArrDecode = bArr;
        } else {
            bArrDecode = Base64.decode(string, 0);
        }
        try {
            byte[] encoded = this.f4110e.generateSecret(new PBEKeySpec(str.toCharArray(), bArrDecode, this.f4108c, 512)).getEncoded();
            return new C0083a(new SecretKeySpec(Arrays.copyOfRange(encoded, 0, 32), "AES"), new SecretKeySpec(Arrays.copyOfRange(encoded, 32, encoded.length), "HmacSHA256"));
        } catch (InvalidKeySpecException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final String a(Context context, String str) {
        String strEncodeToString;
        synchronized (this.f4106a) {
            b(context);
            try {
                int blockSize = this.f4111f.getBlockSize();
                byte[] bArr = new byte[blockSize];
                this.f4109d.nextBytes(bArr);
                this.f4111f.init(1, this.f4113h.f4114a, new IvParameterSpec(bArr));
                byte[] bArrDoFinal = this.f4111f.doFinal(str.getBytes(Constants.ENCODING));
                byte[] bArr2 = new byte[bArrDoFinal.length + blockSize + 32];
                System.arraycopy(bArr, 0, bArr2, 0, blockSize);
                int i10 = blockSize + 0;
                System.arraycopy(bArrDoFinal, 0, bArr2, i10, bArrDoFinal.length);
                this.f4112g.init(this.f4113h.f4115b);
                this.f4112g.update(bArr2, 0, blockSize + bArrDoFinal.length);
                byte[] bArrDoFinal2 = this.f4112g.doFinal();
                System.arraycopy(bArrDoFinal2, 0, bArr2, i10 + bArrDoFinal.length, bArrDoFinal2.length);
                strEncodeToString = Base64.encodeToString(bArr2, 0);
            } catch (UnsupportedEncodingException e10) {
                e = e10;
                throw new RuntimeException(e);
            } catch (InvalidAlgorithmParameterException e11) {
                e = e11;
                throw new RuntimeException(e);
            } catch (InvalidKeyException e12) {
                e = e12;
                throw new RuntimeException(e);
            } catch (BadPaddingException e13) {
                throw new com.linecorp.a.a.a.a(e13);
            } catch (IllegalBlockSizeException e14) {
                e = e14;
                throw new RuntimeException(e);
            }
        }
        return strEncodeToString;
    }

    public final void b(Context context) {
        synchronized (this.f4106a) {
            if (this.f4113h == null) {
                this.f4113h = c(context);
            }
        }
    }

    public final String d(Context context, String str) {
        String str2;
        synchronized (this.f4106a) {
            b(context);
            try {
                byte[] bArrDecode = Base64.decode(str, 0);
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrDecode, bArrDecode.length - 32, bArrDecode.length);
                this.f4112g.init(this.f4113h.f4115b);
                this.f4112g.update(bArrDecode, 0, bArrDecode.length - 32);
                if (!MessageDigest.isEqual(this.f4112g.doFinal(), bArrCopyOfRange)) {
                    throw new com.linecorp.a.a.a.a("Cipher text has been tampered with.");
                }
                this.f4111f.init(2, this.f4113h.f4114a, new IvParameterSpec(bArrDecode, 0, 16));
                str2 = new String(this.f4111f.doFinal(bArrDecode, 16, (bArrDecode.length - 16) - 32), Constants.ENCODING);
            } catch (UnsupportedEncodingException e10) {
                e = e10;
                throw new RuntimeException(e);
            } catch (InvalidAlgorithmParameterException e11) {
                e = e11;
                throw new RuntimeException(e);
            } catch (InvalidKeyException e12) {
                e = e12;
                throw new RuntimeException(e);
            } catch (BadPaddingException e13) {
                throw new com.linecorp.a.a.a.a(e13);
            } catch (IllegalBlockSizeException e14) {
                e = e14;
                throw new RuntimeException(e);
            }
        }
        return str2;
    }
}
