package com.explorestack.protobuf;

/* JADX INFO: compiled from: TextFormatEscaper.java */
/* JADX INFO: loaded from: classes.dex */
final class l2 {

    /* JADX INFO: compiled from: TextFormatEscaper.java */
    static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteString f10628a;

        a(ByteString byteString) {
            this.f10628a = byteString;
        }

        @Override // com.explorestack.protobuf.l2.c
        public byte byteAt(int i10) {
            return this.f10628a.byteAt(i10);
        }

        @Override // com.explorestack.protobuf.l2.c
        public int size() {
            return this.f10628a.size();
        }
    }

    /* JADX INFO: compiled from: TextFormatEscaper.java */
    static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f10629a;

        b(byte[] bArr) {
            this.f10629a = bArr;
        }

        @Override // com.explorestack.protobuf.l2.c
        public byte byteAt(int i10) {
            return this.f10629a[i10];
        }

        @Override // com.explorestack.protobuf.l2.c
        public int size() {
            return this.f10629a.length;
        }
    }

    /* JADX INFO: compiled from: TextFormatEscaper.java */
    private interface c {
        byte byteAt(int i10);

        int size();
    }

    static String a(ByteString byteString) {
        return b(new a(byteString));
    }

    static String b(c cVar) {
        StringBuilder sb2 = new StringBuilder(cVar.size());
        for (int i10 = 0; i10 < cVar.size(); i10++) {
            byte bByteAt = cVar.byteAt(i10);
            if (bByteAt == 34) {
                sb2.append("\\\"");
            } else if (bByteAt == 39) {
                sb2.append("\\'");
            } else if (bByteAt != 92) {
                switch (bByteAt) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bByteAt < 32 || bByteAt > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bByteAt >>> 6) & 3) + 48));
                            sb2.append((char) (((bByteAt >>> 3) & 7) + 48));
                            sb2.append((char) ((bByteAt & 7) + 48));
                        } else {
                            sb2.append((char) bByteAt);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    static String c(byte[] bArr) {
        return b(new b(bArr));
    }

    static String d(String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    static String e(String str) {
        return a(ByteString.copyFromUtf8(str));
    }
}
