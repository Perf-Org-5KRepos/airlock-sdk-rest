/*
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ncp.airlock.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents Airlock feature trace and additional information for debugging purpose
 */
@ApiModel(description = "Represents Airlock feature trace and additional information for debugging purpose")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2018-11-27T09:43:16.328Z[Etc/UTC]")
public class FeatureDebugInfo {
  public static final String SERIALIZED_NAME_APPLIED_CONFIGURATION_RULES = "appliedConfigurationRules";
  @SerializedName(SERIALIZED_NAME_APPLIED_CONFIGURATION_RULES)
  private List<String> appliedConfigurationRules = null;

  public static final String SERIALIZED_NAME_APPLIED_ORDERING_RULES = "appliedOrderingRules";
  @SerializedName(SERIALIZED_NAME_APPLIED_ORDERING_RULES)
  private List<String> appliedOrderingRules = null;

  /**
   * The source feature value is loaded from
   */
  @JsonAdapter(SourceEnum.Adapter.class)
  public enum SourceEnum {
    SERVER("SERVER"),
    
    DEFAULT("DEFAULT"),
    
    MISSING("MISSING"),
    
    CACHE("CACHE"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    SourceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SourceEnum fromValue(String text) {
      for (SourceEnum b : SourceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SourceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SourceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private SourceEnum source = null;

  public static final String SERIALIZED_NAME_TRACE = "trace";
  @SerializedName(SERIALIZED_NAME_TRACE)
  private String trace = null;

  public static final String SERIALIZED_NAME_PERCENTAGE = "percentage";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE)
  private Double percentage = null;

  public static final String SERIALIZED_NAME_ORDERING_WEIGHT = "orderingWeight";
  @SerializedName(SERIALIZED_NAME_ORDERING_WEIGHT)
  private Double orderingWeight = null;

  /**
   * The feature branch status indicates whether a feature has been overridden in the another branch
   */
  @JsonAdapter(BranchStatusEnum.Adapter.class)
  public enum BranchStatusEnum {
    CHECKED_OUT("CHECKED_OUT"),
    
    NEW("NEW"),
    
    NONE("NONE"),
    
    TEMPORARY("TEMPORARY");

    private String value;

    BranchStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BranchStatusEnum fromValue(String text) {
      for (BranchStatusEnum b : BranchStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BranchStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BranchStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BranchStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BranchStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_BRANCH_STATUS = "branchStatus";
  @SerializedName(SERIALIZED_NAME_BRANCH_STATUS)
  private BranchStatusEnum branchStatus = null;

  public FeatureDebugInfo appliedConfigurationRules(List<String> appliedConfigurationRules) {
    this.appliedConfigurationRules = appliedConfigurationRules;
    return this;
  }

  public FeatureDebugInfo addAppliedConfigurationRulesItem(String appliedConfigurationRulesItem) {
    if (this.appliedConfigurationRules == null) {
      this.appliedConfigurationRules = new ArrayList<>();
    }
    this.appliedConfigurationRules.add(appliedConfigurationRulesItem);
    return this;
  }

   /**
   * The names list of applied configuration rules
   * @return appliedConfigurationRules
  **/
  @ApiModelProperty(value = "The names list of applied configuration rules")
  public List<String> getAppliedConfigurationRules() {
    return appliedConfigurationRules;
  }

  public void setAppliedConfigurationRules(List<String> appliedConfigurationRules) {
    this.appliedConfigurationRules = appliedConfigurationRules;
  }

  public FeatureDebugInfo appliedOrderingRules(List<String> appliedOrderingRules) {
    this.appliedOrderingRules = appliedOrderingRules;
    return this;
  }

  public FeatureDebugInfo addAppliedOrderingRulesItem(String appliedOrderingRulesItem) {
    if (this.appliedOrderingRules == null) {
      this.appliedOrderingRules = new ArrayList<>();
    }
    this.appliedOrderingRules.add(appliedOrderingRulesItem);
    return this;
  }

   /**
   * The names list of applied ordering rules
   * @return appliedOrderingRules
  **/
  @ApiModelProperty(value = "The names list of applied ordering rules")
  public List<String> getAppliedOrderingRules() {
    return appliedOrderingRules;
  }

  public void setAppliedOrderingRules(List<String> appliedOrderingRules) {
    this.appliedOrderingRules = appliedOrderingRules;
  }

  public FeatureDebugInfo source(SourceEnum source) {
    this.source = source;
    return this;
  }

   /**
   * The source feature value is loaded from
   * @return source
  **/
  @ApiModelProperty(value = "The source feature value is loaded from")
  public SourceEnum getSource() {
    return source;
  }

  public void setSource(SourceEnum source) {
    this.source = source;
  }

  public FeatureDebugInfo trace(String trace) {
    this.trace = trace;
    return this;
  }

   /**
   * Debug information about feature&#39;s rules execution
   * @return trace
  **/
  @ApiModelProperty(value = "Debug information about feature's rules execution")
  public String getTrace() {
    return trace;
  }

  public void setTrace(String trace) {
    this.trace = trace;
  }

  public FeatureDebugInfo percentage(Double percentage) {
    this.percentage = percentage;
    return this;
  }

   /**
   * The percentage of the user the feature is available
   * @return percentage
  **/
  @ApiModelProperty(value = "The percentage of the user the feature is available")
  public Double getPercentage() {
    return percentage;
  }

  public void setPercentage(Double percentage) {
    this.percentage = percentage;
  }

  public FeatureDebugInfo orderingWeight(Double orderingWeight) {
    this.orderingWeight = orderingWeight;
    return this;
  }

   /**
   * The weight value defines the feature ordering place relatively to siblings
   * @return orderingWeight
  **/
  @ApiModelProperty(value = "The weight value defines the feature ordering place relatively to siblings")
  public Double getOrderingWeight() {
    return orderingWeight;
  }

  public void setOrderingWeight(Double orderingWeight) {
    this.orderingWeight = orderingWeight;
  }

  public FeatureDebugInfo branchStatus(BranchStatusEnum branchStatus) {
    this.branchStatus = branchStatus;
    return this;
  }

   /**
   * The feature branch status indicates whether a feature has been overridden in the another branch
   * @return branchStatus
  **/
  @ApiModelProperty(value = "The feature branch status indicates whether a feature has been overridden in the another branch")
  public BranchStatusEnum getBranchStatus() {
    return branchStatus;
  }

  public void setBranchStatus(BranchStatusEnum branchStatus) {
    this.branchStatus = branchStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureDebugInfo featureDebugInfo = (FeatureDebugInfo) o;
    return Objects.equals(this.appliedConfigurationRules, featureDebugInfo.appliedConfigurationRules) &&
        Objects.equals(this.appliedOrderingRules, featureDebugInfo.appliedOrderingRules) &&
        Objects.equals(this.source, featureDebugInfo.source) &&
        Objects.equals(this.trace, featureDebugInfo.trace) &&
        Objects.equals(this.percentage, featureDebugInfo.percentage) &&
        Objects.equals(this.orderingWeight, featureDebugInfo.orderingWeight) &&
        Objects.equals(this.branchStatus, featureDebugInfo.branchStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliedConfigurationRules, appliedOrderingRules, source, trace, percentage, orderingWeight, branchStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureDebugInfo {\n");
    
    sb.append("    appliedConfigurationRules: ").append(toIndentedString(appliedConfigurationRules)).append("\n");
    sb.append("    appliedOrderingRules: ").append(toIndentedString(appliedOrderingRules)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    trace: ").append(toIndentedString(trace)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    orderingWeight: ").append(toIndentedString(orderingWeight)).append("\n");
    sb.append("    branchStatus: ").append(toIndentedString(branchStatus)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
