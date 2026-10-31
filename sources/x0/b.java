package x0;

import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* JADX INFO: compiled from: SupportSQLiteDatabase.java */
/* JADX INFO: loaded from: classes.dex */
public interface b extends Closeable {
    void A();

    Cursor R(e eVar);

    f T(String str);

    void a();

    Cursor c0(String str);

    Cursor g0(e eVar, CancellationSignal cancellationSignal);

    String getPath();

    boolean h0();

    List<Pair<String, String>> i();

    boolean isOpen();

    void j(String str) throws SQLException;

    void w();

    void x(String str, Object[] objArr) throws SQLException;
}
