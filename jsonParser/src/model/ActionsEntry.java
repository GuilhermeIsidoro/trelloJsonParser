package model;

import org.codehaus.jackson.annotate.JsonProperty;
import java.util.*;

public class ActionsEntry {
	@JsonProperty("date") private String date;
	@JsonProperty("data") private Data data;
	@JsonProperty("memberCreator") private MemberCreator memberCreator;
	@JsonProperty("member") private Member member;
	@JsonProperty("id") private String id;
	@JsonProperty("type") private String type;
	@JsonProperty("idMemberCreator") private String idMemberCreator;
	@JsonProperty("limits") private Map<String, Object> limits;
}
