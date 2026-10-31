package pb;

import com.vungle.ads.internal.presenter.MRAIDPresenter;

/* JADX INFO: loaded from: classes5.dex */
public enum e0 implements wb.q {
    Track("track"),
    Open(MRAIDPresenter.OPEN),
    NotifyOpen("notify_open"),
    Skip("skip"),
    Close(MRAIDPresenter.CLOSE),
    Mute("mute"),
    UnMute("unmute"),
    Repeat("repeat"),
    Show("show"),
    Hide("hide"),
    Progress("progress"),
    Schedule("schedule"),
    Start("start"),
    LockVisibility("lock_visibility"),
    UnlockVisibility("unlock_visibility"),
    SimulateClick("simulate_click"),
    OpenPrivacySheet("open_privacy_sheet"),
    ToggleStateGroups("toggle_state_groups"),
    Expand("expand"),
    Collapse("collapse"),
    RequestPermission("request_permission"),
    ReportClick("report_click");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f24006b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24030a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        private a() {
        }
    }

    e0(String str) {
        this.f24030a = str;
    }

    @Override // wb.q
    public String getKey() {
        return this.f24030a;
    }
}
