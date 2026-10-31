package com.applovin.shadow.okio;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import pb.vBC.NyXuoef;
import wc.g0;

/* JADX INFO: compiled from: HashingSource.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class HashingSource extends ForwardingSource {
    public static final Companion Companion = new Companion(null);
    private final Mac mac;
    private final MessageDigest messageDigest;

    /* JADX INFO: compiled from: HashingSource.kt */
    /* JADX INFO: loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final HashingSource hmacSha1(Source source, ByteString key) {
            kotlin.jvm.internal.t.f(source, "source");
            kotlin.jvm.internal.t.f(key, "key");
            return new HashingSource(source, key, "HmacSHA1");
        }

        public final HashingSource hmacSha256(Source source, ByteString key) {
            kotlin.jvm.internal.t.f(source, "source");
            kotlin.jvm.internal.t.f(key, "key");
            return new HashingSource(source, key, "HmacSHA256");
        }

        public final HashingSource hmacSha512(Source source, ByteString key) {
            kotlin.jvm.internal.t.f(source, "source");
            kotlin.jvm.internal.t.f(key, "key");
            return new HashingSource(source, key, "HmacSHA512");
        }

        public final HashingSource md5(Source source) {
            kotlin.jvm.internal.t.f(source, "source");
            return new HashingSource(source, "MD5");
        }

        public final HashingSource sha1(Source source) {
            kotlin.jvm.internal.t.f(source, "source");
            return new HashingSource(source, "SHA-1");
        }

        public final HashingSource sha256(Source source) {
            kotlin.jvm.internal.t.f(source, "source");
            return new HashingSource(source, "SHA-256");
        }

        public final HashingSource sha512(Source source) {
            kotlin.jvm.internal.t.f(source, "source");
            return new HashingSource(source, "SHA-512");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSource(Source source, MessageDigest digest) {
        super(source);
        kotlin.jvm.internal.t.f(source, "source");
        kotlin.jvm.internal.t.f(digest, "digest");
        this.messageDigest = digest;
        this.mac = null;
    }

    public static final HashingSource hmacSha1(Source source, ByteString byteString) {
        return Companion.hmacSha1(source, byteString);
    }

    public static final HashingSource hmacSha256(Source source, ByteString byteString) {
        return Companion.hmacSha256(source, byteString);
    }

    public static final HashingSource hmacSha512(Source source, ByteString byteString) {
        return Companion.hmacSha512(source, byteString);
    }

    public static final HashingSource md5(Source source) {
        return Companion.md5(source);
    }

    public static final HashingSource sha1(Source source) {
        return Companion.sha1(source);
    }

    public static final HashingSource sha256(Source source) {
        return Companion.sha256(source);
    }

    public static final HashingSource sha512(Source source) {
        return Companion.sha512(source);
    }

    /* JADX INFO: renamed from: -deprecated_hash, reason: not valid java name */
    public final ByteString m159deprecated_hash() {
        return hash();
    }

    public final ByteString hash() {
        byte[] bArrDoFinal;
        MessageDigest messageDigest = this.messageDigest;
        if (messageDigest != null) {
            bArrDoFinal = messageDigest.digest();
        } else {
            Mac mac = this.mac;
            kotlin.jvm.internal.t.c(mac);
            bArrDoFinal = mac.doFinal();
        }
        kotlin.jvm.internal.t.c(bArrDoFinal);
        return new ByteString(bArrDoFinal);
    }

    @Override // com.applovin.shadow.okio.ForwardingSource, com.applovin.shadow.okio.Source
    public long read(Buffer sink, long j10) throws IOException {
        kotlin.jvm.internal.t.f(sink, "sink");
        long j11 = super.read(sink, j10);
        if (j11 != -1) {
            long size = sink.size() - j11;
            long size2 = sink.size();
            Segment segment = sink.head;
            kotlin.jvm.internal.t.c(segment);
            while (size2 > size) {
                segment = segment.prev;
                kotlin.jvm.internal.t.c(segment);
                size2 -= (long) (segment.limit - segment.pos);
            }
            while (size2 < sink.size()) {
                int i10 = (int) ((((long) segment.pos) + size) - size2);
                MessageDigest messageDigest = this.messageDigest;
                if (messageDigest != null) {
                    messageDigest.update(segment.data, i10, segment.limit - i10);
                } else {
                    Mac mac = this.mac;
                    kotlin.jvm.internal.t.c(mac);
                    mac.update(segment.data, i10, segment.limit - i10);
                }
                size2 += (long) (segment.limit - segment.pos);
                segment = segment.next;
                kotlin.jvm.internal.t.c(segment);
                size = size2;
            }
        }
        return j11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HashingSource(Source source, String algorithm) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.t.f(source, "source");
        kotlin.jvm.internal.t.f(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        kotlin.jvm.internal.t.e(messageDigest, "getInstance(...)");
        this(source, messageDigest);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSource(Source source, Mac mac) {
        super(source);
        kotlin.jvm.internal.t.f(source, "source");
        kotlin.jvm.internal.t.f(mac, "mac");
        this.mac = mac;
        this.messageDigest = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HashingSource(Source source, ByteString key, String algorithm) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.t.f(source, NyXuoef.gVmrqVBWpBaEnC);
        kotlin.jvm.internal.t.f(key, "key");
        kotlin.jvm.internal.t.f(algorithm, "algorithm");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            g0 g0Var = g0.f27756a;
            kotlin.jvm.internal.t.c(mac);
            this(source, mac);
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
