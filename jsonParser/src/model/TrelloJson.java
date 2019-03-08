package model;

import org.codehaus.jackson.annotate.JsonProperty;
import java.util.*;

public class TrelloJson {
	@JsonProperty("descData") private Object descData;
	@JsonProperty("checklists") private ArrayList<ChecklistsEntry> checklists;
	@JsonProperty("idTags") private ArrayList<String> idTags;
	@JsonProperty("pinned") private Boolean pinned;
	@JsonProperty("labelNames") private LabelNames labelNames;
	@JsonProperty("cards") private ArrayList<CardsEntry> cards;
	@JsonProperty("shortUrl") private String shortUrl;
	@JsonProperty("customFields") private ArrayList<Object> customFields;
	@JsonProperty("dateLastActivity") private String dateLastActivity;
	@JsonProperty("datePluginDisable") private Object datePluginDisable;
	@JsonProperty("shortLink") private String shortLink;
	@JsonProperty("memberships") private ArrayList<MembershipsEntry> memberships;
	@JsonProperty("creationMethod") private Object creationMethod;
	@JsonProperty("subscribed") private Boolean subscribed;
	@JsonProperty("starred") private Boolean starred;
	@JsonProperty("members") private ArrayList<MembersEntry> members;
	@JsonProperty("idOrganization") private String idOrganization;
	@JsonProperty("dateLastView") private String dateLastView;
	@JsonProperty("pluginData") private ArrayList<String> pluginData;
	@JsonProperty("id") private String id;
	@JsonProperty("limits") private Limits limits;
	@JsonProperty("powerUps") private ArrayList<String> powerUps;
	@JsonProperty("url") private String url;
	@JsonProperty("prefs") private Prefs prefs;
	@JsonProperty("labels") private ArrayList<LabelsEntry> labels;
	@JsonProperty("lists") private ArrayList<ListsEntry> lists;
	@JsonProperty("name") private String name;
	@JsonProperty("closed") private Boolean closed;
	@JsonProperty("actions") private ArrayList<ActionsEntry> actions;
	@JsonProperty("desc") private String desc;
	
	public Object getDescData() {
		return descData;
	}
	public void setDescData(Object descData) {
		this.descData = descData;
	}
	public ArrayList<ChecklistsEntry> getChecklists() {
		return checklists;
	}
	public void setChecklists(ArrayList<ChecklistsEntry> checklists) {
		this.checklists = checklists;
	}
	public ArrayList<String> getIdTags() {
		return idTags;
	}
	public void setIdTags(ArrayList<String> idTags) {
		this.idTags = idTags;
	}
	public Boolean getPinned() {
		return pinned;
	}
	public void setPinned(Boolean pinned) {
		this.pinned = pinned;
	}
	public LabelNames getLabelNames() {
		return labelNames;
	}
	public void setLabelNames(LabelNames labelNames) {
		this.labelNames = labelNames;
	}
	public ArrayList<CardsEntry> getCards() {
		return cards;
	}
	public void setCards(ArrayList<CardsEntry> cards) {
		this.cards = cards;
	}
	public String getShortUrl() {
		return shortUrl;
	}
	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}
	public ArrayList<Object> getCustomFields() {
		return customFields;
	}
	public void setCustomFields(ArrayList<Object> customFields) {
		this.customFields = customFields;
	}
	public String getDateLastActivity() {
		return dateLastActivity;
	}
	public void setDateLastActivity(String dateLastActivity) {
		this.dateLastActivity = dateLastActivity;
	}
	public Object getDatePluginDisable() {
		return datePluginDisable;
	}
	public void setDatePluginDisable(Object datePluginDisable) {
		this.datePluginDisable = datePluginDisable;
	}
	public String getShortLink() {
		return shortLink;
	}
	public void setShortLink(String shortLink) {
		this.shortLink = shortLink;
	}
	public ArrayList<MembershipsEntry> getMemberships() {
		return memberships;
	}
	public void setMemberships(ArrayList<MembershipsEntry> memberships) {
		this.memberships = memberships;
	}
	public Object getCreationMethod() {
		return creationMethod;
	}
	public void setCreationMethod(Object creationMethod) {
		this.creationMethod = creationMethod;
	}
	public Boolean getSubscribed() {
		return subscribed;
	}
	public void setSubscribed(Boolean subscribed) {
		this.subscribed = subscribed;
	}
	public Boolean getStarred() {
		return starred;
	}
	public void setStarred(Boolean starred) {
		this.starred = starred;
	}
	public ArrayList<MembersEntry> getMembers() {
		return members;
	}
	public void setMembers(ArrayList<MembersEntry> members) {
		this.members = members;
	}
	public String getIdOrganization() {
		return idOrganization;
	}
	public void setIdOrganization(String idOrganization) {
		this.idOrganization = idOrganization;
	}
	public String getDateLastView() {
		return dateLastView;
	}
	public void setDateLastView(String dateLastView) {
		this.dateLastView = dateLastView;
	}
	public ArrayList<String> getPluginData() {
		return pluginData;
	}
	public void setPluginData(ArrayList<String> pluginData) {
		this.pluginData = pluginData;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Limits getLimits() {
		return limits;
	}
	public void setLimits(Limits limits) {
		this.limits = limits;
	}
	public ArrayList<String> getPowerUps() {
		return powerUps;
	}
	public void setPowerUps(ArrayList<String> powerUps) {
		this.powerUps = powerUps;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Prefs getPrefs() {
		return prefs;
	}
	public void setPrefs(Prefs prefs) {
		this.prefs = prefs;
	}
	public ArrayList<LabelsEntry> getLabels() {
		return labels;
	}
	public void setLabels(ArrayList<LabelsEntry> labels) {
		this.labels = labels;
	}
	public ArrayList<ListsEntry> getLists() {
		return lists;
	}
	public void setLists(ArrayList<ListsEntry> lists) {
		this.lists = lists;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getClosed() {
		return closed;
	}
	public void setClosed(Boolean closed) {
		this.closed = closed;
	}
	public ArrayList<ActionsEntry> getActions() {
		return actions;
	}
	public void setActions(ArrayList<ActionsEntry> actions) {
		this.actions = actions;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
}
