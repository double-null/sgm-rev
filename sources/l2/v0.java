package l2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: SchemaManager.java */
/* JADX INFO: loaded from: classes3.dex */
final class v0 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f21714c = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static int f21715d = 7;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f21716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f21717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a f21718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f21719h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f21720i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final a f21721j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a f21722k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final List<a> f21723l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f21725b;

    /* JADX INFO: compiled from: SchemaManager.java */
    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        a aVar = new a() { // from class: l2.o0
            @Override // l2.v0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                v0.p(sQLiteDatabase);
            }
        };
        f21716e = aVar;
        a aVar2 = new a() { // from class: l2.p0
            @Override // l2.v0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                v0.s(sQLiteDatabase);
            }
        };
        f21717f = aVar2;
        a aVar3 = new a() { // from class: l2.q0
            @Override // l2.v0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f21718g = aVar3;
        a aVar4 = new a() { // from class: l2.r0
            @Override // l2.v0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                v0.u(sQLiteDatabase);
            }
        };
        f21719h = aVar4;
        a aVar5 = new a() { // from class: l2.s0
            @Override // l2.v0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                v0.v(sQLiteDatabase);
            }
        };
        f21720i = aVar5;
        a aVar6 = new a() { // from class: l2.t0
            @Override // l2.v0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
            }
        };
        f21721j = aVar6;
        a aVar7 = new a() { // from class: l2.u0
            @Override // l2.v0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                v0.B(sQLiteDatabase);
            }
        };
        f21722k = aVar7;
        f21723l = Arrays.asList(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    v0(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f21725b = false;
        this.f21724a = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void B(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN pseudonymous_id TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_clear_blob BLOB");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_encrypted_blob BLOB");
    }

    private void C(SQLiteDatabase sQLiteDatabase, int i10) {
        o(sQLiteDatabase);
        F(sQLiteDatabase, 0, i10);
    }

    private void F(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        List<a> list = f21723l;
        if (i11 <= list.size()) {
            while (i10 < i11) {
                f21723l.get(i10).a(sQLiteDatabase);
                i10++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i10 + " to " + i11 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    private void o(SQLiteDatabase sQLiteDatabase) {
        if (this.f21725b) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f21714c);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f21725b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        C(sQLiteDatabase, this.f21724a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        C(sQLiteDatabase, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        o(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        o(sQLiteDatabase);
        F(sQLiteDatabase, i10, i11);
    }
}
