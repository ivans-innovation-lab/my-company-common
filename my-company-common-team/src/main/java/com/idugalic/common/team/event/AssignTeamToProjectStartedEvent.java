package com.idugalic.common.team.event;

import com.idugalic.common.event.AuditableAbstractEvent;
import com.idugalic.common.model.AuditEntry;

public class AssignTeamToProjectStartedEvent extends AuditableAbstractEvent {

    private static final long serialVersionUID = 1594382475023480978L;

    private String projectId;
   

    public AssignTeamToProjectStartedEvent() {
    }

    public AssignTeamToProjectStartedEvent(String id, AuditEntry auditEntry, String projectId) {
        super(id, auditEntry);
        this.projectId = projectId;
    }

	public String getProjectId() {
		return projectId;
	}

}
