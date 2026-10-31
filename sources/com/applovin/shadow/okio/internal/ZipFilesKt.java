package com.applovin.shadow.okio.internal;

import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.applovin.shadow.okio.BufferedSource;
import com.applovin.shadow.okio.FileHandle;
import com.applovin.shadow.okio.FileMetadata;
import com.applovin.shadow.okio.FileSystem;
import com.applovin.shadow.okio.Okio;
import com.applovin.shadow.okio.Path;
import com.applovin.shadow.okio.ZipFileSystem;
import id.l;
import id.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import kotlin.collections.b0;
import kotlin.collections.o0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import rd.c0;
import rd.f0;
import wc.g0;
import wc.w;
import yc.b;

/* JADX INFO: compiled from: ZipFiles.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ZipFilesKt {
    private static final int BIT_FLAG_ENCRYPTED = 1;
    private static final int BIT_FLAG_UNSUPPORTED_MASK = 1;
    private static final int CENTRAL_FILE_HEADER_SIGNATURE = 33639248;
    public static final int COMPRESSION_METHOD_DEFLATED = 8;
    public static final int COMPRESSION_METHOD_STORED = 0;
    private static final int END_OF_CENTRAL_DIRECTORY_SIGNATURE = 101010256;
    private static final int HEADER_ID_EXTENDED_TIMESTAMP = 21589;
    private static final int HEADER_ID_ZIP64_EXTENDED_INFO = 1;
    private static final int LOCAL_FILE_HEADER_SIGNATURE = 67324752;
    private static final long MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE = 4294967295L;
    private static final int ZIP64_EOCD_RECORD_SIGNATURE = 101075792;
    private static final int ZIP64_LOCATOR_SIGNATURE = 117853008;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.applovin.shadow.okio.internal.ZipFilesKt$openZip$1, reason: invalid class name */
    /* JADX INFO: compiled from: ZipFiles.kt */
    public static final class AnonymousClass1 extends u implements l<ZipEntry, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // id.l
        public final Boolean invoke(ZipEntry it) {
            t.f(it, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.applovin.shadow.okio.internal.ZipFilesKt$readEntry$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ZipFiles.kt */
    static final class C05061 extends u implements p<Integer, Long, g0> {
        final /* synthetic */ kotlin.jvm.internal.g0 $compressedSize;
        final /* synthetic */ e0 $hasZip64Extra;
        final /* synthetic */ kotlin.jvm.internal.g0 $offset;
        final /* synthetic */ long $requiredZip64ExtraSize;
        final /* synthetic */ kotlin.jvm.internal.g0 $size;
        final /* synthetic */ BufferedSource $this_readEntry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05061(e0 e0Var, long j10, kotlin.jvm.internal.g0 g0Var, BufferedSource bufferedSource, kotlin.jvm.internal.g0 g0Var2, kotlin.jvm.internal.g0 g0Var3) {
            super(2);
            this.$hasZip64Extra = e0Var;
            this.$requiredZip64ExtraSize = j10;
            this.$size = g0Var;
            this.$this_readEntry = bufferedSource;
            this.$compressedSize = g0Var2;
            this.$offset = g0Var3;
        }

        @Override // id.p
        public /* bridge */ /* synthetic */ g0 invoke(Integer num, Long l10) throws IOException {
            invoke(num.intValue(), l10.longValue());
            return g0.f27756a;
        }

        public final void invoke(int i10, long j10) throws IOException {
            if (i10 == 1) {
                e0 e0Var = this.$hasZip64Extra;
                if (e0Var.f21509a) {
                    throw new IOException("bad zip: zip64 extra repeated");
                }
                e0Var.f21509a = true;
                if (j10 < this.$requiredZip64ExtraSize) {
                    throw new IOException("bad zip: zip64 extra too short");
                }
                kotlin.jvm.internal.g0 g0Var = this.$size;
                long longLe = g0Var.f21513a;
                if (longLe == ZipFilesKt.MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE) {
                    longLe = this.$this_readEntry.readLongLe();
                }
                g0Var.f21513a = longLe;
                kotlin.jvm.internal.g0 g0Var2 = this.$compressedSize;
                g0Var2.f21513a = g0Var2.f21513a == ZipFilesKt.MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE ? this.$this_readEntry.readLongLe() : 0L;
                kotlin.jvm.internal.g0 g0Var3 = this.$offset;
                g0Var3.f21513a = g0Var3.f21513a == ZipFilesKt.MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE ? this.$this_readEntry.readLongLe() : 0L;
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.shadow.okio.internal.ZipFilesKt$readOrSkipLocalHeader$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ZipFiles.kt */
    static final class C05071 extends u implements p<Integer, Long, g0> {
        final /* synthetic */ h0<Long> $createdAtMillis;
        final /* synthetic */ h0<Long> $lastAccessedAtMillis;
        final /* synthetic */ h0<Long> $lastModifiedAtMillis;
        final /* synthetic */ BufferedSource $this_readOrSkipLocalHeader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05071(BufferedSource bufferedSource, h0<Long> h0Var, h0<Long> h0Var2, h0<Long> h0Var3) {
            super(2);
            this.$this_readOrSkipLocalHeader = bufferedSource;
            this.$lastModifiedAtMillis = h0Var;
            this.$lastAccessedAtMillis = h0Var2;
            this.$createdAtMillis = h0Var3;
        }

        @Override // id.p
        public /* bridge */ /* synthetic */ g0 invoke(Integer num, Long l10) throws IOException {
            invoke(num.intValue(), l10.longValue());
            return g0.f27756a;
        }

        /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.Long] */
        /* JADX WARN: Type inference failed for: r10v12, types: [T, java.lang.Long] */
        /* JADX WARN: Type inference failed for: r11v3, types: [T, java.lang.Long] */
        public final void invoke(int i10, long j10) throws IOException {
            if (i10 == ZipFilesKt.HEADER_ID_EXTENDED_TIMESTAMP) {
                if (j10 < 1) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                int i11 = this.$this_readOrSkipLocalHeader.readByte() & 255;
                boolean z10 = (i11 & 1) == 1;
                boolean z11 = (i11 & 2) == 2;
                boolean z12 = (i11 & 4) == 4;
                BufferedSource bufferedSource = this.$this_readOrSkipLocalHeader;
                long j11 = z10 ? 5L : 1L;
                if (z11) {
                    j11 += 4;
                }
                if (z12) {
                    j11 += 4;
                }
                if (j10 < j11) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                if (z10) {
                    this.$lastModifiedAtMillis.f21514a = Long.valueOf(((long) bufferedSource.readIntLe()) * 1000);
                }
                if (z11) {
                    this.$lastAccessedAtMillis.f21514a = Long.valueOf(((long) this.$this_readOrSkipLocalHeader.readIntLe()) * 1000);
                }
                if (z12) {
                    this.$createdAtMillis.f21514a = Long.valueOf(((long) this.$this_readOrSkipLocalHeader.readIntLe()) * 1000);
                }
            }
        }
    }

    private static final Map<Path, ZipEntry> buildIndex(List<ZipEntry> list) {
        Path path = Path.Companion.get$default(Path.Companion, "/", false, 1, (Object) null);
        Map<Path, ZipEntry> mapL = o0.l(w.a(path, new ZipEntry(path, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null)));
        for (ZipEntry zipEntry : b0.i0(list, new Comparator() { // from class: com.applovin.shadow.okio.internal.ZipFilesKt$buildIndex$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return b.a(((ZipEntry) t10).getCanonicalPath(), ((ZipEntry) t11).getCanonicalPath());
            }
        })) {
            if (mapL.put(zipEntry.getCanonicalPath(), zipEntry) == null) {
                while (true) {
                    Path pathParent = zipEntry.getCanonicalPath().parent();
                    if (pathParent == null) {
                        break;
                    }
                    ZipEntry zipEntry2 = mapL.get(pathParent);
                    if (zipEntry2 != null) {
                        zipEntry2.getChildren().add(zipEntry.getCanonicalPath());
                        break;
                    }
                    ZipEntry zipEntry3 = new ZipEntry(pathParent, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null);
                    mapL.put(pathParent, zipEntry3);
                    zipEntry3.getChildren().add(zipEntry.getCanonicalPath());
                    zipEntry = zipEntry3;
                }
            }
        }
        return mapL;
    }

    private static final Long dosDateTimeToEpochMillis(int i10, int i11) {
        if (i11 == -1) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(((i10 >> 9) & 127) + 1980, ((i10 >> 5) & 15) - 1, i10 & 31, (i11 >> 11) & 31, (i11 >> 5) & 63, (i11 & 31) << 1);
        return Long.valueOf(gregorianCalendar.getTime().getTime());
    }

    private static final String getHex(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("0x");
        String string = Integer.toString(i10, rd.b.a(16));
        t.e(string, "toString(this, checkRadix(radix))");
        sb2.append(string);
        return sb2.toString();
    }

    public static final ZipFileSystem openZip(Path zipPath, FileSystem fileSystem, l<? super ZipEntry, Boolean> predicate) throws IOException {
        t.f(zipPath, "zipPath");
        t.f(fileSystem, "fileSystem");
        t.f(predicate, "predicate");
        FileHandle fileHandleOpenReadOnly = fileSystem.openReadOnly(zipPath);
        try {
            long size = fileHandleOpenReadOnly.size() - ((long) 22);
            if (size < 0) {
                throw new IOException("not a zip: size=" + fileHandleOpenReadOnly.size());
            }
            long jMax = Math.max(size - 65536, 0L);
            do {
                BufferedSource bufferedSourceBuffer = Okio.buffer(fileHandleOpenReadOnly.source(size));
                try {
                    if (bufferedSourceBuffer.readIntLe() == END_OF_CENTRAL_DIRECTORY_SIGNATURE) {
                        EocdRecord eocdRecord = readEocdRecord(bufferedSourceBuffer);
                        String utf8 = bufferedSourceBuffer.readUtf8(eocdRecord.getCommentByteCount());
                        bufferedSourceBuffer.close();
                        long j10 = size - ((long) 20);
                        if (j10 > 0) {
                            BufferedSource bufferedSourceBuffer2 = Okio.buffer(fileHandleOpenReadOnly.source(j10));
                            try {
                                if (bufferedSourceBuffer2.readIntLe() == ZIP64_LOCATOR_SIGNATURE) {
                                    int intLe = bufferedSourceBuffer2.readIntLe();
                                    long longLe = bufferedSourceBuffer2.readLongLe();
                                    if (bufferedSourceBuffer2.readIntLe() != 1 || intLe != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    BufferedSource bufferedSourceBuffer3 = Okio.buffer(fileHandleOpenReadOnly.source(longLe));
                                    try {
                                        int intLe2 = bufferedSourceBuffer3.readIntLe();
                                        if (intLe2 != ZIP64_EOCD_RECORD_SIGNATURE) {
                                            throw new IOException("bad zip: expected " + getHex(ZIP64_EOCD_RECORD_SIGNATURE) + " but was " + getHex(intLe2));
                                        }
                                        eocdRecord = readZip64EocdRecord(bufferedSourceBuffer3, eocdRecord);
                                        g0 g0Var = g0.f27756a;
                                        fd.b.a(bufferedSourceBuffer3, null);
                                    } catch (Throwable th) {
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            fd.b.a(bufferedSourceBuffer3, th);
                                            throw th2;
                                        }
                                    }
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        fd.b.a(fileHandleOpenReadOnly, th);
                                        throw th3;
                                    }
                                }
                                g0 g0Var2 = g0.f27756a;
                                fd.b.a(bufferedSourceBuffer2, null);
                            } catch (Throwable th4) {
                                try {
                                    throw th4;
                                } catch (Throwable th5) {
                                    fd.b.a(bufferedSourceBuffer2, th4);
                                    throw th5;
                                }
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        BufferedSource bufferedSourceBuffer4 = Okio.buffer(fileHandleOpenReadOnly.source(eocdRecord.getCentralDirectoryOffset()));
                        try {
                            long entryCount = eocdRecord.getEntryCount();
                            for (long j11 = 0; j11 < entryCount; j11++) {
                                ZipEntry entry = readEntry(bufferedSourceBuffer4);
                                if (entry.getOffset() >= eocdRecord.getCentralDirectoryOffset()) {
                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                }
                                if (predicate.invoke(entry).booleanValue()) {
                                    arrayList.add(entry);
                                }
                            }
                            g0 g0Var3 = g0.f27756a;
                            fd.b.a(bufferedSourceBuffer4, null);
                            ZipFileSystem zipFileSystem = new ZipFileSystem(zipPath, fileSystem, buildIndex(arrayList), utf8);
                            fd.b.a(fileHandleOpenReadOnly, null);
                            return zipFileSystem;
                        } catch (Throwable th6) {
                            try {
                                throw th6;
                            } catch (Throwable th7) {
                                fd.b.a(bufferedSourceBuffer4, th6);
                                throw th7;
                            }
                        }
                    }
                    bufferedSourceBuffer.close();
                    size--;
                } catch (Throwable th8) {
                    bufferedSourceBuffer.close();
                    throw th8;
                }
            } while (size >= jMax);
            throw new IOException("not a zip: end of central directory signature not found");
        } catch (Throwable th9) {
            throw th9;
        }
    }

    public static /* synthetic */ ZipFileSystem openZip$default(Path path, FileSystem fileSystem, l lVar, int i10, Object obj) throws IOException {
        if ((i10 & 4) != 0) {
            lVar = AnonymousClass1.INSTANCE;
        }
        return openZip(path, fileSystem, lVar);
    }

    public static final ZipEntry readEntry(BufferedSource bufferedSource) throws IOException {
        t.f(bufferedSource, "<this>");
        int intLe = bufferedSource.readIntLe();
        if (intLe != CENTRAL_FILE_HEADER_SIGNATURE) {
            throw new IOException("bad zip: expected " + getHex(CENTRAL_FILE_HEADER_SIGNATURE) + " but was " + getHex(intLe));
        }
        bufferedSource.skip(4L);
        int shortLe = bufferedSource.readShortLe() & 65535;
        if ((shortLe & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + getHex(shortLe));
        }
        int shortLe2 = bufferedSource.readShortLe() & 65535;
        Long lDosDateTimeToEpochMillis = dosDateTimeToEpochMillis(bufferedSource.readShortLe() & 65535, bufferedSource.readShortLe() & 65535);
        long intLe2 = ((long) bufferedSource.readIntLe()) & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        g0Var.f21513a = ((long) bufferedSource.readIntLe()) & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        kotlin.jvm.internal.g0 g0Var2 = new kotlin.jvm.internal.g0();
        g0Var2.f21513a = ((long) bufferedSource.readIntLe()) & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        int shortLe3 = bufferedSource.readShortLe() & 65535;
        int shortLe4 = bufferedSource.readShortLe() & 65535;
        int shortLe5 = bufferedSource.readShortLe() & 65535;
        bufferedSource.skip(8L);
        kotlin.jvm.internal.g0 g0Var3 = new kotlin.jvm.internal.g0();
        g0Var3.f21513a = ((long) bufferedSource.readIntLe()) & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        String utf8 = bufferedSource.readUtf8(shortLe3);
        if (f0.T(utf8, (char) 0, false, 2, null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j10 = g0Var2.f21513a == MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE ? ((long) 8) + 0 : 0L;
        if (g0Var.f21513a == MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE) {
            j10 += (long) 8;
        }
        if (g0Var3.f21513a == MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE) {
            j10 += (long) 8;
        }
        long j11 = j10;
        e0 e0Var = new e0();
        readExtra(bufferedSource, shortLe4, new C05061(e0Var, j11, g0Var2, bufferedSource, g0Var, g0Var3));
        if (j11 <= 0 || e0Var.f21509a) {
            return new ZipEntry(Path.Companion.get$default(Path.Companion, "/", false, 1, (Object) null).resolve(utf8), c0.A(utf8, "/", false, 2, null), bufferedSource.readUtf8(shortLe5), intLe2, g0Var.f21513a, g0Var2.f21513a, shortLe2, lDosDateTimeToEpochMillis, g0Var3.f21513a);
        }
        throw new IOException("bad zip: zip64 extra required but absent");
    }

    private static final EocdRecord readEocdRecord(BufferedSource bufferedSource) throws IOException {
        int shortLe = bufferedSource.readShortLe() & 65535;
        int shortLe2 = bufferedSource.readShortLe() & 65535;
        long shortLe3 = bufferedSource.readShortLe() & 65535;
        if (shortLe3 != (bufferedSource.readShortLe() & 65535) || shortLe != 0 || shortLe2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        bufferedSource.skip(4L);
        return new EocdRecord(shortLe3, MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE & ((long) bufferedSource.readIntLe()), bufferedSource.readShortLe() & 65535);
    }

    private static final void readExtra(BufferedSource bufferedSource, int i10, p<? super Integer, ? super Long, g0> pVar) throws IOException {
        long j10 = i10;
        while (j10 != 0) {
            if (j10 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int shortLe = bufferedSource.readShortLe() & 65535;
            long shortLe2 = ((long) bufferedSource.readShortLe()) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
            long j11 = j10 - ((long) 4);
            if (j11 < shortLe2) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            bufferedSource.require(shortLe2);
            long size = bufferedSource.getBuffer().size();
            pVar.invoke(Integer.valueOf(shortLe), Long.valueOf(shortLe2));
            long size2 = (bufferedSource.getBuffer().size() + shortLe2) - size;
            if (size2 < 0) {
                throw new IOException("unsupported zip: too many bytes processed for " + shortLe);
            }
            if (size2 > 0) {
                bufferedSource.getBuffer().skip(size2);
            }
            j10 = j11 - shortLe2;
        }
    }

    public static final FileMetadata readLocalHeader(BufferedSource bufferedSource, FileMetadata basicMetadata) throws IOException {
        t.f(bufferedSource, "<this>");
        t.f(basicMetadata, "basicMetadata");
        FileMetadata orSkipLocalHeader = readOrSkipLocalHeader(bufferedSource, basicMetadata);
        t.c(orSkipLocalHeader);
        return orSkipLocalHeader;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final FileMetadata readOrSkipLocalHeader(BufferedSource bufferedSource, FileMetadata fileMetadata) throws IOException {
        h0 h0Var = new h0();
        h0Var.f21514a = fileMetadata != null ? fileMetadata.getLastModifiedAtMillis() : 0;
        h0 h0Var2 = new h0();
        h0 h0Var3 = new h0();
        int intLe = bufferedSource.readIntLe();
        if (intLe != LOCAL_FILE_HEADER_SIGNATURE) {
            throw new IOException("bad zip: expected " + getHex(LOCAL_FILE_HEADER_SIGNATURE) + " but was " + getHex(intLe));
        }
        bufferedSource.skip(2L);
        int shortLe = bufferedSource.readShortLe() & 65535;
        if ((shortLe & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + getHex(shortLe));
        }
        bufferedSource.skip(18L);
        long shortLe2 = ((long) bufferedSource.readShortLe()) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
        int shortLe3 = bufferedSource.readShortLe() & 65535;
        bufferedSource.skip(shortLe2);
        if (fileMetadata == null) {
            bufferedSource.skip(shortLe3);
            return null;
        }
        readExtra(bufferedSource, shortLe3, new C05071(bufferedSource, h0Var, h0Var2, h0Var3));
        return new FileMetadata(fileMetadata.isRegularFile(), fileMetadata.isDirectory(), null, fileMetadata.getSize(), (Long) h0Var3.f21514a, (Long) h0Var.f21514a, (Long) h0Var2.f21514a, null, 128, null);
    }

    private static final EocdRecord readZip64EocdRecord(BufferedSource bufferedSource, EocdRecord eocdRecord) throws IOException {
        bufferedSource.skip(12L);
        int intLe = bufferedSource.readIntLe();
        int intLe2 = bufferedSource.readIntLe();
        long longLe = bufferedSource.readLongLe();
        if (longLe != bufferedSource.readLongLe() || intLe != 0 || intLe2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        bufferedSource.skip(8L);
        return new EocdRecord(longLe, bufferedSource.readLongLe(), eocdRecord.getCommentByteCount());
    }

    public static final void skipLocalHeader(BufferedSource bufferedSource) throws IOException {
        t.f(bufferedSource, "<this>");
        readOrSkipLocalHeader(bufferedSource, null);
    }
}
