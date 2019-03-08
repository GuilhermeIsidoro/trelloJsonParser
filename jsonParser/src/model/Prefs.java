package model;

import org.codehaus.jackson.annotate.JsonProperty;
import java.util.*;

public class Prefs {
	@JsonProperty("backgroundBrightness") private String backgroundBrightness;
	@JsonProperty("backgroundColor") private String backgroundColor;
	@JsonProperty("comments") private String comments;
	@JsonProperty("backgroundTopColor") private String backgroundTopColor;
	@JsonProperty("canBeEnterprise") private Boolean canBeEnterprise;
	@JsonProperty("backgroundImage") private Object backgroundImage;
	@JsonProperty("canBeOrg") private Boolean canBeOrg;
	@JsonProperty("backgroundBottomColor") private String backgroundBottomColor;
	@JsonProperty("voting") private String voting;
	@JsonProperty("calendarFeedEnabled") private Boolean calendarFeedEnabled;
	@JsonProperty("backgroundTile") private Boolean backgroundTile;
	@JsonProperty("canBePublic") private Boolean canBePublic;
	@JsonProperty("canBePrivate") private Boolean canBePrivate;
	@JsonProperty("backgroundImageScaled") private Object backgroundImageScaled;
	@JsonProperty("permissionLevel") private String permissionLevel;
	@JsonProperty("cardAging") private String cardAging;
	@JsonProperty("canInvite") private Boolean canInvite;
	@JsonProperty("invitations") private String invitations;
	@JsonProperty("background") private String background;
	@JsonProperty("cardCovers") private Boolean cardCovers;
	@JsonProperty("selfJoin") private Boolean selfJoin;
}
