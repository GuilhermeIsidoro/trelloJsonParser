package model;

import org.codehaus.jackson.annotate.JsonProperty;
import java.util.*;

public class MembersEntry {
	@JsonProperty("idEnterprisesDeactivated") private Object idEnterprisesDeactivated;
	@JsonProperty("avatarUrl") private String avatarUrl;
	@JsonProperty("initials") private String initials;
	@JsonProperty("idMemberReferrer") private Object idMemberReferrer;
	@JsonProperty("bio") private String bio;
	@JsonProperty("fullName") private String fullName;
	@JsonProperty("nonPublic") private Map<String, Object> nonPublic;
	@JsonProperty("confirmed") private Boolean confirmed;
	@JsonProperty("idPremOrgsAdmin") private ArrayList<Object> idPremOrgsAdmin;
	@JsonProperty("url") private String url;
	@JsonProperty("products") private ArrayList<Object> products;
	@JsonProperty("avatarHash") private String avatarHash;
	@JsonProperty("idEnterprise") private Object idEnterprise;
	@JsonProperty("id") private String id;
	@JsonProperty("memberType") private String memberType;
	@JsonProperty("bioData") private BioData bioData;
	@JsonProperty("status") private String status;
	@JsonProperty("username") private String username;
}
