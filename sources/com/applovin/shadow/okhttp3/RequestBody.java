package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okio.BufferedSink;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.Okio;
import com.applovin.shadow.okio.Source;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import rd.d;

/* JADX INFO: compiled from: RequestBody.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class RequestBody {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: RequestBody.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, String str, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public final RequestBody create(MediaType mediaType, byte[] content) {
            t.f(content, "content");
            return create$default(this, mediaType, content, 0, 0, 12, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, ByteString byteString, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(byteString, mediaType);
        }

        public final RequestBody create(MediaType mediaType, byte[] content, int i10) {
            t.f(content, "content");
            return create$default(this, mediaType, content, i10, 0, 8, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                mediaType = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return companion.create(bArr, mediaType, i10, i11);
        }

        public final RequestBody create(byte[] bArr) {
            t.f(bArr, "<this>");
            return create$default(this, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        }

        public final RequestBody create(byte[] bArr, MediaType mediaType) {
            t.f(bArr, "<this>");
            return create$default(this, bArr, mediaType, 0, 0, 6, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, File file, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(file, mediaType);
        }

        public final RequestBody create(byte[] bArr, MediaType mediaType, int i10) {
            t.f(bArr, "<this>");
            return create$default(this, bArr, mediaType, i10, 0, 4, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, MediaType mediaType, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                i10 = 0;
            }
            if ((i12 & 8) != 0) {
                i11 = bArr.length;
            }
            return companion.create(mediaType, bArr, i10, i11);
        }

        public final RequestBody create(String str, MediaType mediaType) {
            t.f(str, "<this>");
            Charset charset = d.f24999b;
            if (mediaType != null) {
                Charset charsetCharset$default = MediaType.charset$default(mediaType, null, 1, null);
                if (charsetCharset$default == null) {
                    mediaType = MediaType.Companion.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charsetCharset$default;
                }
            }
            byte[] bytes = str.getBytes(charset);
            t.e(bytes, "this as java.lang.String).getBytes(charset)");
            return create(bytes, mediaType, 0, bytes.length);
        }

        public final RequestBody create(final ByteString byteString, final MediaType mediaType) {
            t.f(byteString, "<this>");
            return new RequestBody() { // from class: com.applovin.shadow.okhttp3.RequestBody$Companion$toRequestBody$1
                @Override // com.applovin.shadow.okhttp3.RequestBody
                public long contentLength() {
                    return byteString.size();
                }

                @Override // com.applovin.shadow.okhttp3.RequestBody
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // com.applovin.shadow.okhttp3.RequestBody
                public void writeTo(BufferedSink sink) throws IOException {
                    t.f(sink, "sink");
                    sink.write(byteString);
                }
            };
        }

        public final RequestBody create(final byte[] bArr, final MediaType mediaType, final int i10, final int i11) {
            t.f(bArr, "<this>");
            Util.checkOffsetAndCount(bArr.length, i10, i11);
            return new RequestBody() { // from class: com.applovin.shadow.okhttp3.RequestBody$Companion$toRequestBody$2
                @Override // com.applovin.shadow.okhttp3.RequestBody
                public long contentLength() {
                    return i11;
                }

                @Override // com.applovin.shadow.okhttp3.RequestBody
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // com.applovin.shadow.okhttp3.RequestBody
                public void writeTo(BufferedSink sink) throws IOException {
                    t.f(sink, "sink");
                    sink.write(bArr, i10, i11);
                }
            };
        }

        public final RequestBody create(final File file, final MediaType mediaType) {
            t.f(file, "<this>");
            return new RequestBody() { // from class: com.applovin.shadow.okhttp3.RequestBody$Companion$asRequestBody$1
                @Override // com.applovin.shadow.okhttp3.RequestBody
                public long contentLength() {
                    return file.length();
                }

                @Override // com.applovin.shadow.okhttp3.RequestBody
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // com.applovin.shadow.okhttp3.RequestBody
                public void writeTo(BufferedSink sink) throws IOException {
                    t.f(sink, "sink");
                    Source source = Okio.source(file);
                    try {
                        sink.writeAll(source);
                        fd.b.a(source, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            fd.b.a(source, th);
                            throw th2;
                        }
                    }
                }
            };
        }

        public final RequestBody create(MediaType mediaType, String content) {
            t.f(content, "content");
            return create(content, mediaType);
        }

        public final RequestBody create(MediaType mediaType, ByteString content) {
            t.f(content, "content");
            return create(content, mediaType);
        }

        public final RequestBody create(MediaType mediaType, byte[] content, int i10, int i11) {
            t.f(content, "content");
            return create(content, mediaType, i10, i11);
        }

        public final RequestBody create(MediaType mediaType, File file) {
            t.f(file, "file");
            return create(file, mediaType);
        }
    }

    public static final RequestBody create(MediaType mediaType, ByteString byteString) {
        return Companion.create(mediaType, byteString);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    public abstract MediaType contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(BufferedSink bufferedSink) throws IOException;

    public static final RequestBody create(MediaType mediaType, File file) {
        return Companion.create(mediaType, file);
    }

    public static final RequestBody create(MediaType mediaType, String str) {
        return Companion.create(mediaType, str);
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i10) {
        return Companion.create(mediaType, bArr, i10);
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i10, int i11) {
        return Companion.create(mediaType, bArr, i10, i11);
    }

    public static final RequestBody create(ByteString byteString, MediaType mediaType) {
        return Companion.create(byteString, mediaType);
    }

    public static final RequestBody create(File file, MediaType mediaType) {
        return Companion.create(file, mediaType);
    }

    public static final RequestBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    public static final RequestBody create(byte[] bArr) {
        return Companion.create(bArr);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i10) {
        return Companion.create(bArr, mediaType, i10);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i10, int i11) {
        return Companion.create(bArr, mediaType, i10, i11);
    }
}
