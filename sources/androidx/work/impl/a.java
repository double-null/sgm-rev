package androidx.work.impl;

import android.content.Context;

/* JADX INFO: compiled from: WorkDatabaseMigrations.java */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u0.a f3680a = new C0074a(1, 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static u0.a f3681b = new b(3, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static u0.a f3682c = new c(4, 5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static u0.a f3683d = new d(6, 7);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static u0.a f3684e = new e(7, 8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static u0.a f3685f = new f(8, 9);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static u0.a f3686g = new g(11, 12);

    /* JADX INFO: renamed from: androidx.work.impl.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: WorkDatabaseMigrations.java */
    class C0074a extends u0.a {
        C0074a(int i10, int i11) {
            super(i10, i11);
        }

        @Override // u0.a
        public void a(x0.b bVar) {
            bVar.j("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.j("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            bVar.j("DROP TABLE IF EXISTS alarmInfo");
            bVar.j("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* JADX INFO: compiled from: WorkDatabaseMigrations.java */
    class b extends u0.a {
        b(int i10, int i11) {
            super(i10, i11);
        }

        @Override // u0.a
        public void a(x0.b bVar) {
            bVar.j("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
        }
    }

    /* JADX INFO: compiled from: WorkDatabaseMigrations.java */
    class c extends u0.a {
        c(int i10, int i11) {
            super(i10, i11);
        }

        @Override // u0.a
        public void a(x0.b bVar) {
            bVar.j("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            bVar.j("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* JADX INFO: compiled from: WorkDatabaseMigrations.java */
    class d extends u0.a {
        d(int i10, int i11) {
            super(i10, i11);
        }

        @Override // u0.a
        public void a(x0.b bVar) {
            bVar.j("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* JADX INFO: compiled from: WorkDatabaseMigrations.java */
    class e extends u0.a {
        e(int i10, int i11) {
            super(i10, i11);
        }

        @Override // u0.a
        public void a(x0.b bVar) {
            bVar.j("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* JADX INFO: compiled from: WorkDatabaseMigrations.java */
    class f extends u0.a {
        f(int i10, int i11) {
            super(i10, i11);
        }

        @Override // u0.a
        public void a(x0.b bVar) {
            bVar.j("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* JADX INFO: compiled from: WorkDatabaseMigrations.java */
    class g extends u0.a {
        g(int i10, int i11) {
            super(i10, i11);
        }

        @Override // u0.a
        public void a(x0.b bVar) {
            bVar.j("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* JADX INFO: compiled from: WorkDatabaseMigrations.java */
    public static class h extends u0.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Context f3687c;

        public h(Context context, int i10, int i11) {
            super(i10, i11);
            this.f3687c = context;
        }

        @Override // u0.a
        public void a(x0.b bVar) {
            if (this.f25873b >= 10) {
                bVar.x("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.f3687c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    /* JADX INFO: compiled from: WorkDatabaseMigrations.java */
    public static class i extends u0.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Context f3688c;

        public i(Context context) {
            super(9, 10);
            this.f3688c = context;
        }

        @Override // u0.a
        public void a(x0.b bVar) {
            bVar.j("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            n1.g.b(this.f3688c, bVar);
            n1.e.a(this.f3688c, bVar);
        }
    }
}
