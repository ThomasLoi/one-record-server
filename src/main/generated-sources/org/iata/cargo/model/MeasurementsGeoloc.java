
package org.iata.cargo.model;

import java.io.Serializable;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import org.iata.cargo.Vocabulary;


/**
 * Measurements details for Geolocation sensors
 * 
 * This class was generated by OWL2Java 0.17.2
 * 
 */
@OWLClass(iri = Vocabulary.s_c_MeasurementsGeoloc)
public class MeasurementsGeoloc
    extends Measurements
    implements Serializable
{

    /**
     * Geolocation measurements details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_geolocationMeasurement)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected Geolocation geolocationMeasurement;

    public void setGeolocationMeasurement(Geolocation geolocationMeasurement) {
        this.geolocationMeasurement = geolocationMeasurement;
    }

    public Geolocation getGeolocationMeasurement() {
        return geolocationMeasurement;
    }

}