
package org.iata.cargo.model;

import java.io.Serializable;
import java.util.Set;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import org.iata.cargo.Vocabulary;


/**
 * Sensor measurements details for sensors other than Geolocation sensors (sensorType != "Geolocation")
 * 
 * This class was generated by OWL2Java 0.17.2
 * 
 */
@OWLClass(iri = Vocabulary.s_c_SensorOther)
public class SensorOther
    extends Sensor
    implements Serializable
{

    /**
     * Reference to the measurements recorded by the sensor
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_val_A)
    protected Set<MeasurementsOther> val;

    public void setVal(Set<MeasurementsOther> val) {
        this.val = val;
    }

    public Set<MeasurementsOther> getVal() {
        return val;
    }

}
