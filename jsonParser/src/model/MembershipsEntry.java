package model;

import org.codehaus.jackson.annotate.JsonProperty;
import java.util.*;

public class MembershipsEntry {
	@JsonProperty("unconfirmed") private Boolean unconfirmed;
	@JsonProperty("idMember") private String idMember;
	@JsonProperty("id") private String id;
	@JsonProperty("memberType") private String memberType;
	@JsonProperty("deactivated") private Boolean deactivated;
}
