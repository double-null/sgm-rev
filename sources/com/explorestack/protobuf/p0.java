package com.explorestack.protobuf;

/* JADX INFO: compiled from: LazyFieldLite.java */
/* JADX INFO: loaded from: classes.dex */
public class p0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final y f10736e = y.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ByteString f10737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private y f10738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected volatile MessageLite f10739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile ByteString f10740d;

    public p0() {
    }

    public p0(y yVar, ByteString byteString) {
        a(yVar, byteString);
        this.f10738b = yVar;
        this.f10737a = byteString;
    }

    private static void a(y yVar, ByteString byteString) {
        if (yVar == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        }
        if (byteString == null) {
            throw new NullPointerException("found null ByteString");
        }
    }

    protected void b(MessageLite messageLite) {
        if (this.f10739c != null) {
            return;
        }
        synchronized (this) {
            if (this.f10739c != null) {
                return;
            }
            try {
                if (this.f10737a != null) {
                    this.f10739c = messageLite.getParserForType().parseFrom(this.f10737a, this.f10738b);
                    this.f10740d = this.f10737a;
                } else {
                    this.f10739c = messageLite;
                    this.f10740d = ByteString.EMPTY;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.f10739c = messageLite;
                this.f10740d = ByteString.EMPTY;
            }
        }
    }

    public int c() {
        if (this.f10740d != null) {
            return this.f10740d.size();
        }
        ByteString byteString = this.f10737a;
        if (byteString != null) {
            return byteString.size();
        }
        if (this.f10739c != null) {
            return this.f10739c.getSerializedSize();
        }
        return 0;
    }

    public MessageLite d(MessageLite messageLite) {
        b(messageLite);
        return this.f10739c;
    }

    public MessageLite e(MessageLite messageLite) {
        MessageLite messageLite2 = this.f10739c;
        this.f10737a = null;
        this.f10740d = null;
        this.f10739c = messageLite;
        return messageLite2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        MessageLite messageLite = this.f10739c;
        MessageLite messageLite2 = p0Var.f10739c;
        if (messageLite == null && messageLite2 == null) {
            return f().equals(p0Var.f());
        }
        if (messageLite == null || messageLite2 == null) {
            return messageLite != null ? messageLite.equals(p0Var.d(messageLite.mo164getDefaultInstanceForType())) : d(messageLite2.mo164getDefaultInstanceForType()).equals(messageLite2);
        }
        return messageLite.equals(messageLite2);
    }

    public ByteString f() {
        if (this.f10740d != null) {
            return this.f10740d;
        }
        ByteString byteString = this.f10737a;
        if (byteString != null) {
            return byteString;
        }
        synchronized (this) {
            if (this.f10740d != null) {
                return this.f10740d;
            }
            if (this.f10739c == null) {
                this.f10740d = ByteString.EMPTY;
            } else {
                this.f10740d = this.f10739c.toByteString();
            }
            return this.f10740d;
        }
    }

    public int hashCode() {
        return 1;
    }
}
