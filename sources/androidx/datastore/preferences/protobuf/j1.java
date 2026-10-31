package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: TextFormatEscaper.java */
/* JADX INFO: loaded from: classes.dex */
final class j1 {

    /* JADX INFO: compiled from: TextFormatEscaper.java */
    class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f2210a;

        a(g gVar) {
            this.f2210a = gVar;
        }

        @Override // androidx.datastore.preferences.protobuf.j1.b
        public byte byteAt(int i10) {
            return this.f2210a.e(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.j1.b
        public int size() {
            return this.f2210a.size();
        }
    }

    /* JADX INFO: compiled from: TextFormatEscaper.java */
    private interface b {
        byte byteAt(int i10);

        int size();
    }

    static String a(g gVar) {
        return b(new a(gVar));
    }

    static String b(b bVar) {
        StringBuilder sb2 = new StringBuilder(bVar.size());
        for (int i10 = 0; i10 < bVar.size(); i10++) {
            byte bByteAt = bVar.byteAt(i10);
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

    static String c(String str) {
        return a(g.p(str));
    }
}
