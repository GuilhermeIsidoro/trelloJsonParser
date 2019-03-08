package model;

import org.codehaus.jackson.annotate.JsonProperty;
import java.util.*;

public class Limits {
	@JsonProperty("checklists") private Checklists checklists;
	@JsonProperty("attachments") private Attachments attachments;
	@JsonProperty("cards") private Cards cards;
	@JsonProperty("customFields") private CustomFields customFields;
	@JsonProperty("lists") private Lists lists;
	@JsonProperty("boards") private Boards boards;
	@JsonProperty("stickers") private Stickers stickers;
	@JsonProperty("reactions") private Reactions reactions;
	@JsonProperty("checkItems") private CheckItems checkItems;
	@JsonProperty("labels") private Labels labels;
}
