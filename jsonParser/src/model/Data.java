package model;

import org.codehaus.jackson.annotate.JsonProperty;
import java.util.*;

public class Data {
	@JsonProperty("list") private List list;
	@JsonProperty("board") private Board board;
	@JsonProperty("card") private Card card;
}
