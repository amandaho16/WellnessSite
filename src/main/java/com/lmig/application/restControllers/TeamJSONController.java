package com.lmig.application.restControllers;

import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lmig.application.entities.Member;
import com.lmig.application.entities.Team;
import com.lmig.application.entities.WellnessEvent;
import com.lmig.application.repositories.TeamRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value="Teams", description="JSON operations pertaining to WellnessSite Teams")
public class TeamJSONController {
		
	@Autowired
	private TeamRepository teamRepository;
	
	/**
	 * Accepts a JSON Team object with teamName and description set, defaults to active = true. 
	 * returns JSON Team object with auto-generated ID.
	 *
	 * @param addingTeam   A Team object with values for teamName and description.
	 * @return             returnedTeam with ID set
	 * @see                Team
	 */
	@ApiOperation(value = "Adds a new team")
	@RequestMapping(path = "/team/", method = RequestMethod.POST)
	public Team addTeam(@RequestBody @Valid Team addingTeam) {
		addingTeam.setActive(true);
		addingTeam.setPublishable(true);
		Team returnedTeam = teamRepository.save(addingTeam);
		return returnedTeam;
	}
//	/**
//	 * Given a list of Members and a Team ID, add the Members to that Team. 
//	 *
//	 * @param memberList A list of Members to add a Member to.
//	 * @param memberID  A valid int Member ID
//	 * @see             Member
//	 * @see             WellnessEvent
//	 */
//	@ApiOperation(value = "Adds a Member to a set of WellnessEvents")
//	@RequestMapping(path = "/api/addMemberToEvent/{memberID}", method = RequestMethod.PUT)
//	public void addMemberToEvents(@PathVariable Integer memberID, @RequestBody Set<WellnessEvent> eventList) {
//	    Member addingMember = memberRepository.findOne(memberID); 
//		for (WellnessEvent we : eventList) {
//		    WellnessEvent weAdding = wellnessEventRepository.findOne(we.getId());
//			weAdding.addMember(addingMember);  
//			wellnessEventRepository.saveAndFlush(weAdding);
//		}
//	}

}
