package model;

import org.codehaus.jackson.annotate.JsonProperty;
import java.util.*;

public class MemberCreator {
	@JsonProperty("avatarHash") private String avatarHash;
	@JsonProperty("avatarUrl") private String avatarUrl;
	@JsonProperty("initials") private String initials;
	@JsonProperty("idMemberReferrer") private Object idMemberReferrer;
	@JsonProperty("fullName") private String fullName;
	@JsonProperty("id") private String id;
	@JsonProperty("nonPublic") private Map<String, Object> nonPublic;
	@JsonProperty("username") private String username;
}
