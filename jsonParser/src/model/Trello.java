package model;

import org.codehaus.jackson.annotate.JsonProperty;
import java.util.*;

public class Trello {
	@JsonProperty("board") private Integer board;
	@JsonProperty("card") private Integer card;
}
