package org.greenscape.core.model;

import java.io.Serializable;

/**
 * 
 * @author Sheikh Sajid
 * 
 */
public interface PersistedModel extends DocumentModel, AuditedModel, Serializable {
	String ORGANIZATION_ID = "organizationId";

	String getOrganizationId();

	PersistedModel setOrganizationId(String organizationId);
}
