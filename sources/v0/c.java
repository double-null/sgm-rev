package v0;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.h;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.ArrayList;

/* JADX INFO: compiled from: DBUtil.java */
/* JADX INFO: loaded from: classes.dex */
public class c {
    public static void a(x0.b bVar) {
        ArrayList<String> arrayList = new ArrayList();
        Cursor cursorC0 = bVar.c0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorC0.moveToNext()) {
            try {
                arrayList.add(cursorC0.getString(0));
            } catch (Throwable th) {
                cursorC0.close();
                throw th;
            }
        }
        cursorC0.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                bVar.j("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static Cursor b(h hVar, x0.e eVar, boolean z10, CancellationSignal cancellationSignal) {
        Cursor cursorQ = hVar.q(eVar, cancellationSignal);
        if (!z10 || !(cursorQ instanceof AbstractWindowedCursor)) {
            return cursorQ;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorQ;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? b.a(abstractWindowedCursor) : cursorQ;
    }

    public static int c(File file) throws IOException {
        AbstractInterruptibleChannel abstractInterruptibleChannel = null;
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i10 = byteBufferAllocate.getInt();
            channel.close();
            return i10;
        } catch (Throwable th) {
            if (0 != 0) {
                abstractInterruptibleChannel.close();
            }
            throw th;
        }
    }
}
