package model;

import org.codehaus.jackson.annotate.JsonProperty;
import java.util.*;

public class ChecklistsEntry {
	@JsonProperty("idBoard") private String idBoard;
	@JsonProperty("pos") private Integer pos;
	@JsonProperty("idCard") private String idCard;
	@JsonProperty("name") private String name;
	@JsonProperty("id") private String id;
	@JsonProperty("checkItems") private ArrayList<CheckItemsEntry> checkItems;
	@JsonProperty("limits") private Limits limits;
	@JsonProperty("creationMethod") private Object creationMethod;
}
