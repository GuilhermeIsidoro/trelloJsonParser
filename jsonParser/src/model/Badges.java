package model;

import org.codehaus.jackson.annotate.JsonProperty;
import java.util.*;

public class Badges {
	@JsonProperty("comments") private Integer comments;
	@JsonProperty("attachments") private Integer attachments;
	@JsonProperty("attachmentsByType") private AttachmentsByType attachmentsByType;
	@JsonProperty("dueComplete") private Boolean dueComplete;
	@JsonProperty("description") private Boolean description;
	@JsonProperty("subscribed") private Boolean subscribed;
	@JsonProperty("due") private Object due;
	@JsonProperty("viewingMemberVoted") private Boolean viewingMemberVoted;
	@JsonProperty("location") private Boolean location;
	@JsonProperty("votes") private Integer votes;
	@JsonProperty("fogbugz") private String fogbugz;
	@JsonProperty("checkItems") private Integer checkItems;
	@JsonProperty("checkItemsChecked") private Integer checkItemsChecked;
}
