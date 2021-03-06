package com.myteam.tts_connected_claims;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class incidentDetails implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("incidentTime")
	private String incidentTime;

	@org.kie.api.definition.type.Label("location")
	private java.lang.String location;

	@org.kie.api.definition.type.Label("description")
	private java.lang.String description;

	@org.kie.api.definition.type.Label("triggerSource")
	private java.lang.String triggerSource;

	@org.kie.api.definition.type.Label("incidentType")
	private java.lang.String incidentType;

	@org.kie.api.definition.type.Label("riskItem")
	private java.lang.String riskItem;

	@org.kie.api.definition.type.Label("drivable")
	private String drivable;

	@org.kie.api.definition.type.Label("incidentDriver")
	private java.lang.String incidentDriver;

	@org.kie.api.definition.type.Label("speakingTo")
	private java.lang.String speakingTo;

	@org.kie.api.definition.type.Label("passengerCount")
	private java.lang.Integer passengerCount;

	@org.kie.api.definition.type.Label("claimNumber")
	private java.lang.String claimNumber;

	@org.kie.api.definition.type.Label("customerDetails")
	@javax.persistence.ManyToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	private com.myteam.tts_connected_claims.customerDetails customerDetails;

	@org.kie.api.definition.type.Label("policyDetails")
	@javax.persistence.ManyToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	private com.myteam.tts_connected_claims.policyDetails policyDetails;

	@org.kie.api.definition.type.Label("vehicleDetails")
	@javax.persistence.ManyToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	private com.myteam.tts_connected_claims.vehicleDetails vehicleDetails;

	@org.kie.api.definition.type.Label("incidentId")
	private java.lang.String incidentId;

	@org.kie.api.definition.type.Label("ambulanceServices")
	@javax.persistence.OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	private com.myteam.tts_connected_claims.serviceOffering ambulanceServices;

	@javax.persistence.OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label("towingServices")
	private com.myteam.tts_connected_claims.serviceOffering towingServices;

	@javax.persistence.OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label("roadsideAssistServices")
	private com.myteam.tts_connected_claims.serviceOffering roadsideAssistServices;

	@javax.persistence.OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label("taxiServices")
	private com.myteam.tts_connected_claims.serviceOffering taxiServices;

	@javax.persistence.ManyToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label("carHireServices")
	private com.myteam.tts_connected_claims.serviceOffering carHireServices;

	@org.kie.api.definition.type.Label("incidentDriverOther")
	private java.lang.String incidentDriverOther;

	@org.kie.api.definition.type.Label("speakingToOther")
	private java.lang.String speakingToOther;

	@org.kie.api.definition.type.Label("vehicleIncidentSubType")
	private java.lang.String vehicleIncidentSubType;

	@org.kie.api.definition.type.Label("vehicleIncidentType")
	private java.lang.String vehicleIncidentType;

	@org.kie.api.definition.type.Label("carHireEligibility")
	private java.lang.String carHireEligibility;

	@org.kie.api.definition.type.Label("primaryContactDetails")
	@javax.persistence.ManyToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	private com.myteam.tts_connected_claims.contactDetail primaryContactDetails;

	@org.kie.api.definition.type.Label("secondaryContactDetails")
	@javax.persistence.OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	private java.util.List<com.myteam.tts_connected_claims.contactDetail> secondaryContactDetails;

	@org.kie.api.definition.type.Label("medicalDetails")
	private java.lang.String medicalDetails;

	@org.kie.api.definition.type.Label("creator")
	private java.lang.String creator;

	@org.kie.api.definition.type.Label("owner")
	private java.lang.String owner;

	@org.kie.api.definition.type.Label("processId")
	private java.lang.String processId;

	@org.kie.api.definition.type.Label("containerId")
	private java.lang.String containerId;

	@org.kie.api.definition.type.Label("processInstanceId")
	private java.lang.Long processInstanceId;

	@org.kie.api.definition.type.Label("caseStatus")
	private java.lang.String caseStatus;

	@org.kie.api.definition.type.Label("medicalService")
	private java.lang.String medicalService;

	@javax.persistence.OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label("thirdPartyDetails")
	private java.util.List<com.myteam.tts_connected_claims.thirdPartyDetails> thirdPartyDetails;

	@org.kie.api.definition.type.Label("group")
	private java.lang.String group;

	@org.kie.api.definition.type.Label("enableIncidentServices")
	private java.lang.Boolean enableIncidentServices;

	@javax.persistence.ManyToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label("vehicleInnerDamage")
	private com.myteam.tts_connected_claims.vehicleInnerDamage vehicleInnerDamage;

	@org.kie.api.definition.type.Label("drivableUpdateReason")
	private java.lang.String drivableUpdateReason;

	@javax.persistence.ManyToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label("vehicleOuterDamage")
	private com.myteam.tts_connected_claims.vehicleOuterDamage vehicleOuterDamage;

	@org.kie.api.definition.type.Label("caseTime")
	private java.lang.String caseTime;

	@org.kie.api.definition.type.Label("agentName")
	private java.lang.String agentName;

	@org.kie.api.definition.type.Label("drivableReasonOther")
	private java.lang.String drivableReasonOther;

	@org.kie.api.definition.type.Label("incidentDriverAssociation")
	private java.lang.String incidentDriverAssociation;

	@org.kie.api.definition.type.Label("riskitemSequenceNo")
	private java.lang.String riskitemSequenceNo;

	@org.kie.api.definition.type.Label(value = "speakingToDisplayValue")
	private java.lang.String speakingToDisplayValue;

	public incidentDetails() {
	}

	public java.lang.String getLocation() {
		return this.location;
	}

	public void setLocation(java.lang.String location) {
		this.location = location;
	}

	public java.lang.String getDescription() {
		return this.description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public java.lang.String getTriggerSource() {
		return this.triggerSource;
	}

	public void setTriggerSource(java.lang.String triggerSource) {
		this.triggerSource = triggerSource;
	}

	public java.lang.String getIncidentType() {
		return this.incidentType;
	}

	public void setIncidentType(java.lang.String incidentType) {
		this.incidentType = incidentType;
	}

	public java.lang.String getRiskItem() {
		return this.riskItem;
	}

	public void setRiskItem(java.lang.String riskItem) {
		this.riskItem = riskItem;
	}

	public java.lang.String getIncidentDriver() {
		return this.incidentDriver;
	}

	public void setIncidentDriver(java.lang.String incidentDriver) {
		this.incidentDriver = incidentDriver;
	}

	public java.lang.String getSpeakingTo() {
		return this.speakingTo;
	}

	public void setSpeakingTo(java.lang.String speakingTo) {
		this.speakingTo = speakingTo;
	}

	public java.lang.Integer getPassengerCount() {
		return this.passengerCount;
	}

	public void setPassengerCount(java.lang.Integer passengerCount) {
		this.passengerCount = passengerCount;
	}

	public java.lang.String getClaimNumber() {
		return this.claimNumber;
	}

	public void setClaimNumber(java.lang.String claimNumber) {
		this.claimNumber = claimNumber;
	}

	public com.myteam.tts_connected_claims.customerDetails getCustomerDetails() {
		return this.customerDetails;
	}

	public void setCustomerDetails(
			com.myteam.tts_connected_claims.customerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}

	public com.myteam.tts_connected_claims.policyDetails getPolicyDetails() {
		return this.policyDetails;
	}

	public void setPolicyDetails(
			com.myteam.tts_connected_claims.policyDetails policyDetails) {
		this.policyDetails = policyDetails;
	}

	public com.myteam.tts_connected_claims.vehicleDetails getVehicleDetails() {
		return this.vehicleDetails;
	}

	public void setVehicleDetails(
			com.myteam.tts_connected_claims.vehicleDetails vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}

	public java.lang.String getIncidentId() {
		return this.incidentId;
	}

	public void setIncidentId(java.lang.String incidentId) {
		this.incidentId = incidentId;
	}

	public java.lang.String getDrivable() {
		return this.drivable;
	}

	public void setDrivable(java.lang.String drivable) {
		this.drivable = drivable;
	}

	public com.myteam.tts_connected_claims.serviceOffering getAmbulanceServices() {
		return this.ambulanceServices;
	}

	public void setAmbulanceServices(
			com.myteam.tts_connected_claims.serviceOffering ambulanceServices) {
		this.ambulanceServices = ambulanceServices;
	}

	public com.myteam.tts_connected_claims.serviceOffering getTowingServices() {
		return this.towingServices;
	}

	public void setTowingServices(
			com.myteam.tts_connected_claims.serviceOffering towingServices) {
		this.towingServices = towingServices;
	}

	public com.myteam.tts_connected_claims.serviceOffering getRoadsideAssistServices() {
		return this.roadsideAssistServices;
	}

	public void setRoadsideAssistServices(
			com.myteam.tts_connected_claims.serviceOffering roadsideAssistServices) {
		this.roadsideAssistServices = roadsideAssistServices;
	}

	public com.myteam.tts_connected_claims.serviceOffering getTaxiServices() {
		return this.taxiServices;
	}

	public void setTaxiServices(
			com.myteam.tts_connected_claims.serviceOffering taxiServices) {
		this.taxiServices = taxiServices;
	}

	public com.myteam.tts_connected_claims.serviceOffering getCarHireServices() {
		return this.carHireServices;
	}

	public void setCarHireServices(
			com.myteam.tts_connected_claims.serviceOffering carHireServices) {
		this.carHireServices = carHireServices;
	}

	public java.lang.String getIncidentDriverOther() {
		return this.incidentDriverOther;
	}

	public void setIncidentDriverOther(java.lang.String incidentDriverOther) {
		this.incidentDriverOther = incidentDriverOther;
	}

	public java.lang.String getSpeakingToOther() {
		return this.speakingToOther;
	}

	public void setSpeakingToOther(java.lang.String speakingToOther) {
		this.speakingToOther = speakingToOther;
	}

	public java.lang.String getVehicleIncidentSubType() {
		return this.vehicleIncidentSubType;
	}

	public void setVehicleIncidentSubType(
			java.lang.String vehicleIncidentSubType) {
		this.vehicleIncidentSubType = vehicleIncidentSubType;
	}

	public java.lang.String getVehicleIncidentType() {
		return this.vehicleIncidentType;
	}

	public void setVehicleIncidentType(java.lang.String vehicleIncidentType) {
		this.vehicleIncidentType = vehicleIncidentType;
	}

	public java.lang.String getCarHireEligibility() {
		return this.carHireEligibility;
	}

	public void setCarHireEligibility(java.lang.String carHireEligibility) {
		this.carHireEligibility = carHireEligibility;
	}

	public com.myteam.tts_connected_claims.contactDetail getPrimaryContactDetails() {
		return this.primaryContactDetails;
	}

	public void setPrimaryContactDetails(
			com.myteam.tts_connected_claims.contactDetail primaryContactDetails) {
		this.primaryContactDetails = primaryContactDetails;
	}

	public java.util.List<com.myteam.tts_connected_claims.contactDetail> getSecondaryContactDetails() {
		return this.secondaryContactDetails;
	}

	public void setSecondaryContactDetails(
			java.util.List<com.myteam.tts_connected_claims.contactDetail> secondaryContactDetails) {
		this.secondaryContactDetails = secondaryContactDetails;
	}

	public java.lang.String getMedicalDetails() {
		return this.medicalDetails;
	}

	public void setMedicalDetails(java.lang.String medicalDetails) {
		this.medicalDetails = medicalDetails;
	}

	public java.lang.String getCreator() {
		return this.creator;
	}

	public void setCreator(java.lang.String creator) {
		this.creator = creator;
	}

	public java.lang.String getOwner() {
		return this.owner;
	}

	public void setOwner(java.lang.String owner) {
		this.owner = owner;
	}

	public incidentDetails(
			java.lang.String location,
			java.lang.String description,
			java.lang.String triggerSource,
			java.lang.String incidentType,
			java.lang.String riskItem,
			java.lang.String drivable,
			java.lang.String incidentDriver,
			java.lang.String speakingTo,
			java.lang.Integer passengerCount,
			java.lang.String claimNumber,
			com.myteam.tts_connected_claims.customerDetails customerDetails,
			com.myteam.tts_connected_claims.policyDetails policyDetails,
			com.myteam.tts_connected_claims.vehicleDetails vehicleDetails,
			com.myteam.tts_connected_claims.vehicleInnerDamage vehicleInnerDamage,
			java.lang.String incidentId,
			com.myteam.tts_connected_claims.serviceOffering ambulanceServices,
			com.myteam.tts_connected_claims.serviceOffering towingServices,
			com.myteam.tts_connected_claims.serviceOffering roadsideAssistServices,
			com.myteam.tts_connected_claims.serviceOffering taxiServices,
			com.myteam.tts_connected_claims.serviceOffering carHireServices,
			java.lang.String incidentDriverOther,
			java.lang.String speakingToOther,
			java.lang.String vehicleIncidentSubType,
			java.lang.String vehicleIncidentType,
			java.lang.String carHireEligibility,
			com.myteam.tts_connected_claims.contactDetail primaryContactDetails,
			java.util.List<com.myteam.tts_connected_claims.contactDetail> secondaryContactDetails,
			java.lang.String medicalDetails, java.lang.String creator,
			java.lang.String owner) {
		this.incidentTime = incidentTime;
		this.location = location;
		this.description = description;
		this.triggerSource = triggerSource;
		this.incidentType = incidentType;
		this.riskItem = riskItem;
		this.drivable = drivable;
		this.incidentDriver = incidentDriver;
		this.speakingTo = speakingTo;
		this.passengerCount = passengerCount;
		this.claimNumber = claimNumber;
		this.customerDetails = customerDetails;
		this.policyDetails = policyDetails;
		this.vehicleDetails = vehicleDetails;
		this.vehicleInnerDamage = vehicleInnerDamage;
		this.incidentId = incidentId;
		this.ambulanceServices = ambulanceServices;
		this.towingServices = towingServices;
		this.roadsideAssistServices = roadsideAssistServices;
		this.taxiServices = taxiServices;
		this.carHireServices = carHireServices;
		this.incidentDriverOther = incidentDriverOther;
		this.speakingToOther = speakingToOther;
		this.vehicleIncidentSubType = vehicleIncidentSubType;
		this.vehicleIncidentType = vehicleIncidentType;
		this.carHireEligibility = carHireEligibility;
		this.primaryContactDetails = primaryContactDetails;
		this.secondaryContactDetails = secondaryContactDetails;
		this.medicalDetails = medicalDetails;
		this.creator = creator;
		this.owner = owner;

	}

	public java.lang.String getProcessId() {
		return this.processId;
	}

	public void setProcessId(java.lang.String processId) {
		this.processId = processId;
	}

	public java.lang.String getContainerId() {
		return this.containerId;
	}

	public void setContainerId(java.lang.String containerId) {
		this.containerId = containerId;
	}

	public java.lang.Long getProcessInstanceId() {
		return this.processInstanceId;
	}

	public void setProcessInstanceId(java.lang.Long processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public java.lang.String getCaseStatus() {
		return this.caseStatus;
	}

	public void setCaseStatus(java.lang.String caseStatus) {
		this.caseStatus = caseStatus;
	}

	public java.lang.String getMedicalService() {
		return this.medicalService;
	}

	public void setMedicalService(java.lang.String medicalService) {
		this.medicalService = medicalService;
	}

	public java.lang.String getIncidentTime() {
		return this.incidentTime;
	}

	public void setIncidentTime(java.lang.String incidentTime) {
		this.incidentTime = incidentTime;
	}

	public java.util.List<com.myteam.tts_connected_claims.thirdPartyDetails> getThirdPartyDetails() {
		return this.thirdPartyDetails;
	}

	public void setThirdPartyDetails(
			java.util.List<com.myteam.tts_connected_claims.thirdPartyDetails> thirdPartyDetails) {
		this.thirdPartyDetails = thirdPartyDetails;
	}

	public java.lang.String getGroup() {
		return this.group;
	}

	public void setGroup(java.lang.String group) {
		this.group = group;
	}

	public java.lang.Boolean getEnableIncidentServices() {
		return this.enableIncidentServices;
	}

	public void setEnableIncidentServices(
			java.lang.Boolean enableIncidentServices) {
		this.enableIncidentServices = enableIncidentServices;
	}

	public com.myteam.tts_connected_claims.vehicleInnerDamage getVehicleInnerDamage() {
		return this.vehicleInnerDamage;
	}

	public void setVehicleInnerDamage(
			com.myteam.tts_connected_claims.vehicleInnerDamage vehicleInnerDamage) {
		this.vehicleInnerDamage = vehicleInnerDamage;
	}

	public java.lang.String getDrivableUpdateReason() {
		return this.drivableUpdateReason;
	}

	public void setDrivableUpdateReason(java.lang.String drivableUpdateReason) {
		this.drivableUpdateReason = drivableUpdateReason;
	}

	public incidentDetails(
			java.lang.String incidentTime,
			java.lang.String location,
			java.lang.String description,
			java.lang.String triggerSource,
			java.lang.String incidentType,
			java.lang.String riskItem,
			java.lang.String drivable,
			java.lang.String incidentDriver,
			java.lang.String speakingTo,
			java.lang.Integer passengerCount,
			java.lang.String claimNumber,
			com.myteam.tts_connected_claims.customerDetails customerDetails,
			com.myteam.tts_connected_claims.policyDetails policyDetails,
			com.myteam.tts_connected_claims.vehicleDetails vehicleDetails,
			com.myteam.tts_connected_claims.vehicleInnerDamage vehicleInnerDamage,
			java.lang.String incidentId,
			com.myteam.tts_connected_claims.serviceOffering ambulanceServices,
			com.myteam.tts_connected_claims.serviceOffering towingServices,
			com.myteam.tts_connected_claims.serviceOffering roadsideAssistServices,
			com.myteam.tts_connected_claims.serviceOffering taxiServices,
			com.myteam.tts_connected_claims.serviceOffering carHireServices,
			java.lang.String incidentDriverOther,
			java.lang.String speakingToOther,
			java.lang.String vehicleIncidentSubType,
			java.lang.String vehicleIncidentType,
			java.lang.String carHireEligibility,
			com.myteam.tts_connected_claims.contactDetail primaryContactDetails,
			java.util.List<com.myteam.tts_connected_claims.contactDetail> secondaryContactDetails,
			java.lang.String medicalDetails,
			java.lang.String creator,
			java.lang.String owner,
			java.lang.String processId,
			java.lang.String containerId,
			java.lang.Long processInstanceId,
			java.lang.String caseStatus,
			java.lang.String medicalService,
			java.util.List<com.myteam.tts_connected_claims.thirdPartyDetails> thirdPartyDetails,
			java.lang.String group, java.lang.Boolean enableIncidentServices,
			java.lang.String drivableUpdateReason) {
		this.incidentTime = incidentTime;
		this.location = location;
		this.description = description;
		this.triggerSource = triggerSource;
		this.incidentType = incidentType;
		this.riskItem = riskItem;
		this.drivable = drivable;
		this.incidentDriver = incidentDriver;
		this.speakingTo = speakingTo;
		this.passengerCount = passengerCount;
		this.claimNumber = claimNumber;
		this.customerDetails = customerDetails;
		this.policyDetails = policyDetails;
		this.vehicleDetails = vehicleDetails;
		this.vehicleInnerDamage = vehicleInnerDamage;
		this.incidentId = incidentId;
		this.ambulanceServices = ambulanceServices;
		this.towingServices = towingServices;
		this.roadsideAssistServices = roadsideAssistServices;
		this.taxiServices = taxiServices;
		this.carHireServices = carHireServices;
		this.incidentDriverOther = incidentDriverOther;
		this.speakingToOther = speakingToOther;
		this.vehicleIncidentSubType = vehicleIncidentSubType;
		this.vehicleIncidentType = vehicleIncidentType;
		this.carHireEligibility = carHireEligibility;
		this.primaryContactDetails = primaryContactDetails;
		this.secondaryContactDetails = secondaryContactDetails;
		this.medicalDetails = medicalDetails;
		this.creator = creator;
		this.owner = owner;
		this.processId = processId;
		this.containerId = containerId;
		this.processInstanceId = processInstanceId;
		this.caseStatus = caseStatus;
		this.medicalService = medicalService;
		this.thirdPartyDetails = thirdPartyDetails;
		this.group = group;
		this.enableIncidentServices = enableIncidentServices;
		this.drivableUpdateReason = drivableUpdateReason;
	}

	public com.myteam.tts_connected_claims.vehicleOuterDamage getVehicleOuterDamage() {
		return this.vehicleOuterDamage;
	}

	public void setVehicleOuterDamage(
			com.myteam.tts_connected_claims.vehicleOuterDamage vehicleOuterDamage) {
		this.vehicleOuterDamage = vehicleOuterDamage;
	}

	public java.lang.String getCaseTime() {
		return this.caseTime;
	}

	public void setCaseTime(java.lang.String caseTime) {
		this.caseTime = caseTime;
	}

	public java.lang.String getAgentName() {
		return this.agentName;
	}

	public void setAgentName(java.lang.String agentName) {
		this.agentName = agentName;
	}

	public java.lang.String getDrivableReasonOther() {
		return this.drivableReasonOther;
	}

	public void setDrivableReasonOther(java.lang.String drivableReasonOther) {
		this.drivableReasonOther = drivableReasonOther;
	}

	public java.lang.String getIncidentDriverAssociation() {
		return this.incidentDriverAssociation;
	}

	public void setIncidentDriverAssociation(
			java.lang.String incidentDriverAssociation) {
		this.incidentDriverAssociation = incidentDriverAssociation;
	}

	public java.lang.String getRiskitemSequenceNo() {
		return this.riskitemSequenceNo;
	}

	public void setRiskitemSequenceNo(java.lang.String riskitemSequenceNo) {
		this.riskitemSequenceNo = riskitemSequenceNo;
	}

	public java.lang.String getSpeakingToDisplayValue() {
		return this.speakingToDisplayValue;
	}

	public void setSpeakingToDisplayValue(
			java.lang.String speakingToDisplayValue) {
		this.speakingToDisplayValue = speakingToDisplayValue;
	}

	public incidentDetails(
			java.lang.String incidentTime,
			java.lang.String location,
			java.lang.String description,
			java.lang.String triggerSource,
			java.lang.String incidentType,
			java.lang.String riskItem,
			java.lang.String drivable,
			java.lang.String incidentDriver,
			java.lang.String speakingTo,
			java.lang.Integer passengerCount,
			java.lang.String claimNumber,
			com.myteam.tts_connected_claims.customerDetails customerDetails,
			com.myteam.tts_connected_claims.policyDetails policyDetails,
			com.myteam.tts_connected_claims.vehicleDetails vehicleDetails,
			java.lang.String incidentId,
			com.myteam.tts_connected_claims.serviceOffering ambulanceServices,
			com.myteam.tts_connected_claims.serviceOffering towingServices,
			com.myteam.tts_connected_claims.serviceOffering roadsideAssistServices,
			com.myteam.tts_connected_claims.serviceOffering taxiServices,
			com.myteam.tts_connected_claims.serviceOffering carHireServices,
			java.lang.String incidentDriverOther,
			java.lang.String speakingToOther,
			java.lang.String vehicleIncidentSubType,
			java.lang.String vehicleIncidentType,
			java.lang.String carHireEligibility,
			com.myteam.tts_connected_claims.contactDetail primaryContactDetails,
			java.util.List<com.myteam.tts_connected_claims.contactDetail> secondaryContactDetails,
			java.lang.String medicalDetails,
			java.lang.String creator,
			java.lang.String owner,
			java.lang.String processId,
			java.lang.String containerId,
			java.lang.Long processInstanceId,
			java.lang.String caseStatus,
			java.lang.String medicalService,
			java.util.List<com.myteam.tts_connected_claims.thirdPartyDetails> thirdPartyDetails,
			java.lang.String group,
			java.lang.Boolean enableIncidentServices,
			com.myteam.tts_connected_claims.vehicleInnerDamage vehicleInnerDamage,
			java.lang.String drivableUpdateReason,
			com.myteam.tts_connected_claims.vehicleOuterDamage vehicleOuterDamage,
			java.lang.String caseTime, java.lang.String agentName,
			java.lang.String drivableReasonOther,
			java.lang.String incidentDriverAssociation,
			java.lang.String riskitemSequenceNo,
			java.lang.String speakingToDisplayValue) {
		this.incidentTime = incidentTime;
		this.location = location;
		this.description = description;
		this.triggerSource = triggerSource;
		this.incidentType = incidentType;
		this.riskItem = riskItem;
		this.drivable = drivable;
		this.incidentDriver = incidentDriver;
		this.speakingTo = speakingTo;
		this.passengerCount = passengerCount;
		this.claimNumber = claimNumber;
		this.customerDetails = customerDetails;
		this.policyDetails = policyDetails;
		this.vehicleDetails = vehicleDetails;
		this.incidentId = incidentId;
		this.ambulanceServices = ambulanceServices;
		this.towingServices = towingServices;
		this.roadsideAssistServices = roadsideAssistServices;
		this.taxiServices = taxiServices;
		this.carHireServices = carHireServices;
		this.incidentDriverOther = incidentDriverOther;
		this.speakingToOther = speakingToOther;
		this.vehicleIncidentSubType = vehicleIncidentSubType;
		this.vehicleIncidentType = vehicleIncidentType;
		this.carHireEligibility = carHireEligibility;
		this.primaryContactDetails = primaryContactDetails;
		this.secondaryContactDetails = secondaryContactDetails;
		this.medicalDetails = medicalDetails;
		this.creator = creator;
		this.owner = owner;
		this.processId = processId;
		this.containerId = containerId;
		this.processInstanceId = processInstanceId;
		this.caseStatus = caseStatus;
		this.medicalService = medicalService;
		this.thirdPartyDetails = thirdPartyDetails;
		this.group = group;
		this.enableIncidentServices = enableIncidentServices;
		this.vehicleInnerDamage = vehicleInnerDamage;
		this.drivableUpdateReason = drivableUpdateReason;
		this.vehicleOuterDamage = vehicleOuterDamage;
		this.caseTime = caseTime;
		this.agentName = agentName;
		this.drivableReasonOther = drivableReasonOther;
		this.incidentDriverAssociation = incidentDriverAssociation;
		this.riskitemSequenceNo = riskitemSequenceNo;
		this.speakingToDisplayValue = speakingToDisplayValue;
	}

}