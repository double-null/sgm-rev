package io.bidmachine;

import android.location.Location;
import android.text.TextUtils;
import com.explorestack.protobuf.adcom.Context;
import io.bidmachine.protobuf.sdk.App;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class TargetingParams extends ga.g<TargetingParams> {
    static final String DATA_ID_EXTERNAL_USER_ID = "external_user_ids";
    private Integer birthdayYear;
    private BlockedParams blockedParams;
    private String city;
    private String country;
    private Location deviceLocation;
    private List<ExternalUserId> externalUserIdList;
    private String framework;
    private oc.e gender;
    private Boolean isPaid;
    private String[] keywords;
    private String storeCategory;
    private String[] storeSubCategories;
    private String storeUrl;
    private String userId;
    private String zip;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$fillAppExtension$0(App.Builder builder, String[] strArr) {
        for (String str : strArr) {
            builder.addStoresubcat(str);
        }
    }

    private void prepareBlockParams() {
        if (this.blockedParams == null) {
            this.blockedParams = new BlockedParams();
        }
    }

    void build(Context.App.Builder builder) {
        String str = this.storeUrl;
        if (str != null) {
            builder.setStoreurl(str);
        }
        Boolean bool = this.isPaid;
        builder.setPaid(bool != null && bool.booleanValue());
    }

    void fillAppExtension(final App.Builder builder) {
        String str = this.storeCategory;
        Objects.requireNonNull(builder);
        io.bidmachine.core.h.B(str, new Executable() { // from class: io.bidmachine.s5
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setStorecat((String) obj);
            }
        });
        io.bidmachine.core.h.B(this.storeSubCategories, new Executable() { // from class: io.bidmachine.t5
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                TargetingParams.lambda$fillAppExtension$0(builder, (String[]) obj);
            }
        });
        io.bidmachine.core.h.B(this.framework, new Executable() { // from class: io.bidmachine.u5
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setFmwname((String) obj);
            }
        });
    }

    Integer getBirthdayYear() {
        return this.birthdayYear;
    }

    BlockedParams getBlockedParams() {
        return this.blockedParams;
    }

    String getCity() {
        return this.city;
    }

    String getCountry() {
        return this.country;
    }

    Location getDeviceLocation() {
        return this.deviceLocation;
    }

    List<ExternalUserId> getExternalUserIdList() {
        return this.externalUserIdList;
    }

    String getFramework() {
        return this.framework;
    }

    oc.e getGender() {
        return this.gender;
    }

    String[] getKeywords() {
        return this.keywords;
    }

    Boolean getPaid() {
        return this.isPaid;
    }

    String getStoreCategory() {
        return this.storeCategory;
    }

    String[] getStoreSubCategories() {
        return this.storeSubCategories;
    }

    String getStoreUrl() {
        return this.storeUrl;
    }

    String getUserId() {
        return this.userId;
    }

    String getZip() {
        return this.zip;
    }

    /* JADX INFO: renamed from: setExternalUserIds, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m345setExternalUserIds(List list) {
        return setExternalUserIds((List<ExternalUserId>) list);
    }

    /* JADX INFO: renamed from: addBlockedAdvertiserDomain, reason: merged with bridge method [inline-methods] */
    public TargetingParams m338addBlockedAdvertiserDomain(String str) {
        prepareBlockParams();
        this.blockedParams.m322addBlockedAdvertiserDomain(str);
        return this;
    }

    /* JADX INFO: renamed from: addBlockedAdvertiserIABCategory, reason: merged with bridge method [inline-methods] */
    public TargetingParams m339addBlockedAdvertiserIABCategory(String str) {
        prepareBlockParams();
        this.blockedParams.m323addBlockedAdvertiserIABCategory(str);
        return this;
    }

    /* JADX INFO: renamed from: addBlockedApplication, reason: merged with bridge method [inline-methods] */
    public TargetingParams m340addBlockedApplication(String str) {
        prepareBlockParams();
        this.blockedParams.m324addBlockedApplication(str);
        return this;
    }

    @Override // ga.g
    public void merge(TargetingParams targetingParams) {
        this.userId = (String) io.bidmachine.core.h.T(this.userId, targetingParams.userId);
        this.gender = (oc.e) io.bidmachine.core.h.T(this.gender, targetingParams.gender);
        this.birthdayYear = (Integer) io.bidmachine.core.h.T(this.birthdayYear, targetingParams.birthdayYear);
        this.keywords = (String[]) io.bidmachine.core.h.T(this.keywords, targetingParams.keywords);
        this.country = (String) io.bidmachine.core.h.T(this.country, targetingParams.country);
        this.city = (String) io.bidmachine.core.h.T(this.city, targetingParams.city);
        this.zip = (String) io.bidmachine.core.h.T(this.zip, targetingParams.zip);
        this.deviceLocation = (Location) io.bidmachine.core.h.T(this.deviceLocation, targetingParams.deviceLocation);
        this.storeUrl = (String) io.bidmachine.core.h.T(this.storeUrl, targetingParams.storeUrl);
        this.storeCategory = (String) io.bidmachine.core.h.T(this.storeCategory, targetingParams.storeCategory);
        this.storeSubCategories = (String[]) io.bidmachine.core.h.T(this.storeSubCategories, targetingParams.storeSubCategories);
        this.framework = (String) io.bidmachine.core.h.T(this.framework, targetingParams.framework);
        this.isPaid = (Boolean) io.bidmachine.core.h.T(this.isPaid, targetingParams.isPaid);
        this.externalUserIdList = (List) io.bidmachine.core.h.T(this.externalUserIdList, targetingParams.externalUserIdList);
        if (targetingParams.blockedParams != null) {
            if (this.blockedParams == null) {
                this.blockedParams = new BlockedParams();
            }
            this.blockedParams.merge(targetingParams.blockedParams);
        }
    }

    /* JADX INFO: renamed from: setBirthdayYear, reason: merged with bridge method [inline-methods] */
    public TargetingParams m341setBirthdayYear(Integer num) {
        if (num == null || io.bidmachine.core.h.J(num.intValue())) {
            this.birthdayYear = num;
        } else {
            io.bidmachine.core.a.f("Birthday Year should be 4-digit integer, more or equal 1900 and less or equal than current year");
        }
        return this;
    }

    /* JADX INFO: renamed from: setCity, reason: merged with bridge method [inline-methods] */
    public TargetingParams m342setCity(String str) {
        this.city = str;
        return this;
    }

    /* JADX INFO: renamed from: setCountry, reason: merged with bridge method [inline-methods] */
    public TargetingParams m343setCountry(String str) {
        this.country = str;
        return this;
    }

    /* JADX INFO: renamed from: setDeviceLocation, reason: merged with bridge method [inline-methods] */
    public TargetingParams m344setDeviceLocation(Location location) {
        this.deviceLocation = location;
        return this;
    }

    public TargetingParams setExternalUserIds(List<ExternalUserId> list) {
        this.externalUserIdList = list;
        return this;
    }

    /* JADX INFO: renamed from: setFramework, reason: merged with bridge method [inline-methods] */
    public TargetingParams m346setFramework(String str) {
        this.framework = str;
        return this;
    }

    /* JADX INFO: renamed from: setGender, reason: merged with bridge method [inline-methods] */
    public TargetingParams m347setGender(oc.e eVar) {
        this.gender = eVar;
        return this;
    }

    /* JADX INFO: renamed from: setKeywords, reason: merged with bridge method [inline-methods] */
    public TargetingParams m348setKeywords(String... strArr) {
        this.keywords = strArr;
        return this;
    }

    /* JADX INFO: renamed from: setPaid, reason: merged with bridge method [inline-methods] */
    public TargetingParams m349setPaid(Boolean bool) {
        this.isPaid = bool;
        return this;
    }

    /* JADX INFO: renamed from: setStoreCategory, reason: merged with bridge method [inline-methods] */
    public TargetingParams m350setStoreCategory(String str) {
        this.storeCategory = str;
        return this;
    }

    /* JADX INFO: renamed from: setStoreSubCategories, reason: merged with bridge method [inline-methods] */
    public TargetingParams m351setStoreSubCategories(String... strArr) {
        this.storeSubCategories = strArr;
        return this;
    }

    /* JADX INFO: renamed from: setStoreUrl, reason: merged with bridge method [inline-methods] */
    public TargetingParams m352setStoreUrl(String str) {
        this.storeUrl = str;
        return this;
    }

    /* JADX INFO: renamed from: setUserId, reason: merged with bridge method [inline-methods] */
    public TargetingParams m353setUserId(String str) {
        this.userId = str;
        return this;
    }

    /* JADX INFO: renamed from: setZip, reason: merged with bridge method [inline-methods] */
    public TargetingParams m354setZip(String str) {
        this.zip = str;
        return this;
    }

    void build(Context.User.Builder builder) {
        String str = this.userId;
        if (str != null) {
            builder.setId(str);
        }
        Integer num = this.birthdayYear;
        if (num != null) {
            builder.setYob(num.intValue());
        }
        oc.e eVar = this.gender;
        if (eVar != null) {
            builder.setGender(eVar.c());
        }
        String[] strArr = this.keywords;
        if (strArr != null && strArr.length > 0) {
            StringBuilder sb2 = new StringBuilder();
            for (String str2 : this.keywords) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            builder.setKeywords(sb2.toString());
        }
        Context.Geo.Builder builderNewBuilder = Context.Geo.newBuilder();
        build(builderNewBuilder);
        oc.h.e(builderNewBuilder, null, false);
        builder.setGeo(builderNewBuilder);
        List<ExternalUserId> list = this.externalUserIdList;
        if (list == null || list.size() <= 0) {
            return;
        }
        Context.Data.Builder id2 = Context.Data.newBuilder().setId(DATA_ID_EXTERNAL_USER_ID);
        for (ExternalUserId externalUserId : this.externalUserIdList) {
            String sourceId = externalUserId.getSourceId();
            String value = externalUserId.getValue();
            if (!TextUtils.isEmpty(sourceId) && !TextUtils.isEmpty(value)) {
                id2.addSegment(Context.Data.Segment.newBuilder().setId(sourceId).setValue(value));
            }
        }
        builder.addData(id2);
    }

    void build(Context.Geo.Builder builder) {
        String str = this.country;
        if (str != null) {
            builder.setCountry(str);
        }
        String str2 = this.city;
        if (str2 != null) {
            builder.setCity(str2);
        }
        String str3 = this.zip;
        if (str3 != null) {
            builder.setZip(str3);
        }
    }
}
