package model;

import org.codehaus.jackson.annotate.JsonProperty;
import java.util.*;

public class ListsEntry {
	@JsonProperty("subscribed") private Boolean subscribed;
	@JsonProperty("idBoard") private String idBoard;
	@JsonProperty("pos") private Double pos;
	@JsonProperty("name") private String name;
	@JsonProperty("closed") private Boolean closed;
	@JsonProperty("id") private String id;
	@JsonProperty("limits") private Limits limits;
	@JsonProperty("softLimit") private Object softLimit;
	@JsonProperty("creationMethod") private Object creationMethod;
}
