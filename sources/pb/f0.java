package pb;

/* JADX INFO: loaded from: classes5.dex */
public enum f0 implements wb.q {
    OnImpression("on_impression"),
    OnBillableImpression("on_billable_impression"),
    OnClick("on_click"),
    OnClickResolved("on_click_resolved"),
    OnMute("on_mute"),
    OnUnMute("on_unmute"),
    OnPause("on_pause"),
    OnResume("on_resume"),
    OnSkip("on_skip"),
    OnClose("on_close"),
    OnStart("on_start"),
    OnFirstQuartile("on_first_quartile"),
    OnMidpoint("on_midpoint"),
    OnThirdQuartile("on_third_quartile"),
    OnComplete("on_complete"),
    OnProgress("on_progress"),
    OnUseCustomClose("on_use_custom_close"),
    OnScheduled("on_scheduled"),
    OnNavigate("on_navigate"),
    OnExpand("on_expand"),
    OnCollapse("on_collapse");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f24036b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24059a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        private a() {
        }
    }

    f0(String str) {
        this.f24059a = str;
    }

    @Override // wb.q
    public String getKey() {
        return this.f24059a;
    }
}
