
package org.iata.cargo.model;

import java.io.Serializable;
import java.util.Date;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import org.iata.cargo.Vocabulary;


/**
 * Scheduling details
 * 
 * This class was generated by OWL2Java 0.17.2
 * 
 */
@OWLClass(iri = Vocabulary.s_c_Schedule)
public class Schedule
    extends LogisticsObject
    implements Serializable
{

    /**
     * arliest acceptance date time (requested or proposed)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_earliestAcceptanceTime_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#dateTime", max = 1)
    })
    protected Date earliestAcceptanceTime;
    /**
     * Latest Acceptance time as per CargoIQ definition (requested, proposed or actual)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_latestAcceptanceTime_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String latestAcceptanceTime;
    /**
     * Time of availability of the shipment as per CargoIQ definition
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_timeOfAvailability_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String timeOfAvailability;
    /**
     * Total transit time as per CargoIQ definition
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_totalTransitTime_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String totalTransitTime;

    public void setEarliestAcceptanceTime(Date earliestAcceptanceTime) {
        this.earliestAcceptanceTime = earliestAcceptanceTime;
    }

    public Date getEarliestAcceptanceTime() {
        return earliestAcceptanceTime;
    }

    public void setLatestAcceptanceTime(String latestAcceptanceTime) {
        this.latestAcceptanceTime = latestAcceptanceTime;
    }

    public String getLatestAcceptanceTime() {
        return latestAcceptanceTime;
    }

    public void setTimeOfAvailability(String timeOfAvailability) {
        this.timeOfAvailability = timeOfAvailability;
    }

    public String getTimeOfAvailability() {
        return timeOfAvailability;
    }

    public void setTotalTransitTime(String totalTransitTime) {
        this.totalTransitTime = totalTransitTime;
    }

    public String getTotalTransitTime() {
        return totalTransitTime;
    }

}