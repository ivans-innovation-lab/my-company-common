package com.idugalic.common.team.event;

import com.idugalic.common.event.AuditableAbstractEvent;
import com.idugalic.common.model.AuditEntry;

public class MemberRemovedFromTeamEvent extends AuditableAbstractEvent {

    private static final long serialVersionUID = 8894380375023480978L;
    private String memberId;
   
    public MemberRemovedFromTeamEvent() {
    }

    public MemberRemovedFromTeamEvent(String id, AuditEntry auditEntry, String memberId) {
        super(id, auditEntry);
        this.memberId = memberId;
    }

	public String getMemberId() {
		return memberId;
	}

}
