package model;

import org.codehaus.jackson.annotate.JsonProperty;
import java.util.*;

public class AttachmentsByType {
	@JsonProperty("trello") private Trello trello;
}
