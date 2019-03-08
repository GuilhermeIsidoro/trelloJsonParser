package model;

import org.codehaus.jackson.annotate.JsonProperty;
import java.util.*;

public class Card {
	@JsonProperty("idShort") private Integer idShort;
	@JsonProperty("name") private String name;
	@JsonProperty("id") private String id;
	@JsonProperty("shortLink") private String shortLink;
}
