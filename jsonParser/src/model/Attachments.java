package model;

import org.codehaus.jackson.annotate.JsonProperty;
import java.util.*;

public class Attachments {
	@JsonProperty("perCard") private PerCard perCard;
	@JsonProperty("perBoard") private PerBoard perBoard;
}
