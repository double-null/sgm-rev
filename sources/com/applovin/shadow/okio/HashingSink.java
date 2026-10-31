package com.applovin.shadow.okio;

import com.facebook.appevents.cloudbridge.Gjw.yhXxbqGRMeI;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import wc.g0;

/* JADX INFO: compiled from: HashingSink.kt */
/* JADX INFO: loaded from: classes.dex */
public final class HashingSink extends ForwardingSink {
    public static final Companion Companion = new Companion(null);
    private final Mac mac;
    private final MessageDigest messageDigest;

    /* JADX INFO: compiled from: HashingSink.kt */
    /* JADX INFO: loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final HashingSink hmacSha256(Sink sink, ByteString key) {
            kotlin.jvm.internal.t.f(sink, "sink");
            kotlin.jvm.internal.t.f(key, "key");
            return new HashingSink(sink, key, "HmacSHA256");
        }

        public final HashingSink hmacSha512(Sink sink, ByteString key) {
            kotlin.jvm.internal.t.f(sink, "sink");
            kotlin.jvm.internal.t.f(key, "key");
            return new HashingSink(sink, key, "HmacSHA512");
        }

        public final HashingSink md5(Sink sink) {
            kotlin.jvm.internal.t.f(sink, "sink");
            return new HashingSink(sink, "MD5");
        }

        public final HashingSink sha1(Sink sink) {
            kotlin.jvm.internal.t.f(sink, "sink");
            return new HashingSink(sink, "SHA-1");
        }

        public final HashingSink sha256(Sink sink) {
            kotlin.jvm.internal.t.f(sink, "sink");
            return new HashingSink(sink, "SHA-256");
        }

        public final HashingSink sha512(Sink sink) {
            kotlin.jvm.internal.t.f(sink, "sink");
            return new HashingSink(sink, "SHA-512");
        }

        public final HashingSink hmacSha1(Sink sink, ByteString byteString) {
            kotlin.jvm.internal.t.f(sink, "sink");
            kotlin.jvm.internal.t.f(byteString, yhXxbqGRMeI.ZiGDWZrNhaNOLe);
            return new HashingSink(sink, byteString, "HmacSHA1");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSink(Sink sink, MessageDigest digest) {
        super(sink);
        kotlin.jvm.internal.t.f(sink, "sink");
        kotlin.jvm.internal.t.f(digest, "digest");
        this.messageDigest = digest;
        this.mac = null;
    }

    public static final HashingSink hmacSha1(Sink sink, ByteString byteString) {
        return Companion.hmacSha1(sink, byteString);
    }

    public static final HashingSink hmacSha256(Sink sink, ByteString byteString) {
        return Companion.hmacSha256(sink, byteString);
    }

    public static final HashingSink hmacSha512(Sink sink, ByteString byteString) {
        return Companion.hmacSha512(sink, byteString);
    }

    public static final HashingSink md5(Sink sink) {
        return Companion.md5(sink);
    }

    public static final HashingSink sha1(Sink sink) {
        return Companion.sha1(sink);
    }

    public static final HashingSink sha256(Sink sink) {
        return Companion.sha256(sink);
    }

    public static final HashingSink sha512(Sink sink) {
        return Companion.sha512(sink);
    }

    /* JADX INFO: renamed from: -deprecated_hash, reason: not valid java name */
    public final ByteString m158deprecated_hash() {
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

    @Override // com.applovin.shadow.okio.ForwardingSink, com.applovin.shadow.okio.Sink
    public void write(Buffer source, long j10) throws IOException {
        kotlin.jvm.internal.t.f(source, "source");
        SegmentedByteString.checkOffsetAndCount(source.size(), 0L, j10);
        Segment segment = source.head;
        kotlin.jvm.internal.t.c(segment);
        long j11 = 0;
        while (j11 < j10) {
            int iMin = (int) Math.min(j10 - j11, segment.limit - segment.pos);
            MessageDigest messageDigest = this.messageDigest;
            if (messageDigest != null) {
                messageDigest.update(segment.data, segment.pos, iMin);
            } else {
                Mac mac = this.mac;
                kotlin.jvm.internal.t.c(mac);
                mac.update(segment.data, segment.pos, iMin);
            }
            j11 += (long) iMin;
            segment = segment.next;
            kotlin.jvm.internal.t.c(segment);
        }
        super.write(source, j10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HashingSink(Sink sink, String algorithm) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.t.f(sink, "sink");
        kotlin.jvm.internal.t.f(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        kotlin.jvm.internal.t.e(messageDigest, "getInstance(...)");
        this(sink, messageDigest);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSink(Sink sink, Mac mac) {
        super(sink);
        kotlin.jvm.internal.t.f(sink, "sink");
        kotlin.jvm.internal.t.f(mac, "mac");
        this.mac = mac;
        this.messageDigest = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HashingSink(Sink sink, ByteString key, String algorithm) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.t.f(sink, "sink");
        kotlin.jvm.internal.t.f(key, "key");
        kotlin.jvm.internal.t.f(algorithm, "algorithm");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            g0 g0Var = g0.f27756a;
            kotlin.jvm.internal.t.c(mac);
            this(sink, mac);
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
